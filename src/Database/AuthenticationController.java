/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

/**
 *
 * @author ADMIN
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AuthenticationController {

 private static int currentUserId = 1;
 public static String currentnickName = null;


 public static int getUserId(){
	 return currentUserId;
 };
	public static boolean registerUser(String userName,String password, String securityQuestion
		)	
	{
		String hashedPassword = hashPassword(password);

		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "INSERT INTO users (username,password,security_question,nickname) VALUES (?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(query);

			pstmt.setString(1, userName);
			pstmt.setString(2,hashedPassword);
			pstmt.setString(3, securityQuestion);
			pstmt.setString(4, userName);

			int rowsAffected = pstmt.executeUpdate();
			return rowsAffected > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	// Simple password hashing (Note: Use a more secure method in production)
	private static String hashPassword(String password) {
		return String.valueOf(password.hashCode());
	}

	// Login Method
	public static boolean loginUser(String username, String password) {
		String hashedPassword = hashPassword(password);
		System.out.println(hashedPassword);
		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "SELECT id, username,nickname  FROM users WHERE username = ? AND password = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, username);
			pstmt.setString(2, hashedPassword);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				currentUserId = rs.getInt("id");
				currentnickName = rs.getString("nickname");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}

		public static boolean updateQuestion(String question) {
		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "UPDATE users SET security_question  = ? WHERE id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);

			pstmt.setString(1, question);
			pstmt.setInt(2, getUserId());

			int rowsAffected = pstmt.executeUpdate();
			return rowsAffected > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public static boolean DeleteAccount() {
		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "DELETE from users where id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);

			pstmt.setInt(1, getUserId());

			int rowsAffected = pstmt.executeUpdate();
			return rowsAffected > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public static String getNickName(){
		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "select nickname from users where id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);

			pstmt.setInt(1, getUserId());
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				 return rs.getString("nickname");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}

	public static boolean changeNickName(String nickname){
		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "update users set nickname = ? where id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);

			pstmt.setString(1, nickname);
			pstmt.setInt(2, getUserId());

			int rowsAffected = pstmt.executeUpdate();
			return rowsAffected > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	

	public static boolean forgotPassword(String username, String question, String newpassword) {
		try (Connection conn = DatabaseConnection.getConnection()) {
			// Step 1: Verify user and security question
			String query = "SELECT * FROM users WHERE username = ? AND security_question = ?";
			try (PreparedStatement pstmt = conn.prepareStatement(query)) {
				pstmt.setString(1, username);
				pstmt.setString(2, question); // Corrected index

				ResultSet rs = pstmt.executeQuery(); // Use executeQuery for SELECT

				// Step 2: Check if user exists
				if (rs.next()) {
					// Step 3: Update password
					String query1 = "UPDATE users SET password = ? WHERE username = ?";
					try (PreparedStatement pstmt2 = conn.prepareStatement(query1)) {
						pstmt2.setString(1, hashPassword(newpassword)); // Hashing the password
						pstmt2.setString(2, username); // Corrected index

						int rowsAffected2 = pstmt2.executeUpdate();
						return rowsAffected2 > 0; // Return true if update was successful
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return false; // Return false if user not found or any error occurs
	}
}