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

/**
 *
 * @author hp
 */
public class SignUp extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs= null;
    PreparedStatement pstm = null;
    
    
    /**
     * Creates new form SignUp
     */
    public SignUp() {
        super("Sign Up");
        initComponents();
        con = Database_Connection.DbConn();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jlblUser = new javax.swing.JLabel();
        jlblFather = new javax.swing.JLabel();
        jtxtAge = new javax.swing.JTextField();
        jtxtFather = new javax.swing.JTextField();
        jtxtUserName = new javax.swing.JTextField();
        jlblAge = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jtxtName = new javax.swing.JTextField();
        jbtnBack = new javax.swing.JButton();
        jlblPassword = new javax.swing.JLabel();
        jbtnRegister = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jlblSecurity = new javax.swing.JLabel();
        jcmbSecurity = new javax.swing.JComboBox<>();
        jlblPassword1 = new javax.swing.JLabel();
        jConfirmPassword = new javax.swing.JPasswordField();
        jlblMobile = new javax.swing.JLabel();
        jtxtMobile = new javax.swing.JTextField();
        jtxtAns = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Heading = new javax.swing.JLabel();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 2, true), "Sign Up", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(204, 0, 0))); // NOI18N

        jlblUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblUser.setForeground(new java.awt.Color(0, 153, 0));
        jlblUser.setText("User Name");

        jlblFather.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblFather.setForeground(new java.awt.Color(0, 153, 0));
        jlblFather.setText("Father Name");

        jtxtAge.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtAge.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));

        jtxtFather.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtFather.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 153), 2, true));

        jtxtUserName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtUserName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));

        jlblAge.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblAge.setForeground(new java.awt.Color(0, 0, 153));
        jlblAge.setText("Age");

        jPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });

        jtxtName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 2, true));
        jtxtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtNameFocusGained(evt);
            }
        });

        jbtnBack.setBackground(new java.awt.Color(102, 204, 0));
        jbtnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnBack.setForeground(new java.awt.Color(0, 0, 153));
        jbtnBack.setText("Back");
        jbtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackActionPerformed(evt);
            }
        });

        jlblPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblPassword.setForeground(new java.awt.Color(0, 0, 153));
        jlblPassword.setText("Password");

        jbtnRegister.setBackground(new java.awt.Color(102, 204, 0));
        jbtnRegister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnRegister.setForeground(new java.awt.Color(0, 0, 153));
        jbtnRegister.setText("Register");
        jbtnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegisterActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Name");

        jlblSecurity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblSecurity.setForeground(new java.awt.Color(0, 0, 153));
        jlblSecurity.setText("Security Question");

        jcmbSecurity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "What is your father name?", "who is your favourite teacher?", "which is your favourite book?" }));
        jcmbSecurity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));

        jlblPassword1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblPassword1.setForeground(new java.awt.Color(0, 153, 0));
        jlblPassword1.setText(" Confirm Password");

        jConfirmPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));

        jlblMobile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblMobile.setForeground(new java.awt.Color(0, 153, 0));
        jlblMobile.setText("Mobile No");

        jtxtMobile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtMobile.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 153), 2, true));
        jtxtMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtMobileActionPerformed(evt);
            }
        });

        jtxtAns.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 2));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("Answer");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblFather)
                            .addComponent(jlblAge))
                        .addGap(238, 238, 238)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtFather, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jlblMobile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblSecurity)
                            .addComponent(jlblUser)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcmbSecurity, 0, 195, Short.MAX_VALUE)
                            .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtAns))))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblPassword)
                    .addComponent(jlblPassword1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jbtnRegister)
                        .addGap(35, 35, 35)
                        .addComponent(jbtnBack)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblFather)
                    .addComponent(jtxtFather, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblAge)
                    .addComponent(jtxtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblMobile)
                    .addComponent(jtxtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblSecurity)
                    .addComponent(jcmbSecurity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtAns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblUser)
                    .addComponent(jtxtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblPassword)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblPassword1)
                    .addComponent(jConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnRegister)
                    .addComponent(jbtnBack))
                .addGap(86, 86, 86))
        );

        jPanel1.setLayout(null);

        Heading.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 48)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 255, 51));
        Heading.setText("Welcome To SopnoVubon");
        jPanel1.add(Heading);
        Heading.setBounds(0, 0, 580, 50);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ExamProject/3cb7e925258069.563434b64c673.png"))); // NOI18N
        jPanel1.add(image);
        image.setBounds(0, -10, 590, 240);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(604, 678));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        String name = jtxtName.getText();
        String Fname = jtxtFather.getText();
        String age = jtxtAge.getText();
         String uname = jtxtUserName.getText();
         String password = jPassword.getText();
         String cPassword = jConfirmPassword.getText();
         
        if(name.equals("")){
        jtxtName.setText("");
        }else{
        jtxtName.selectAll();
        }
        if(Fname.equals("")){
          jtxtFather.setText("");
        }else{
        jtxtFather.selectAll();
        }
        if(age.equals("")){
          jtxtAge.setText("");
        }else{
        jtxtAge.selectAll();
        }
        if(uname.equals("")){
          jtxtUserName.setText("");
        }else{
        jtxtUserName.selectAll();
        }
       if(password.equals("")){
          jPassword.setText("");
        }else{
        jPassword.selectAll();
        } 
       if(cPassword.equals("")){
          jConfirmPassword.setText("");
        }else{
        jConfirmPassword.selectAll();
        }
    }                                   

    private void jtxtUserNameFocusGained(java.awt.event.FocusEvent evt) {                                         
       String name = jtxtName.getText();
        String Fname = jtxtFather.getText();
        String age = jtxtAge.getText();
         String uname = jtxtUserName.getText();
         String password = jPassword.getText();
         String cPassword = jConfirmPassword.getText();
         
        if(name.equals("")){
        jtxtName.setText("");
        }else{
        jtxtName.selectAll();
        }
        if(Fname.equals("")){
          jtxtFather.setText("");
        }else{
        jtxtFather.selectAll();
        }
        if(age.equals("")){
          jtxtAge.setText("");
        }else{
        jtxtAge.selectAll();
        }
        if(uname.equals("")){
          jtxtUserName.setText("");
        }else{
        jtxtUserName.selectAll();
        }
       if(password.equals("")){
          jPassword.setText("");
        }else{
        jPassword.selectAll();
        } 
       if(cPassword.equals("")){
          jConfirmPassword.setText("");
        }else{
        jConfirmPassword.selectAll();
        }
    }//GEN-LAST:event_jPasswordActionPerformed

    private void jtxtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtNameFocusGained
        String name = jtxtName.getText();
        String Fname = jtxtFather.getText();
        String age = jtxtAge.getText();
         String uname = jtxtUserName.getText();
         String password = jPassword.getText();
         String cPassword = jConfirmPassword.getText();
         
        if(name.equals("")){
        jtxtName.setText("");
        }else{
        jtxtName.selectAll();
        }
        if(Fname.equals("")){
          jtxtFather.setText("");
        }else{
        jtxtFather.selectAll();
        }
        if(age.equals("")){
          jtxtAge.setText("");
        }else{
        jtxtAge.selectAll();
        }
        if(uname.equals("")){
          jtxtUserName.setText("");
        }else{
        jtxtUserName.selectAll();
        }
       if(password.equals("")){
          jPassword.setText("");
        }else{
        jPassword.selectAll();
        } 
       if(cPassword.equals("")){
          jConfirmPassword.setText("");
        }else{
        jConfirmPassword.selectAll();
        }
    }//GEN-LAST:event_jtxtNameFocusGained

    private void jbtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackActionPerformed
        setVisible(false);
        Login_page lp = new Login_page();
        lp.setVisible(true);
        
    }//GEN-LAST:event_jbtnBackActionPerformed

    private void jbtnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegisterActionPerformed
       String name = jtxtName.getText();
       String Fname = jtxtFather.getText();
       String age = jtxtAge.getText();
       String mobile = jtxtMobile.getText();
       String security = jcmbSecurity.getSelectedItem().toString();
       String uname = jtxtUserName.getText();
       String ans = jtxtAns.getText();
       String password = jPassword.getText();
       String cPassword = jConfirmPassword.getText();
        Object Enter;
       
       
       
      if(name.equals("")|| name.equals("Enter Number")){
      JOptionPane.showMessageDialog(null, "Please enter the name");
      }
      else if(Fname.equals("")|| Fname.equals("Enter father name")){
      JOptionPane.showMessageDialog(null, "Please enter father name");
      }
      else if (age.equals("")|| age.equals("Enter Age")){
      JOptionPane.showMessageDialog(null, "Please enter Age");
      }
      else if(mobile.equals("")|| mobile.equals("Enter Mobile no")){
    JOptionPane.showMessageDialog(null, "Please Enter mobile number");
    }
      else if(security.equals("")|| security.equals("choose")){
      JOptionPane.showMessageDialog(null, "Please select security question");
      }
      else if(ans.equals("")|| ans.equals("Enter answer")){
    JOptionPane.showMessageDialog(null, "Please enter a Answer");
    }
      else if(uname.equals("")||uname.equals("Enter user Name")){
      JOptionPane.showMessageDialog(null, "Please enter user name");
      }
      else if(password.equals("")|| password.equals("Enter password")){
      JOptionPane.showMessageDialog(null, "Please enter Password");
      }
      else if (cPassword.equals("")|| cPassword.equals("Enter Confirm password")){
      JOptionPane.showMessageDialog(null, "Please Confirm password");
      }
      else if(!password.equals(cPassword)){
      JOptionPane.showMessageDialog(null, "Password and Confirm password doesn't match");
      }
      else{
      //JOptionPane.showMessageDialog(null, "Data Registered");
      try{
      String sql = "insert into signin (Name,Father_Name,Age,Mobile,Security_Question,answer,User_Name,Password,Confirm_Password) values(?,?,?,?,?,?,?,?,?)";
      pstm = con.prepareStatement(sql);
      pstm.setString(1,name);
      pstm.setString(2,Fname);
      pstm.setString(3,age);
      pstm.setString(4,mobile);
      pstm.setString(5,security);
      pstm.setString(6, ans);
      pstm.setString(7,uname);
      pstm.setString(8,password);
      pstm.setString(9,cPassword);
      
      
      pstm.execute();
      JOptionPane.showMessageDialog(null, "Register Successfully");
      
      }catch(Exception e){
      JOptionPane.showMessageDialog(null, e);
      }     
      }
      
      
    }//GEN-LAST:event_jbtnRegisterActionPerformed

    private void jtxtMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtMobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtMobileActionPerformed

//    private void jtxtUserNameFocusGained(java.awt.event.FocusEvent evt) {                                         
//       String name = jtxtName.getText();
//        String Fname = jtxtFather.getText();
//        String age = jtxtAge.getText();
//         String uname = jtxtUserName.getText();
//         String password = jPassword.getText();
//         String cPassword = jConfirmPassword.getText();
//         
//        if(name.equals("")){
//        jtxtName.setText("Enter Name");
//        }else{
//        jtxtName.selectAll();
//        }
//        if(Fname.equals("")){
//          jtxtFather.setText("Enter Father Name");
//        }else{
//        jtxtFather.selectAll();
//        }
//        if(age.equals("")){
//          jtxtAge.setText("Enter Age");
//        }else{
//        jtxtAge.selectAll();
//        }
//        if(uname.equals("")){
//          jtxtUserName.setText("Enter User Name");
//        }else{
//        jtxtUserName.selectAll();
//        }
//       if(password.equals("Enter Password")){
//          jPassword.setText("");
//        }else{
//        jPassword.selectAll();
//        } 
//       if(cPassword.equals("")){
//          jConfirmPassword.setText("Confirm Password");
//        }else{
//        jConfirmPassword.selectAll();
//        }
//    }                                         
//
//    private void jtxtNameFocusGained(java.awt.event.FocusEvent evt) {                                     
//        String name = jtxtName.getText();
//        String Fname = jtxtFather.getText();
//        String age = jtxtAge.getText();
//         String uname = jtxtUserName.getText();
//         String password = jPassword.getText();
//         String cPassword = jConfirmPassword.getText();
//         
//        if(name.equals("Enter Name")){
//        jtxtName.setText("");
//        }else{
//        jtxtName.selectAll();
//        }
//        if(Fname.equals("")){
//          jtxtFather.setText("Enter Father Name");
//        }else{
//        jtxtFather.selectAll();
//        }
//        if(age.equals("")){
//          jtxtAge.setText("Enter Age");
//        }else{
//        jtxtAge.selectAll();
//        }
//        if(uname.equals("")){
//          jtxtUserName.setText("Enter User Name");
//        }else{
//        jtxtUserName.selectAll();
//        }
//       if(password.equals("")){
//          jPassword.setText("Enter Password");
//        }else{
//        jPassword.selectAll();
//        } 
//       if(cPassword.equals("")){
//          jConfirmPassword.setText("Confirm Password");
//        }else{
//        jConfirmPassword.selectAll();
//        }
//    }                                    

    private void jtxtFatherFocusGained(java.awt.event.FocusEvent evt) {                                       
        String name = jtxtName.getText();
        String Fname = jtxtFather.getText();
        String age = jtxtAge.getText();
         String uname = jtxtUserName.getText();
         String password = jPassword.getText();
         String cPassword = jConfirmPassword.getText();
         
        if(name.equals("")){
        jtxtName.setText("");
        }else{
        jtxtName.selectAll();
        }
        if(Fname.equals("")){
          jtxtFather.setText("");
        }else{
        jtxtFather.selectAll();
        }
        if(age.equals("")){
          jtxtAge.setText("");
        }else{
        jtxtAge.selectAll();
        }
        if(uname.equals("")){
          jtxtUserName.setText("");
        }else{
        jtxtUserName.selectAll();
        }
       if(password.equals("")){
          jPassword.setText("");
        }else{
        jPassword.selectAll();
        } 
       if(cPassword.equals("")){
          jConfirmPassword.setText("");
        }else{
        jConfirmPassword.selectAll();
        }
    }                                      

    private void jtxtAgeFocusGained(java.awt.event.FocusEvent evt) {                                    
        String name = jtxtName.getText();
        String Fname = jtxtFather.getText();
        String age = jtxtAge.getText();
         String uname = jtxtUserName.getText();
         String password = jPassword.getText();
         String cPassword = jConfirmPassword.getText();
         
        if(name.equals("")){
        jtxtName.setText("");
        }else{
        jtxtName.selectAll();
        }
        if(Fname.equals("")){
          jtxtFather.setText("");
        }else{
        jtxtFather.selectAll();
        }
        if(age.equals("")){
          jtxtAge.setText("");
        }else{
        jtxtAge.selectAll();
        }
        if(uname.equals("")){
          jtxtUserName.setText("");
        }else{
        jtxtUserName.selectAll();
        }
       if(password.equals("")){
          jPassword.setText("");
        }else{
        jPassword.selectAll();
        } 
       if(cPassword.equals("")){
          jConfirmPassword.setText("");
        }else{
        jConfirmPassword.selectAll();
        }
    }                                   

//    private void jtxtUserNameFocusGained(java.awt.event.FocusEvent evt) {                                         
//       String name = jtxtName.getText();
//        String Fname = jtxtFather.getText();
//        String age = jtxtAge.getText();
//         String uname = jtxtUserName.getText();
//         String password = jPassword.getText();
//         String cPassword = jConfirmPassword.getText();
//         
//        if(name.equals("")){
//        jtxtName.setText("Enter Name");
//        }else{
//        jtxtName.selectAll();
//        }
//        if(Fname.equals("")){
//          jtxtFather.setText("Enter Father Name");
//        }else{
//        jtxtFather.selectAll();
//        }
//        if(age.equals("")){
//          jtxtAge.setText("Enter Age");
//        }else{
//        jtxtAge.selectAll();
//        }
//        if(uname.equals("")){
//          jtxtAge1.setText("Enter User Name");
//        }else{
//        jtxtAge1.selectAll();
//        }
//       if(password.equals("Enter Password")){
//          jPassword.setText("");
//        }else{
//        jPassword.selectAll();
//        } 
//       if(cPassword.equals("")){
//          jConfirmPassword.setText("Confirm Password");
//        }else{
//        jConfirmPassword.selectAll();
//        }
//    }                                         
//
//    private void jtxtNameFocusGained(java.awt.event.FocusEvent evt) {                                     
//        String name = jtxtName.getText();
//        String Fname = jtxtFather.getText();
//        String age = jtxtAge.getText();
//         String uname = jtxtAge1.getText();
//         String password = jPassword.getText();
//         String cPassword = jConfirmPassword.getText();
//         
//        if(name.equals("Enter Name")){
//        jtxtName.setText("");
//        }else{
//        jtxtName.selectAll();
//        }
//        if(Fname.equals("")){
//          jtxtFather.setText("Enter Father Name");
//        }else{
//        jtxtFather.selectAll();
//        }
//        if(age.equals("")){
//          jtxtAge.setText("Enter Age");
//        }else{
//        jtxtAge.selectAll();
//        }
//        if(uname.equals("")){
//          jtxtAge1.setText("Enter User Name");
//        }else{
//        jtxtAge1.selectAll();
//        }
//       if(password.equals("")){
//          jPassword.setText("Enter Password");
//        }else{
//        jPassword.selectAll();
//        } 
//       if(cPassword.equals("")){
//          jConfirmPassword.setText("Confirm Password");
//        }else{
//        jConfirmPassword.selectAll();
//        }
//    }                                    
//
//    private void jtxtFatherFocusGained(java.awt.event.FocusEvent evt) {                                       
//        String name = jtxtName.getText();
//        String Fname = jtxtFather.getText();
//        String age = jtxtAge.getText();
//         String uname = jtxtUserName.getText();
//         String password = jPassword.getText();
//         String cPassword = jConfirmPassword.getText();
//         
//        if(name.equals("")){
//        jtxtName.setText("Enter Name");
//        }else{
//        jtxtName.selectAll();
//        }
//        if(Fname.equals("Enter Father Name")){
//          jtxtFather.setText("");
//        }else{
//        jtxtFather.selectAll();
//        }
//        if(age.equals("")){
//          jtxtAge.setText("Enter Age");
//        }else{
//        jtxtAge.selectAll();
//        }
//        if(uname.equals("")){
//          jtxtUserName.setText("Enter User Name");
//        }else{
//        jtxtUserName.selectAll();
//        }
//       if(password.equals("")){
//          jPassword.setText("Enter Password");
//        }else{
//        jPassword.selectAll();
//        } 
//       if(cPassword.equals("")){
//          jConfirmPassword.setText("Confirm Password");
//        }else{
//        jConfirmPassword.selectAll();
//        }
//    }                                      
//
//    private void jtxtAgeFocusGained(java.awt.event.FocusEvent evt) {                                    
//        String name = jtxtName.getText();
//        String Fname = jtxtFather.getText();
//        String age = jtxtAge.getText();
//         String uname = jtxtUserName.getText();
//         String password = jPassword.getText();
//         String cPassword = jConfirmPassword.getText();
//         
//        if(name.equals("")){
//        jtxtName.setText("Enter Name");
//        }else{
//        jtxtName.selectAll();
//        }
//        if(Fname.equals("")){
//          jtxtFather.setText("Enter Father Name");
//        }else{
//        jtxtFather.selectAll();
//        }
//        if(age.equals("Enter Age")){
//          jtxtAge.setText("");
//        }else{
//        jtxtAge.selectAll();
//        }
//        if(uname.equals("")){
//          jtxtUserName.setText("Enter User Name");
//        }else{
//        jtxtUserName.selectAll();
//        }
//       if(password.equals("")){
//          jPassword.setText("Enter Password");
//        }else{
//        jPassword.selectAll();
//        } 
//       if(cPassword.equals("")){
//          jConfirmPassword.setText("Confirm Password");
//        }else{
//        jConfirmPassword.selectAll();
//        }
//    }                                   

    private void jConfirmPasswordFocusGained(java.awt.event.FocusEvent evt) {                                             
        String name = jtxtName.getText();
        String Fname = jtxtFather.getText();
        String age = jtxtAge.getText();
         String uname = jtxtUserName.getText();
         String password = jPassword.getText();
         String cPassword = jConfirmPassword.getText();
         
        if(name.equals("")){
        jtxtName.setText("");
        }else{
        jtxtName.selectAll();
        }
        if(Fname.equals("")){
          jtxtFather.setText("");
        }else{
        jtxtFather.selectAll();
        }
        if(age.equals("")){
          jtxtAge.setText("");
        }else{
        jtxtAge.selectAll();
        }
        if(uname.equals("")){
          jtxtUserName.setText("");
        }else{
        jtxtUserName.selectAll();
        }
       if(password.equals("")){
          jPassword.setText("");
        }else{
        jPassword.selectAll();
        } 
       if(cPassword.equals("")){
          jConfirmPassword.setText("");
        }else{
        jConfirmPassword.selectAll();
        }
    }                                            

    private void jtxtNameActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel image;
    private javax.swing.JPasswordField jConfirmPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JButton jbtnBack;
    private javax.swing.JButton jbtnRegister;
    private javax.swing.JComboBox<String> jcmbSecurity;
    private javax.swing.JLabel jlblAge;
    private javax.swing.JLabel jlblFather;
    private javax.swing.JLabel jlblMobile;
    private javax.swing.JLabel jlblPassword;
    private javax.swing.JLabel jlblPassword1;
    private javax.swing.JLabel jlblSecurity;
    private javax.swing.JLabel jlblUser;
    private javax.swing.JTextField jtxtAge;
    private javax.swing.JTextField jtxtAns;
    private javax.swing.JTextField jtxtFather;
    private javax.swing.JTextField jtxtMobile;
    private javax.swing.JTextField jtxtName;
    private javax.swing.JTextField jtxtUserName;
    // End of variables declaration//GEN-END:variables
}
