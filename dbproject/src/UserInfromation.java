
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SiamPC
 */
public class UserInfromation extends javax.swing.JFrame {
    
    String gender, joinAs;

    /**
     * Creates new form HomeTutorList
     */
    public UserInfromation() {
        initComponents();
        
        Show_User();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    
     public ArrayList<User> userList(){
    ArrayList<User> userList= new ArrayList<>();
    
    try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url="jdbc:sqlserver://localhost:1433;databaseName=MultiSolve;user=siam;password=123456;";
        Connection con = DriverManager.getConnection(url);
        String quary1 = "Select * from UserData";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(quary1);
        
        User user;
        while(rs.next ()){
           user = new User(rs.getInt("uID"),rs.getString("FName"),rs.getString("LName"),rs.getString("Address"),rs.getString("Email"),rs.getString("Gender"),rs.getInt("Age"),rs.getInt("Phone"),rs.getString("Password"));
             userList.add(user);       
        }
    }
    
   catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return userList;
     }
     
      public void  Show_User(){
       ArrayList<User> list=  userList(); 
       DefaultTableModel model = (DefaultTableModel) WorkerTB.getModel();
       Object[] row =new Object[9];
         
       for(int i=0 ;i< list.size(); i++){
           row[0]=list.get(i).getuID();
           row[1]=list.get(i).getUFName();
           row[2]=list.get(i).getULName();
           row[3]=list.get(i).getUAdd();
           row[4]=list.get(i).getUEmail();
           row[5]=list.get(i).getUgender();
           row[6]=list.get(i).getUAge();
           row[7]=list.get(i).getUPhone();
           row[8]=list.get(i).getUpassword();
           
         
           model.addRow(row);
       }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        WorkerTB = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        SearchText = new javax.swing.JTextField();
        FNameT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LNameT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        AddressT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        EmailT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PhoneT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PasswordT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        FemaleRB = new javax.swing.JRadioButton();
        MaleRB = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        AgeT = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        UIDT = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("User List");

        WorkerTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "FName", "LName", "Address", "Email", "Gender", "Age", "Phone", "Password"
            }
        ));
        WorkerTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WorkerTBMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(WorkerTB);

        jButton1.setBackground(new java.awt.Color(51, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        SearchText.setText(" ");
        SearchText.setToolTipText("");
        SearchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTextActionPerformed(evt);
            }
        });
        SearchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchTextKeyReleased(evt);
            }
        });

        FNameT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FNameT.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("User ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Last Name");

        LNameT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LNameT.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Address");

        AddressT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddressT.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Email");

        EmailT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EmailT.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Phone");

        PhoneT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PhoneT.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Password");

        PasswordT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PasswordT.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Gender");

        buttonGroup1.add(FemaleRB);
        FemaleRB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FemaleRB.setText("Female");

        buttonGroup1.add(MaleRB);
        MaleRB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MaleRB.setText("Male");
        MaleRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleRBActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Age");

        AgeT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AgeT.setToolTipText("");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("ReSet");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Fast Name");

        UIDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Search By Worker ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(PasswordT, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                                                    .addComponent(AgeT, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(PhoneT)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(65, 65, 65)
                                                .addComponent(MaleRB)
                                                .addGap(26, 26, 26)
                                                .addComponent(FemaleRB)))
                                        .addGap(0, 72, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(LNameT, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(EmailT, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(AddressT, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(109, 109, 109))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(FNameT, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(UIDT, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(SearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 161, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(150, 150, 150))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1180, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SearchText, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UIDT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(FNameT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LNameT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddressT, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MaleRB)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FemaleRB))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AgeT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PasswordT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(200, 200, 200)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(464, Short.MAX_VALUE)))
        );

        SearchText.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        homepage hm = new homepage();
        hm.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void SearchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTextActionPerformed

    private void MaleRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaleRBActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ReSet();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
      try{
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             String url="jdbc:sqlserver://localhost:1433;databaseName=MultiSolve;user=siam;password=123456;";
             Connection con = DriverManager.getConnection(url);
             
             int row =WorkerTB.getSelectedRow();
             String value = (WorkerTB.getModel().getValueAt(row, 0).toString());
             String qurey = "Update UserData set Fname=?,Lname=?,Address=?,Email=?,Gender=?,JoinAs=?,Age=?,Phone=?,Password= ? where uID="+value;
              PreparedStatement pst = con.prepareStatement(qurey);
            // pst.setString(0, wIDT.getText());
             pst.setString(1, FNameT.getText());
             pst.setString(2, LNameT.getText());
             pst.setString(3, AddressT.getText());
             pst.setString(4, EmailT.getText());
             if(MaleRB.isSelected()){
               gender= "Male";
             }
             if(FemaleRB.isSelected()){
               gender= "Female";
             }
              pst.setString(5, gender);
            
            pst.setString(6, AgeT.getText());
            pst.setString(7, PhoneT.getText());
            pst.setString(8, PasswordT.getText());
               
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Update Sucessfully!");   
            Refesh();
            ReSet();
            
            
       }
       catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }   
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void WorkerTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WorkerTBMouseClicked
        
        int j = WorkerTB.getSelectedRow();
        TableModel model = WorkerTB.getModel();
        UIDT.setText(model.getValueAt(j, 0).toString());
        FNameT.setText(model.getValueAt(j, 1).toString());
        LNameT.setText(model.getValueAt(j, 2).toString());
        AddressT.setText(model.getValueAt(j, 3).toString());
        EmailT.setText(model.getValueAt(j, 4).toString());
        String sex =model.getValueAt(j, 5).toString();
        if(sex.equals("Male")){
            MaleRB.setSelected(true);
        }
        else{
            FemaleRB.setSelected(true);
        }
      
        AgeT.setText(model.getValueAt(j, 7).toString());
        PhoneT.setText(model.getValueAt(j, 8).toString());
        PasswordT.setText(model.getValueAt(j, 9).toString());
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_WorkerTBMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
       try{
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             String url="jdbc:sqlserver://localhost:1433;databaseName=MultiSolve;user=siam;password=123456;";
             Connection con = DriverManager.getConnection(url);
             
             int row =WorkerTB.getSelectedRow();
             String value = (WorkerTB.getModel().getValueAt(row, 0).toString());
             String qurey = "Delete From UserData where uID="+value;
             PreparedStatement pst = con.prepareStatement(qurey);
          
            pst.executeUpdate();
         
            JOptionPane.showMessageDialog(null, "Delete Sucessfully!");   
            Refesh();
            
            
       }
       catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        } 
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void SearchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTextKeyReleased
        // TODO add your handling code here:
        try{
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             String url="jdbc:sqlserver://localhost:1433;databaseName=MultiSolve;user=siam;password=123456;";
             Connection con = DriverManager.getConnection(url);
             
              String sql = "Select * from UserData where   uID =?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, SearchText.getText());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                String setid = rs.getString("uID");
                UIDT.setText(setid);
                String setFN = rs.getString("Fname");
                FNameT.setText(setFN);
                String setLN = rs.getString("Lname");
                LNameT.setText(setLN);
                String setAD = rs.getString("Address");
                AddressT.setText(setAD);
                String setEM = rs.getString("Email");
                EmailT.setText(setEM);
                
                String sex = rs.getString("Gender");
                 if(sex.equals("Male")){
                MaleRB.setSelected(true);
                 }
                   else{
                FemaleRB.setSelected(true);
                 }
            
                String setAG = rs.getString("Age");
                AgeT.setText(setAG);
                String setPN = rs.getString("Phone");
                PhoneT.setText(setPN);
                String setPS = rs.getString("Password");
                PasswordT.setText(setPS);
                
                
            
            
       }
         }
       catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }  
        
        
        
    }//GEN-LAST:event_SearchTextKeyReleased

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
            java.util.logging.Logger.getLogger(UserInfromation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInfromation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInfromation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInfromation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInfromation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressT;
    private javax.swing.JTextField AgeT;
    private javax.swing.JTextField EmailT;
    private javax.swing.JTextField FNameT;
    private javax.swing.JRadioButton FemaleRB;
    private javax.swing.JTextField LNameT;
    private javax.swing.JRadioButton MaleRB;
    private javax.swing.JTextField PasswordT;
    private javax.swing.JTextField PhoneT;
    private javax.swing.JTextField SearchText;
    private javax.swing.JLabel UIDT;
    private javax.swing.JTable WorkerTB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
    
    
void Refesh(){

    DefaultTableModel model = (DefaultTableModel) WorkerTB.getModel();
    model.setRowCount(0);
    Show_User();
}

void ReSet(){
    UIDT.setText("");
    FNameT.setText("");
    LNameT.setText("");
    AddressT.setText("");
    EmailT.setText("");
    MaleRB.setSelected(false);
    FemaleRB.setSelected(false);
    AgeT.setText("");
    PhoneT.setText("");
    PasswordT.setText("");
    
    
    
    
    
    
}


}

