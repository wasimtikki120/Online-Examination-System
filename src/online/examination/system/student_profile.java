/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.examination.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import static online.examination.system.loginn.txtUser;

/**
 *
 * @author Dell
 */
public class student_profile extends javax.swing.JInternalFrame {

   
    String id = txtUser.getText();
    
    public student_profile() {
       
        initComponents();
        setdata();
        editable();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }
    void editable()
    {
        enrollment.setEditable(false);
        number .setEditable(false);
        studname.setEditable(false);
        email.setEditable(false);
        mob.setEditable(false);
        gender.setEditable(false);
        add.setEditable(false);
        father.setEditable(false);
        branch.setEditable(false);
        
        
    }
 
   public void setdata()
    {
        try{
         loginn l = new loginn();
         accounts a= new accounts();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online", "root", ""); 
            
           
            String sql = "select * from student where enrollment_no = "+(String) id;
                
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
               while(rs.next())
               { 
                  String s1 = rs.getString("enrollment_no");
                  enrollment.setText(s1);
                  String s2 = rs.getString("exam_seat");
                  number.setText(s2);
                  String s3 = rs.getString("student_name");
                  studname.setText(s3);
                  String s4 = rs.getString("email_id");
                  email.setText(s4);
                  String s5 = rs.getString("mobile_no");
                  mob.setText(s5);
                  String s6 = rs.getString("gender");
                  gender.setText(s6);
                  String s7 = rs.getString("address");
                  add.setText(s7);
                  String s8 = rs.getString("father_name");
                  father.setText(s8);
                  String s9 = rs.getString("branch");
                  branch.setText(s9);
                  editable();
                 }          
    
    } 
    catch(ClassNotFoundException | NumberFormatException | SQLException e)
            {
                
            }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        email = new javax.swing.JTextField();
        add = new javax.swing.JTextField();
        mob = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        father = new javax.swing.JTextField();
        branch = new javax.swing.JTextField();
        number = new javax.swing.JTextField();
        enrollment = new javax.swing.JTextField();
        studname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Edit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(950, 700));
        getContentPane().setLayout(null);

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        panel1.setForeground(new java.awt.Color(204, 255, 204));
        panel1.setPreferredSize(new java.awt.Dimension(950, 700));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Enrollment No:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Student Name:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Email id:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Gender:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Mobile No:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Exam seat no:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Branch:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Address:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Father Name:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel9))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(7, 7, 7))
        );

        panel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 360));

        jPanel3.setBackground(new java.awt.Color(255, 255, 102));

        email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        mob.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        gender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });

        father.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        father.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fatherActionPerformed(evt);
            }
        });

        branch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        branch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchActionPerformed(evt);
            }
        });

        number.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        enrollment.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        studname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(studname)
                    .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addComponent(mob, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addComponent(add, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addComponent(father, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addComponent(branch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addComponent(number, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gender, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enrollment, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(enrollment, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(studname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(mob, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(father, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(branch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 59, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 0, 0));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("PROFILE");
        panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 110, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/examination/system/contact_60px.png"))); // NOI18N
        panel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 60, 70));

        getContentPane().add(panel1);
        panel1.setBounds(180, 80, 590, 450);

        Edit.setBackground(new java.awt.Color(255, 255, 0));
        Edit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/examination/system/edit.png"))); // NOI18N
        Edit.setText("Edit Profile");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        getContentPane().add(Edit);
        Edit.setBounds(310, 560, 160, 40);

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/examination/system/update_30px.png"))); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(490, 560, 140, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        enrollment.setEditable(false);
        number.setEditable(true);
        studname.setEditable(true);
        email.setEditable(true);
        mob.setEditable(true);
        gender.setEditable(true);
        add.setEditable(true);
        father.setEditable(true);
        branch.setEditable(true);
       

        // TODO add your handling code here:
    }//GEN-LAST:event_EditActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online", "root", "");
            String query = " UPDATE student SET enrollment_no=?, exam_seat = ?, student_name = ?, email_id = ?, mobile_no = ?, gender = ?, address=?, father_name=?, branch=? where enrollment_no="+(String)enrollment.getText();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1,enrollment.getText());
            pst.setString(2,number.getText());
            pst.setString(3,studname.getText());
            pst.setString(4,email.getText());
            pst.setString(5,mob.getText());
            pst.setString(6,gender.getText());
            pst.setString(7,add.getText());
            pst.setString(8,father.getText());
            pst.setString(9,branch.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Detailed Updated Successfully");
            

        }catch(Exception e){}
        int n = 2;
        if(n==2)
        {
            n=n+1;
            
            enrollment.setEditable(false);
            number.setEditable(true);
            studname.setEditable(true);
            email.setEditable(true);
            mob.setEditable(true);
            gender.setEditable(true);
            add.setEditable(true);
            father.setEditable(true);
            branch.setEditable(true);
            
            n=n-1;

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void fatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fatherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fatherActionPerformed

    private void branchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_branchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Edit;
    public static javax.swing.JTextField add;
    public static javax.swing.JTextField branch;
    public static javax.swing.JTextField email;
    public static javax.swing.JTextField enrollment;
    public static javax.swing.JTextField father;
    public static javax.swing.JTextField gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JTextField mob;
    public static javax.swing.JTextField number;
    private javax.swing.JPanel panel1;
    public static javax.swing.JTextField studname;
    // End of variables declaration//GEN-END:variables

}
