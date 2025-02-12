
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import Database.AuthenticationController;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**a
 *
 * @author ADMIN
 */
public class MenuPage extends javax.swing.JFrame {

    /**
      Creates new form MenuPage
     */
    public MenuPage() {
        initComponents();
        checkboxEasy.setSelected(true); 
displayStartNick();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                gametTitleImage = new javax.swing.JLabel();
                GameModePannel = new javax.swing.JPanel();
                checkboxEasy = new javax.swing.JCheckBox();
                mediumButton = new javax.swing.JCheckBox();
                hardButton = new javax.swing.JCheckBox();
                playButton = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                controlsButton = new javax.swing.JButton();
                scoreButton = new javax.swing.JButton();
                usernamePannel = new javax.swing.JPanel();
                usernameLabel = new javax.swing.JLabel();
                nickname_input = new javax.swing.JTextField();
                profileButton = new javax.swing.JButton();
                backtoLoginButton = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setResizable(false);
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                ImageIcon titleIcon = new ImageIcon(getClass().getResource("/GameImage/Screenshot_2024-12-06_165930-removebg-preview.png"));
                ImageIcon scaledTitleIcon = new ImageIcon(titleIcon.getImage().getScaledInstance(
                        titleIcon.getIconWidth() / 2, // Half the original width
                        titleIcon.getIconHeight() / 2, // Half the original height
                        Image.SCALE_SMOOTH));
        gametTitleImage.setIcon(scaledTitleIcon);
        getContentPane().add(gametTitleImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        GameModePannel.setOpaque(false);
        GameModePannel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        checkboxEasy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        checkboxEasy.setForeground(new java.awt.Color(0, 255, 0));
        checkboxEasy.setText("Easy");
        checkboxEasy.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                        checkboxEasyActionPerformed(evt);
                }
        });

        mediumButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mediumButton.setForeground(new java.awt.Color(255, 255, 0));
        mediumButton.setText("Medium");
        mediumButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                        mediumButtonActionPerformed(evt);
                }
        });

        hardButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        hardButton.setForeground(new java.awt.Color(255, 0, 51));
        hardButton.setText("Hard");
        hardButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                        hardButtonActionPerformed(evt);
                }
        });

        javax.swing.GroupLayout GameModePannelLayout = new javax.swing.GroupLayout(GameModePannel);
        GameModePannel.setLayout(GameModePannelLayout);
        GameModePannelLayout.setHorizontalGroup(
                GameModePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(GameModePannelLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(GameModePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(hardButton)
                                .addComponent(mediumButton)
                                .addComponent(checkboxEasy))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        GameModePannelLayout.setVerticalGroup(
                GameModePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(GameModePannelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(checkboxEasy)
                        .addGap(18, 18, 18)
                        .addComponent(mediumButton)
                        .addGap(18, 18, 18)
                        .addComponent(hardButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(GameModePannel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 260, 200));

        playButton.setBackground(new java.awt.Color(0, 255, 51));
        playButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playButton.setForeground(new java.awt.Color(255, 255, 255));
        playButton.setText("Play");
        playButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                        playButtonMouseClicked(evt);
                }
        });
        getContentPane().add(playButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 90, 40));

        jButton2.setText("jButton1");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 90, 40));

        controlsButton.setBackground(new java.awt.Color(0, 255, 51));
        controlsButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        controlsButton.setForeground(new java.awt.Color(255, 255, 255));
        controlsButton.setText("Controls");
        controlsButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                        controlsButtonActionPerformed(evt);
                }
        });
        getContentPane().add(controlsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, -1, 40));

        scoreButton.setBackground(new java.awt.Color(0, 255, 0));
        scoreButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        scoreButton.setForeground(new java.awt.Color(255, 255, 255));
        scoreButton.setText("Scores");
        scoreButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                        scoreButtonMouseClicked(evt);
                }
        });
        getContentPane().add(scoreButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 90, 40));

        usernamePannel.setBackground(new java.awt.Color(0, 255, 51));

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("UserName");

        nickname_input.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        javax.swing.GroupLayout usernamePannelLayout = new javax.swing.GroupLayout(usernamePannel);
        usernamePannel.setLayout(usernamePannelLayout);
        usernamePannelLayout.setHorizontalGroup(
                usernamePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(usernamePannelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nickname_input, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
        );
        usernamePannelLayout.setVerticalGroup(
                usernamePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(usernamePannelLayout.createSequentialGroup()
                        .addComponent(usernameLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(nickname_input, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        getContentPane().add(usernamePannel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 260, 20));

        profileButton.setBackground(new java.awt.Color(0, 255, 51));
        profileButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        profileButton.setForeground(new java.awt.Color(255, 255, 255));
        profileButton.setText("Profile");
        profileButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                        profileButtonActionPerformed(evt);
                }
        });
        getContentPane().add(profileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 100, 40));

        backtoLoginButton.setBackground(new java.awt.Color(0, 0, 0));
        backtoLoginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backToLogin.png"))); // NOI18N
        backtoLoginButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                        backtoLoginButtonActionPerformed(evt);
                }
        });
        getContentPane().add(backtoLoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GameImage/bg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 580));

        pack();
        setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButtonActionPerformed
        // TODO add your handling code here:
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfilePage().setVisible(true);
            }
        });
		this.dispose(); 
    }//GEN-LAST:event_profileButtonActionPerformed

    private void controlsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controlsButtonActionPerformed
   java.awt.EventQueue.invokeLater(() -> {
        new Controls().setVisible(true);
    });

    // Dispose the current MenuPage frame
    this.dispose();
    }//GEN-LAST:event_controlsButtonActionPerformed

        private void scoreButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scoreButtonMouseClicked
                // TODO add your handling code here:
		new Leaderboard().setVisible(true); 
		this.dispose();
        }//GEN-LAST:event_scoreButtonMouseClicked

        private void backtoLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtoLoginButtonActionPerformed
                // TODO add your handling code here:
		new LoginPage().setVisible(true);
		this.dispose();
        }//GEN-LAST:event_backtoLoginButtonActionPerformed

    private void mediumButtonActionPerformed(java.awt.event.ActionEvent evt) {
        mediumButton.setSelected(true);
        checkboxEasy.setSelected(false);
        hardButton.setSelected(false);
    }// GEN-LAST:event_mediumButtonActionPerformed

    private void hardButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_hardButtonActionPerformed
        hardButton.setSelected(true);
        checkboxEasy.setSelected(false);
        mediumButton.setSelected(false);
    }// GEN-LAST:event_hardButtonActionPerformed

    private void checkboxEasyActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_checkboxEasyActionPerformed
        checkboxEasy.setSelected(true);
        mediumButton.setSelected(false);
        hardButton.setSelected(false);
    }// GEN-LAST:event_checkboxEasyActionPerformed

    public void displayStartNick() {
	    String nickname = AuthenticationController.getNickName();
	    System.out.println(nickname);
	    nickname_input.setText(nickname);
    }

    private void playButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_playButtonMouseClicked
        String username = nickname_input.getText();
        // TODO add your handling code here:
        if (username.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Username must be entered!", "Input Error", JOptionPane.WARNING_MESSAGE);
        return; 
    }

	boolean success = AuthenticationController.changeNickName(username);

	if(!success){
		JOptionPane.showMessageDialog(this, "some went wrong on nickname");
	}

        this.dispose(); 

        // Create and show the game window
        int rowCount = 21;
        int columnCount = 19;
        int tileSize = 32;
        int boardWidth = columnCount * tileSize;
        int boardHeight = rowCount * tileSize;

        JFrame frame = new JFrame("Viman");
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
// Determine the selected game mode
    JPanel gamePanel;
    
    if (checkboxEasy.isSelected()) {
        gamePanel = new VimanEasy(username);  // Load Easy Mode
    } else if (mediumButton.isSelected()) {
        gamePanel = new VimanMedium(username); // Load Medium Mode
    } else if (hardButton.isSelected()) {
        gamePanel = new VimanHard(username); // Load Hard Mode
    } else {
        // Default to Easy Mode if no selection is made
        gamePanel = new VimanEasy(username);
    }

    frame.add(gamePanel);
    frame.pack();
    gamePanel.requestFocus();
    frame.setVisible(true);
    }// GEN-LAST:event_playButtonMouseClicked

    private void enterNameTextAreaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_enterNameTextAreaActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_enterNameTextAreaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPage().setVisible(true);
            }
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JPanel GameModePannel;
        private javax.swing.JButton backtoLoginButton;
        private javax.swing.JCheckBox checkboxEasy;
        private javax.swing.JButton controlsButton;
        private javax.swing.JLabel gametTitleImage;
        private javax.swing.JCheckBox hardButton;
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JCheckBox mediumButton;
        private javax.swing.JTextField nickname_input;
        private javax.swing.JButton playButton;
        private javax.swing.JButton profileButton;
        private javax.swing.JButton scoreButton;
        private javax.swing.JLabel usernameLabel;
        private javax.swing.JPanel usernamePannel;
        // End of variables declaration//GEN-END:variables

}
