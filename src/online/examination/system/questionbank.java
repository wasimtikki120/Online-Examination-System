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
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import static online.examination.system.Homepage.display;
import static online.examination.system.accounts.tab;

/**
 *
 * @author Dell
 */
public class questionbank extends javax.swing.JInternalFrame {

    /**
     * Creates new form questionbank
     */
    public questionbank() {
        initComponents();
        update_table();
        update_cname();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

   void update_table()
    {
    try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online", "root", ""); 
    String sql = "select * from question";
    PreparedStatement pst = con.prepareStatement(sql);
    ResultSet rs = pst.executeQuery();
    questiontab.setModel(DbUtils.resultSetToTableModel(rs));
    
    
    }catch(Exception e){}
    
    }
   void update_cname()
{
   try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online", "root", ""); 
    String sql = "select * from question";
       PreparedStatement pst = con.prepareStatement(sql);
       ResultSet rs = pst.executeQuery();
    while(rs.next())
    {
        no.addItem(rs.getString("qno"));
    }
    
    
    }catch(Exception e){} 
    
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        questiontab = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        no = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel1.setText("QUESTION BANK");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 24, -1, -1));

        questiontab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Course", "Exam Code", "Question No", "Question", "A", "B", "C", "D", "E", "F", "CORRECT"
            }
        ));
        jScrollPane1.setViewportView(questiontab);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 147, 920, 520));

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/examination/system/icons8-delete-message-30.png"))); // NOI18N
        delete.setText("Delete question");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/examination/system/icons8-ask-question-30.png"))); // NOI18N
        jButton1.setText("Add question");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 160, 40));

        no.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });
        getContentPane().add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 180, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Select Question No:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, 20));

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/examination/system/report.png"))); // NOI18N
        jButton2.setText("Report");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, 120, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online", "root", "");
            int row = questiontab.getSelectedRow();
            String cell = (String)no.getSelectedItem();
            String sql = "DELETE from question where qno= "+cell;
            PreparedStatement p = con.prepareStatement(sql);
            int executeUpdate = p.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)questiontab.getModel();
            model.setRowCount(0);
            
            update_table();
            update_cname();
            display.removeAll();
            questions s1 = new questions();
            questionbank c1 = new questionbank();
            display.add(s1).setVisible(true);
            display.removeAll();
            display.add(c1).setVisible(true);
            //show_user();
            JOptionPane.showMessageDialog(this,"Item Deleted Successfully");

        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
        
        
    }//GEN-LAST:event_deleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        display.removeAll();
        questions s1 = new questions();
        display.add(s1).setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try{
        String file  = "C:\\Users\\Dell\\Documents\\NetBeansProjects\\online examination system\\src\\online\\examination\\system\\reports\\report1.jrxml";
        JasperReport jr = JasperCompileManager.compileReport(file);
        JasperPrint jp = JasperFillManager.fillReport(jr,null,db.mycon());
        JasperViewer.viewReport(jp,false);
    }catch(Exception e){}
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox no;
    public javax.swing.JTable questiontab;
    // End of variables declaration//GEN-END:variables
}
