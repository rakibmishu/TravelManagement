/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Login_page extends javax.swing.JFrame {
   Connection con = null;
   PreparedStatement pstm= null;
   ResultSet rs= null;
   
    
    public Login_page() {
        initComponents();
        con= Database_Connection.DbConn();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlblHeading = new javax.swing.JLabel();
        jlblSubHeading = new javax.swing.JLabel();
        LogIn = new javax.swing.JLabel();
        jlblHere = new javax.swing.JLabel();
        jlblUser = new javax.swing.JLabel();
        jlblPassword = new javax.swing.JLabel();
        jtxtUserName = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jbtnSignIn = new javax.swing.JButton();
        jbtnSignUp = new javax.swing.JButton();
        jbtnForgotPassword = new javax.swing.JButton();
        jbtnShowPassword = new javax.swing.JButton();
        jlblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jlblHeading.setFont(new java.awt.Font("Valdemar", 3, 24)); // NOI18N
        jlblHeading.setForeground(new java.awt.Color(102, 0, 102));
        jlblHeading.setText("SopnoVubon");
        jPanel1.add(jlblHeading);
        jlblHeading.setBounds(150, 10, 210, 24);

        jlblSubHeading.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jlblSubHeading.setForeground(new java.awt.Color(0, 0, 255));
        jlblSubHeading.setText("A Promissing Travel Agency");
        jPanel1.add(jlblSubHeading);
        jlblSubHeading.setBounds(120, 40, 270, 22);

        LogIn.setBackground(new java.awt.Color(0, 153, 0));
        LogIn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LogIn.setForeground(new java.awt.Color(0, 153, 0));
        LogIn.setText("Sign In");
        jPanel1.add(LogIn);
        LogIn.setBounds(20, 170, 70, 22);

        jlblHere.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblHere.setForeground(new java.awt.Color(0, 0, 153));
        jlblHere.setText("Here");
        jPanel1.add(jlblHere);
        jlblHere.setBounds(90, 170, 60, 20);

        jlblUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblUser.setForeground(new java.awt.Color(0, 0, 153));
        jlblUser.setText("User Name   :");
        jPanel1.add(jlblUser);
        jlblUser.setBounds(10, 250, 100, 17);

        jlblPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblPassword.setForeground(new java.awt.Color(0, 0, 153));
        jlblPassword.setText("Password     :");
        jPanel1.add(jlblPassword);
        jlblPassword.setBounds(10, 280, 100, 14);

        jtxtUserName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtUserName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 2, true));
        jPanel1.add(jtxtUserName);
        jtxtUserName.setBounds(130, 250, 190, 19);

        jPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 2, true));
        jPanel1.add(jPassword);
        jPassword.setBounds(130, 280, 190, 19);

        jbtnSignIn.setBackground(new java.awt.Color(0, 204, 51));
        jbtnSignIn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnSignIn.setForeground(new java.awt.Color(0, 0, 153));
        jbtnSignIn.setText("Sign In");
        jbtnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSignInActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnSignIn);
        jbtnSignIn.setBounds(70, 330, 90, 25);

        jbtnSignUp.setBackground(new java.awt.Color(51, 255, 51));
        jbtnSignUp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnSignUp.setForeground(new java.awt.Color(0, 0, 153));
        jbtnSignUp.setText("Sign Up");
        jbtnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSignUpActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnSignUp);
        jbtnSignUp.setBounds(180, 330, 90, 25);

        jbtnForgotPassword.setBackground(new java.awt.Color(51, 255, 0));
        jbtnForgotPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnForgotPassword.setForeground(new java.awt.Color(0, 0, 204));
        jbtnForgotPassword.setText("Forgot Password");
        jbtnForgotPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbtnForgotPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnForgotPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnForgotPassword);
        jbtnForgotPassword.setBounds(20, 370, 151, 25);

        jbtnShowPassword.setBackground(new java.awt.Color(102, 255, 0));
        jbtnShowPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnShowPassword.setForeground(new java.awt.Color(0, 0, 153));
        jbtnShowPassword.setText("Show password");
        jPanel1.add(jbtnShowPassword);
        jbtnShowPassword.setBounds(170, 370, 150, 25);

        jlblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ExamProject/green_leaf_with_halation_background_vector_543130.jpg"))); // NOI18N
        jPanel1.add(jlblImage);
        jlblImage.setBounds(10, 60, 490, 350);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(519, 458));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSignInActionPerformed
       try{
       String sql = "select * from signin where name = ? and Password = ?";
       pstm= con.prepareStatement(sql);
       pstm.setString(1, jtxtUserName.getText());
       pstm.setString(2, jPassword.getText());
       rs= pstm.executeQuery();
       if(rs.next()){
       setVisible(false);
       Main_Form mf = new Main_Form();
       mf.setVisible(true);
       }
       else{
       JOptionPane.showMessageDialog(null, "User Name & Password is incorrect");
       }
       
       }catch(Exception e){
       JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_jbtnSignInActionPerformed

    private void jbtnForgotPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnForgotPasswordActionPerformed
       //setVisible(false);
       ForgotPassword fp = new ForgotPassword();
       fp.setVisible(true);
    }//GEN-LAST:event_jbtnForgotPasswordActionPerformed

    private void jbtnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSignUpActionPerformed
       //setVisible(false);
       SignUp su = new SignUp();
       su.setVisible(true);
    }//GEN-LAST:event_jbtnSignUpActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogIn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JButton jbtnForgotPassword;
    private javax.swing.JButton jbtnShowPassword;
    private javax.swing.JButton jbtnSignIn;
    private javax.swing.JButton jbtnSignUp;
    private javax.swing.JLabel jlblHeading;
    private javax.swing.JLabel jlblHere;
    private javax.swing.JLabel jlblImage;
    private javax.swing.JLabel jlblPassword;
    private javax.swing.JLabel jlblSubHeading;
    private javax.swing.JLabel jlblUser;
    private javax.swing.JTextField jtxtUserName;
    // End of variables declaration//GEN-END:variables
}