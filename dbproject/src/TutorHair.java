
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SiamPC
 */


public class TutorHair extends javax.swing.JFrame {

    /**
     * Creates new form 
     * 
     */
    String Version, Stype;
    public TutorHair() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        PhoneT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        DateT = new javax.swing.JTextField();
        SubjectRB = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        MonthRB = new javax.swing.JRadioButton();
        HourRB = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        ClassT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        EnglishRB = new javax.swing.JRadioButton();
        BanglaRB = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(120, 350, 90, 40);

        PhoneT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(PhoneT);
        PhoneT.setBounds(140, 300, 180, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Phone");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 300, 50, 17);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(250, 350, 90, 40);

        DateT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(DateT);
        DateT.setBounds(140, 250, 180, 30);

        SubjectRB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(SubjectRB);
        SubjectRB.setBounds(130, 160, 190, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Subject");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 160, 110, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Date");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 250, 40, 20);

        buttonGroup2.add(MonthRB);
        MonthRB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MonthRB.setText("Monthly");
        MonthRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthRBActionPerformed(evt);
            }
        });
        jPanel1.add(MonthRB);
        MonthRB.setBounds(230, 210, 93, 23);

        buttonGroup2.add(HourRB);
        HourRB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        HourRB.setText("Hourly");
        jPanel1.add(HourRB);
        HourRB.setBounds(140, 210, 70, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Service Type");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 210, 90, 20);

        ClassT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(ClassT);
        ClassT.setBounds(130, 120, 190, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Class");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 120, 70, 20);

        buttonGroup1.add(EnglishRB);
        EnglishRB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EnglishRB.setText("English");
        EnglishRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnglishRBActionPerformed(evt);
            }
        });
        jPanel1.add(EnglishRB);
        EnglishRB.setBounds(240, 80, 80, 23);

        buttonGroup1.add(BanglaRB);
        BanglaRB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BanglaRB.setText("Bangla");
        BanglaRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BanglaRBActionPerformed(evt);
            }
        });
        jPanel1.add(BanglaRB);
        BanglaRB.setBounds(150, 80, 70, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Version");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 80, 60, 17);

        jPanel2.setBackground(new java.awt.Color(153, 255, 51));

        jButton2.setBackground(new java.awt.Color(153, 255, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Multi Solve Order");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 610, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/books-3.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -50, 610, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BanglaRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BanglaRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BanglaRBActionPerformed

    private void EnglishRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnglishRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnglishRBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             String url="jdbc:sqlserver://localhost:1433;databaseName=MultiSolve;user=siam;password=123456;";
             Connection con = DriverManager.getConnection(url);
             String qurey = "Insert into Tutor (Tversion,Tclass,Tsubject,sertype,sdate,phone) Values (?,?,?,?,?,? )";
             PreparedStatement pst = con.prepareStatement(qurey);
             if(BanglaRB.isSelected()){
               Version= "Bangla";
             }
             if(EnglishRB.isSelected()){
               Version= "English";
             }
             pst.setString(1, Version);
             pst.setString(2, ClassT.getText());
             pst.setString(3, SubjectRB.getText());
            
             if(HourRB.isSelected()){
               Stype= "Hourly";
             }
             if(MonthRB.isSelected()){
               Stype= "Monthly";
             }
             pst.setString(4, Stype);
              pst.setString(5, DateT.getText());
             pst.setString(6, PhoneT.getText());
               
             pst.executeUpdate();
          
             JOptionPane.showMessageDialog(null, "Order Sucessfully!");          
            
       }
       catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MonthRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MonthRBActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        ClassT.setText("");
        SubjectRB.setText("");
        DateT.setText("");
        PhoneT.setText("");
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        Uprofile up = new Uprofile();
        up.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TutorHair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TutorHair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TutorHair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TutorHair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TutorHair().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BanglaRB;
    private javax.swing.JTextField ClassT;
    private javax.swing.JTextField DateT;
    private javax.swing.JRadioButton EnglishRB;
    private javax.swing.JRadioButton HourRB;
    private javax.swing.JRadioButton MonthRB;
    private javax.swing.JTextField PhoneT;
    private javax.swing.JTextField SubjectRB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
