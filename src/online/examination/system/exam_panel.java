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
import static online.examination.system.Homepage.display;
import static online.examination.system.accounts.tab;

/**
 *
 * @author Dell
 */
public class exam_panel extends javax.swing.JInternalFrame {

    /**
     * Creates new form exam_panel
     */
    public exam_panel() {
        initComponents();
        update_cname();
        update_table();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

   void update_cname()
{
   try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online", "root", ""); 
    String sql = "select * from exam";
       PreparedStatement pst = con.prepareStatement(sql);
       ResultSet rs = pst.executeQuery();
    while(rs.next())
    {
        cname.addItem(rs.getString("code"));
    }
    
    
    }catch(Exception e){} 
    
}

    void update_table()
    {
         try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online", "root", ""); 
    String sql = "select * from exam";
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery();
    examtable.setModel(DbUtils.resultSetToTableModel(rs));
    
    
    }catch(Exception e){}
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        delete = new javax.swing.JButton();
        cname = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        examtable = new javax.swing.JTable();
        delete1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel1.setText("exam");

        panel2.setBackground(new java.awt.Color(255, 255, 255));
        panel2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        panel2.setForeground(new java.awt.Color(204, 255, 204));
        panel2.setLayout(null);

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/examination/system/icons8-delete-file-30.png"))); // NOI18N
        delete.setText("Delete exam details");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        panel2.add(delete);
        delete.setBounds(660, 20, 199, 40);

        cname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnameActionPerformed(evt);
            }
        });
        panel2.add(cname);
        cname.setBounds(240, 20, 180, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Select Exam Code:");
        panel2.add(jLabel2);
        jLabel2.setBounds(100, 30, 130, 20);

        examtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(examtable);

        panel2.add(jScrollPane1);
        jScrollPane1.setBounds(30, 90, 840, 440);

        delete1.setBackground(new java.awt.Color(255, 255, 255));
        delete1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/examination/system/icons8-add-book-30.png"))); // NOI18N
        delete1.setText("Add exam details");
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        panel2.add(delete1);
        delete1.setBounds(460, 20, 190, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online", "root", "");
            int row = examtable.getSelectedRow();
            //String cell = tab.getModel().getValueAt(row,0).toString();
            String cell = (String)cname.getSelectedItem();
            String sql = "DELETE from exam where code= "+cell;
            PreparedStatement p = con.prepareStatement(sql);
            int executeUpdate = p.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)examtable.getModel();
            model.setRowCount(0);
            update_table();
            update_cname();
            display.removeAll();

            exam s1 = new exam();
            exam_panel c1 = new exam_panel();
            display.add(s1).setVisible(true);
            display.removeAll();
            display.add(c1).setVisible(true);
            //show_user();
            JOptionPane.showMessageDialog(this,"Item Deleted Successfully");

        }catch(Exception e){
            JOptionPane.showMessageDialog(this,e);}

        /*DefaultTableModel tb = (DefaultTableModel) coursetable.getModel();

        if(coursetable.getSelectedRowCount() == 1)
        {
            tb.removeRow(coursetable.getSelectedRow()) ;

        }else{
            if(coursetable.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"this is empty");

            }
            else
            {
                JOptionPane.showMessageDialog(this,"please select single row for delete");
            }
        }*/
    }//GEN-LAST:event_deleteActionPerformed

    private void cnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnameActionPerformed

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
   display.removeAll();
        exam s1 = new exam();
        display.add(s1).setVisible(true);
                
    }//GEN-LAST:event_delete1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cname;
    private javax.swing.JButton delete;
    private javax.swing.JButton delete1;
    private javax.swing.JTable examtable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel2;
    // End of variables declaration//GEN-END:variables
}
