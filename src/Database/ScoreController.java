/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

/**
 *
 * @author ADMIN
 */
import static Database.AuthenticationController.getUserId;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ScoreController {
	
	public static boolean setScore(int final_score, int diffiuilty_id) {
		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "insert into score(final_score,user_id,difficuilty_id) values (?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(query);

			pstmt.setInt(1, final_score);
			pstmt.setInt(2, getUserId());
			pstmt.setInt(3, diffiuilty_id);

			int rowsAffected = pstmt.executeUpdate();
			return rowsAffected > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}	

	   // Inner class to represent a leaderboard entry
    public static class LeaderboardEntry {
        private String username;
        private int score;
        private String level;
        
        public LeaderboardEntry(String username, int score, String level) {
            this.username = username;
            this.score = score;
            this.level = level;
        }
        
        public String getUsername() { return username; }
        public int getScore() { return score; }
        public String getLevel() { return level; }
    }

	public static List<LeaderboardEntry> getAllLeaderboardData(int user_id) {

		List<LeaderboardEntry> leaderboard = new ArrayList<>();
		try (Connection conn = DatabaseConnection.getConnection()){
			String querry = "select * from score where user_id = ?";
			PreparedStatement stmt = conn.prepareStatement(querry); 
			stmt.setInt(1, user_id);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				LeaderboardEntry entry = new LeaderboardEntry(
					AuthenticationController.getNickName(),
					rs.getInt("final_score"),
					rs.getString("difficuilty_id")
				);
				leaderboard.add(entry);
			}
		} catch (SQLException e) {
			return null;
		}
		return leaderboard;
	}

	// Method to fetch leaderboard data by difficulty level
	public static List<LeaderboardEntry> getLeaderboardByLevel(String level,int user_id) {
		List<LeaderboardEntry> leaderboard = new ArrayList<>();

		try (
			Connection conn = DatabaseConnection.getConnection()){	
			PreparedStatement stmt = conn.prepareStatement("select * from score where difficuilty_id = ? and user_id = ? ");
			stmt.setInt(1, Integer.parseInt(level));
			stmt.setInt(2, user_id);

			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					LeaderboardEntry entry = new LeaderboardEntry(
					AuthenticationController.getNickName(),
						rs.getInt("final_score"),
						rs.getString("difficuilty_id")
						
					);
					leaderboard.add(entry);
				}
			}
		} catch (SQLException e) {
			return null;
		}
		return leaderboard;
	}
}
