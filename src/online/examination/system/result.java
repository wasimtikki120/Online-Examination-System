/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dell
 */
package online.examination.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
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

public class result extends javax.swing.JInternalFrame {

    static Object getText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Creates new form result
     */
    public result() {
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
    
    String sql = "select * from result order by enrollment_no ASC";
    PreparedStatement pst = db.mycon().prepareStatement(sql);
    ResultSet rs = pst.executeQuery();
    resulttable.setModel(DbUtils.resultSetToTableModel(rs));
    
    
    }catch(Exception e){}
    
    }
    void update_cname()
            {
               try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online", "root", ""); 
                String sql = "select * from result";
                   PreparedStatement pst = con.prepareStatement(sql);
                   ResultSet rs = pst.executeQuery();
                while(rs.next())
                {
                    delno.addItem(rs.getString("enrollment_no"));
                }


                }catch(Exception e){} 

            }
public void search_para(){
 
 String inv_id = inid.getText();

 
 
     try {
        
         DefaultTableModel dt =  (DefaultTableModel) resulttable.getModel();
         dt.setRowCount(0);
       
         Statement s = db.mycon().createStatement();         
         ResultSet rs = s.executeQuery("SELECT * FROM result WHERE enrollment_no  LIKE '%"+inv_id+"%' OR seat_no LIKE '%"+inv_id+"%' OR name LIKE '%"+inv_id+"%' OR Exam LIKE '%"+inv_id+"%' OR total_score LIKE '%"+inv_id+"%' OR correct_answers LIKE '%"+inv_id+"%' OR wrong_answers LIKE '%"+inv_id+"%' OR percentage_of_sucess LIKE '%"+inv_id+"%' ");
         
         while (rs.next()) {             
             
             Vector v =new Vector();
             v.add(rs.getString(1));
             v.add(rs.getString(2));
             v.add(rs.getString(3));
             v.add(rs.getString(4));
             v.add(rs.getString(5));
             v.add(rs.getString(6));
             v.add(rs.getString(7));
             v.add(rs.getString(8));
             v.add(rs.getString(9));
             
             dt.addRow(v);
             
         }
         
       
         
     } catch (SQLException e) {
         System.out.println(e);
         update_table();
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

        jLabel1 = new javax.swing.JLabel();
        inid = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resulttable = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        delno = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("All Result");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 153, 64));

        inid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        inid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inidKeyReleased(evt);
            }
        });
        getContentPane().add(inid, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 210, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resulttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date", "Course", "Time", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(resulttable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 900, 550));

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/examination/system/icons8-denied-30.png"))); // NOI18N
        delete.setText("Delete Result");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, 40));

        delno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delnoActionPerformed(evt);
            }
        });
        jPanel1.add(delno, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 180, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Select Enrollment No:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 920, 620));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Search :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 70, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online", "root", "");
            int row = resulttable.getSelectedRow();
            String cell = (String)delno.getSelectedItem();
            String sql = "DELETE from result where enrollment_no= '"+cell+" '";
            PreparedStatement p = con.prepareStatement(sql);
            int executeUpdate = p.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)resulttable.getModel();
            model.setRowCount(0);

            update_table();
            update_cname();
            display.removeAll();
            questions s1 = new questions();
            result c1 = new result();
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

    private void delnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delnoActionPerformed

    private void inidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inidKeyReleased
search_para();        // TODO add your handling code here:
    }//GEN-LAST:event_inidKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JComboBox delno;
    private javax.swing.JTextField inid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable resulttable;
    // End of variables declaration//GEN-END:variables
}