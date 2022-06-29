
package online.examination.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Timer;
import javax.swing.*;

import static online.examination.system.student_profile.enrollment;
import static online.examination.system.student_profile.number;
import static online.examination.system.student_profile.studname; 
import static online.examination.system.Final_result.*; 
import static online.examination.system.studentexam.mehnat;
import static online.examination.system.timeupfinalresult.enrollll;
import static online.examination.system.timeupfinalresult.exammm;
import static online.examination.system.timeupfinalresult.names;
import static online.examination.system.timeupfinalresult.noo;




public class Exampanel extends javax.swing.JFrame {

       private String value;
   
       // timer aahe ha konta baghu= exam panel cha re
       int m=1 ,s=0;
       Timer timer;
       boolean flag =true;
        // timer aahe ha konta baghu= exam panel cha re euuuuu
       
        Connection conn;
        ResultSet rs,recive,dd;
        int count_question=0,ToTal_Socre=0,correct_ANS_conut=0;
        String answer;
    
        // marks sathi cha variable
        
        int marksbyadd;
        
        // marks sathi cha variable
        
        // negative marking
        int neg;
        // negative marking
    public Exampanel() {
        initComponents();
        
       // fuction for adding marks aas per need 
        addmarks();
        // fuction for adding marks as per need
        setdata();
       
       
        
        
        
        jTextField1.setVisible(false);
        F_score.setVisible(false);
       result.setVisible(false);
       
    try {
        
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/online","root","");
        
    }
    catch (SQLException ex) {
     
        JOptionPane.showMessageDialog(null,"Plz check your connection");
 
    }
     
    }
    
    void mdan()
    {
    System.out.println("hello madan");
     /*timeupfinalresult t1= new timeupfinalresult();
                   t1.setVisible(true);
                   this.setVisible(false);
                   T_Score.setText(""+ToTal_Socre);
                   // int per = ((correct_ANS_conut*100)/index);
                   // Percentag.setText(""+per+"%");
                    //Percentag.setText(""+((correct_ANS_conut*100)/index)+"%");
                    enrollll.setText(""+(enrollment.getText()));
                    noo.setText(""+(number.getText()));
                    names.setText(""+(studname.getText()));
                    exammm.setText(mehnat.getText());

/*
                      if(per>=75)
                       {
                              grade.setText("FIRST CLASS DIST.");

                       }
                      else if (per>60 && per<75)
                      {

                                grade.setText("FIRST CLASS");
                      }
                       else if (per<60 && per>45)
                      {

                                grade.setText("SECOND CLASS");
                      }
                      else if (per>35 && per<45)
                      {

                                grade.setText("THIRD CLASS");
                      }
                      else
                      {

                                grade.setText("FAIL");
                      }*/
                                   //System.out.println(+ToTal_Socre);
    }
    void addmarks()
            {
               try
               {
                
                String sql = "select * from exam";
                   PreparedStatement pst = db.mycon().prepareStatement(sql);
                   ResultSet rs = pst.executeQuery();
               
                while(rs.next())
                {
                    marksbyadd= Integer.parseInt(rs.getString("scheme"));
                    neg= Integer.parseInt(rs.getString("negative"));                                                    
                }


                }
               catch(Exception e)
               {
               } 

            }
            public void setdata()
                    {
                        try{
                     




                            String sql = "select * from exam";

                                Statement stmt = db.mycon().createStatement();
                                ResultSet rs = stmt.executeQuery(sql);
                               while(rs.next())
                               {

                                  String s1 = rs.getString("name");
                                  sname.setText(s1);
                                  String s2 = rs.getString("code");
                                  ecode.setText(s2);
                                  String dt = rs.getString("date");
                                  date.setText(dt);


                                 }          

                    } 
                    catch(NumberFormatException | SQLException e)
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

        result = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        F_score = new javax.swing.JTextField();
        min = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sec = new javax.swing.JLabel();
        cmin = new javax.swing.JComboBox();
        csec = new javax.swing.JComboBox();
        start = new javax.swing.JButton();
        stop = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        View_e = new javax.swing.JButton();
        view_f = new javax.swing.JButton();
        view_D = new javax.swing.JButton();
        View_c = new javax.swing.JButton();
        view_A = new javax.swing.JButton();
        View_B = new javax.swing.JButton();
        view_Question = new javax.swing.JTextField();
        sname = new javax.swing.JLabel();
        ecode = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        result.setEditable(false);
        result.setText("answer");
        result.setAutoscrolls(false);
        result.setEnabled(false);
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });
        getContentPane().add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 80, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, 410));

        jTextField1.setEditable(false);
        jTextField1.setText("Score");
        jTextField1.setAutoscrolls(false);
        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 102), null, null));
        jTextField1.setEnabled(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 40, -1));

        F_score.setEditable(false);
        F_score.setText("0");
        F_score.setAutoscrolls(false);
        F_score.setEnabled(false);
        F_score.setFocusable(false);
        getContentPane().add(F_score, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 74, 25));

        min.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        min.setForeground(new java.awt.Color(255, 0, 0));
        min.setText("00");
        getContentPane().add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 40, 30, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText(":");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 40, 20, -1));

        sec.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        sec.setForeground(new java.awt.Color(255, 0, 0));
        sec.setText("00");
        getContentPane().add(sec, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 40, 30, -1));

        cmin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cminActionPerformed(evt);
            }
        });
        getContentPane().add(cmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        csec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        csec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csecActionPerformed(evt);
            }
        });
        getContentPane().add(csec, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        start.setText("start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        getContentPane().add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, -1, -1));

        stop.setText("stop");
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });
        getContentPane().add(stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("TIMER :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 40, -1, 30));

        View_e.setBackground(new java.awt.Color(255, 0, 0));
        View_e.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        View_e.setForeground(new java.awt.Color(255, 255, 255));
        View_e.setText("CLICK HERE TO START");
        View_e.setFocusable(false);
        View_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_eActionPerformed(evt);
            }
        });
        jPanel1.add(View_e, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, 540, 70));

        view_f.setBackground(new java.awt.Color(255, 0, 0));
        view_f.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        view_f.setForeground(new java.awt.Color(255, 255, 255));
        view_f.setText("CLICK HERE TO START");
        view_f.setFocusable(false);
        view_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_fActionPerformed(evt);
            }
        });
        jPanel1.add(view_f, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 620, 530, 70));

        view_D.setBackground(new java.awt.Color(255, 0, 0));
        view_D.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        view_D.setForeground(new java.awt.Color(255, 255, 255));
        view_D.setText("CLICK HERE TO START");
        view_D.setFocusable(false);
        view_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_DActionPerformed(evt);
            }
        });
        jPanel1.add(view_D, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, 530, 70));

        View_c.setBackground(new java.awt.Color(255, 0, 0));
        View_c.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        View_c.setForeground(new java.awt.Color(255, 255, 255));
        View_c.setText("CLICK HERE TO START");
        View_c.setFocusable(false);
        View_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_cActionPerformed(evt);
            }
        });
        jPanel1.add(View_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 540, 70));

        view_A.setBackground(new java.awt.Color(255, 0, 0));
        view_A.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        view_A.setForeground(new java.awt.Color(255, 255, 255));
        view_A.setText("CLICK HERE TO START");
        view_A.setFocusable(false);
        view_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_AActionPerformed(evt);
            }
        });
        jPanel1.add(view_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 540, 70));

        View_B.setBackground(new java.awt.Color(255, 0, 0));
        View_B.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        View_B.setForeground(new java.awt.Color(255, 255, 255));
        View_B.setText("CLICK HERE TO START");
        View_B.setFocusable(false);
        View_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_BActionPerformed(evt);
            }
        });
        jPanel1.add(View_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 530, 70));

        view_Question.setEditable(false);
        view_Question.setBackground(new java.awt.Color(255, 255, 255));
        view_Question.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        view_Question.setForeground(new java.awt.Color(0, 204, 0));
        view_Question.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        view_Question.setText("click any below button to start exam");
        view_Question.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        view_Question.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        view_Question.setEnabled(false);
        view_Question.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_QuestionActionPerformed(evt);
            }
        });
        jPanel1.add(view_Question, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 1120, 190));

        sname.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        sname.setForeground(new java.awt.Color(255, 0, 0));
        sname.setText("jLabel5");
        jPanel1.add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 120, -1));

        ecode.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ecode.setText("jLabel6");
        jPanel1.add(ecode, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 120, -1));

        date.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        date.setText("jLabel7");
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 120, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Date: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 170, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Exam Code: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 180, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Subject Name: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 180, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 810));

        setSize(new java.awt.Dimension(1234, 812));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  //generates resultset
    public ResultSet funtion(){
    
    try{
        Statement run_query=db.mycon().createStatement();  
        int sub_id=Integer.parseInt(getValue());
        //System.out.println(sub_id);
        String query="SELECT * FROM question WHERE course ="+sub_id;
         //  System.out.println(sub_id);
        rs=run_query.executeQuery(query);    
       
        dd=rs;
         }       
        catch(Exception e){       
           JOptionPane.showMessageDialog(null,"you have error in function code");
   
        }              
   return  dd;
    }
  
  
    //for nextbutton
    
    public String movenext(int Question_No){
 recive=funtion();
   try { 
         int index=0,passed_value=Question_No;        
          while(recive.next()){               
          index=recive.getRow();       
         if(passed_value==index){            
          view_A.setText(recive.getString("A"));
          View_B.setText(recive.getString("B"));
          View_c.setText(recive.getString("C"));
          view_D.setText(recive.getString("D"));
          View_e.setText(recive.getString("E"));
          view_f.setText(recive.getString("F"));
          view_Question.setText(recive.getString("questions"));
          answer=recive.getString("correct");
   
         }  
         
     
         
   }
          
          
    if(passed_value>index){ 
         
    JOptionPane.showMessageDialog(null, "Thank you! Your exam has finished");
    
    Final_result obj=new Final_result();
    obj.setVisible(true);
    new stupanel().dispose();
    T_Score.setText(""+ToTal_Socre);
    C_ANS.setText(""+correct_ANS_conut);
    W_aNS.setText(""+(index-correct_ANS_conut));
    int per = ((correct_ANS_conut*100)/index);
    Percentag.setText(""+per+"%");
    //Percentag.setText(""+((correct_ANS_conut*100)/index)+"%");
    enrolll.setText(""+(enrollment.getText()));
    no.setText(""+(number.getText()));
    namee.setText(""+(studname.getText()));
    examm.setText(mehnat.getText());
        
    
      if(per>=75)
       {
              grade.setText("FIRST CLASS DIST.");

       }
      else if (per>60 && per<75)
      {
      
                grade.setText("FIRST CLASS");
      }
       else if (per<60 && per>45)
      {
      
                grade.setText("SECOND CLASS");
      }
      else if (per>35 && per<45)
      {
      
                grade.setText("THIRD CLASS");
      }
      else
      {
      
                grade.setText("FAIL");
      }
    this.setVisible(false);
     }
          
      } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null,"error in movenext_function code");
      }
      
    return  answer;
    } 
    
    
   public int result_concluded(String button_name){
    String b_Name=button_name;
    if(result.getText().equals(b_Name))
    {
    correct_ANS_conut++;
    
    ToTal_Socre=ToTal_Socre+ marksbyadd;
    }
    
    
        return ToTal_Socre;
    
    }
   
    
 
  
    private void view_QuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_QuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_view_QuestionActionPerformed

    private void view_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_DActionPerformed
        // TODO add your handling code here:

        count_question++;
        String button="D";
        F_score.setText(""+ result_concluded(button));
        result.setText(""+movenext(count_question));

    }//GEN-LAST:event_view_DActionPerformed

    private void View_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_cActionPerformed
        // TODO add your handling code here:
        count_question++;
        String button="C";
        F_score.setText(""+ result_concluded(button));
        result.setText(""+movenext(count_question));

    }//GEN-LAST:event_View_cActionPerformed

    private void view_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_AActionPerformed
        // TODO add your handling code here:

        count_question++;
        String button="A";
        F_score.setText(""+ result_concluded(button));
        result.setText(""+movenext(count_question));

    }//GEN-LAST:event_view_AActionPerformed

    private void View_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_BActionPerformed
        // TODO add your handling code here:
        count_question++;
        String button="B";
        F_score.setText(""+ result_concluded(button));
        result.setText(""+movenext(count_question));
    }//GEN-LAST:event_View_BActionPerformed

    private void View_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_eActionPerformed
            count_question++;
        String button="E";
        F_score.setText(""+ result_concluded(button));
        result.setText(""+movenext(count_question));
    }//GEN-LAST:event_View_eActionPerformed

    private void view_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_fActionPerformed
           count_question++;
        String button="F";
        F_score.setText(""+ result_concluded(button));
        result.setText(""+movenext(count_question));
    }//GEN-LAST:event_view_fActionPerformed

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultActionPerformed

    private void cminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cminActionPerformed
        min.setText(""+cmin.getSelectedItem());
        m= Integer.parseInt(min.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_cminActionPerformed

    private void csecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csecActionPerformed
        sec.setText(""+csec.getSelectedItem());
        s= Integer.parseInt(sec.getText()); // TODO add your handling code here:
    }//GEN-LAST:event_csecActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        timer = new Timer(1000, new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
              boolean s1=true;

              
                if (s==0){
                    s=60;
                    m--;
                }
                if(m<=0){
                   
                     mdan();
                    //System.out.println(+ToTal_Socre);
               
                    
                    JOptionPane.showMessageDialog(rootPane,"Timesup","Stopped",0);
                   
                    m=0;s=0;
                    timer.stop();
                    
                 
                    
                }else{

                    s--;
                    if(s<10){
                        sec.setText("0"+s);
                        flag=false;
                        
                    }
                    if (m<10){
                        min.setText("0"+m);
                        if(s<10)
                        sec.setText("0"+s);
                        else
                        sec.setText(""+s);
                        flag=false;
                    }
                    if(flag){

                        min.setText(""+m);
                        sec.setText(""+s);

                    }}}

            private void setVisible(boolean b) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
                });
                timer.start();

                // TODO add your handling code here:

    }//GEN-LAST:event_startActionPerformed

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stopActionPerformed

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
            java.util.logging.Logger.getLogger(Exampanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exampanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exampanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exampanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exampanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField F_score;
    private javax.swing.JButton View_B;
    private javax.swing.JButton View_c;
    private javax.swing.JButton View_e;
    public static javax.swing.JComboBox cmin;
    public static javax.swing.JComboBox csec;
    public static javax.swing.JLabel date;
    public static javax.swing.JLabel ecode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JLabel min;
    private javax.swing.JTextField result;
    public static javax.swing.JLabel sec;
    public static javax.swing.JLabel sname;
    public static javax.swing.JButton start;
    public static javax.swing.JButton stop;
    private javax.swing.JButton view_A;
    private javax.swing.JButton view_D;
    private javax.swing.JTextField view_Question;
    private javax.swing.JButton view_f;
    // End of variables declaration//GEN-END:variables
 public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }
}
