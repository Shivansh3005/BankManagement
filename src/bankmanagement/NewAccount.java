/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bankmanagement;

import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.event.KeyEvent;
import java.awt.image.Kernel;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

/**
 *
 * @author admin
 */
public class NewAccount extends javax.swing.JFrame {

    /**
     * Creates new form NewAccount
     */
    
    Connection con=null;
    PreparedStatement pstmt=null;
    Statement stmt=null;
    ResultSet rs=null;
    public NewAccount() {
        initComponents();
        jdbcConnection();
        JTextFieldDateEditor editor = (JTextFieldDateEditor) jdob.getDateEditor();
        editor.setEditable(false);
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jfirstname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jlastname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jdob = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jfathername = new javax.swing.JTextField();
        jgender = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jaadharno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jprimary = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jpermanent = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jmobileno = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jnationality = new javax.swing.JComboBox<>();
        createAccount = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jpass = new javax.swing.JPasswordField();
        jconfirmpass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("New Account");

        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("*First Name:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("*Last Name:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("*Date of Birth:");

        jdob.setToolTipText("");
        jdob.setDateFormatString("yyyy-MM-dd");
        jdob.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jdobFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jdobFocusLost(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("*Gender:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 204));
        jLabel7.setText("*Father's Name:");

        jgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female", "Other" }));

        jLabel9.setForeground(new java.awt.Color(255, 255, 204));
        jLabel9.setText("*Aadhar card number:");

        jaadharno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jaadharnoKeyPressed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 204));
        jLabel10.setText("*Primary address:");

        jLabel11.setForeground(new java.awt.Color(255, 255, 204));
        jLabel11.setText("*Permanent address:");

        jLabel12.setForeground(new java.awt.Color(255, 255, 204));
        jLabel12.setText("*Mobile no.:");

        jmobileno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmobilenoActionPerformed(evt);
            }
        });
        jmobileno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jmobilenoKeyPressed(evt);
            }
        });

        jCheckBox1.setForeground(new java.awt.Color(255, 255, 204));
        jCheckBox1.setText("same as primary address");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(255, 255, 204));
        jLabel14.setText("*Nationality:");

        jnationality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "India", "other..." }));
        jnationality.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        createAccount.setText("Create Account");
        createAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountActionPerformed(evt);
            }
        });

        jButton3.setText("Back");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Exit");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(255, 255, 204));
        jLabel16.setText("*Create password:");

        jLabel17.setForeground(new java.awt.Color(255, 255, 204));
        jLabel17.setText("*Confirm Password:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jpass, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jLabel17)
                            .addGap(18, 18, 18)
                            .addComponent(jconfirmpass, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(0, 29, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(createAccount)
                                    .addGap(45, 45, 45)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(48, 48, 48)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jCheckBox1)
                                            .addGap(25, 25, 25)
                                            .addComponent(jLabel14)
                                            .addGap(18, 18, 18)
                                            .addComponent(jnationality, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jfirstname)
                                                    .addComponent(jdob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jfathername)
                                                    .addComponent(jaadharno, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(68, 68, 68)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel6)
                                                            .addComponent(jLabel12))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jgender, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jmobileno, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel4)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jlastname, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addComponent(jpermanent)
                                            .addComponent(jprimary, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jlastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jfathername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jaadharno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jmobileno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jprimary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jpermanent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel14)
                    .addComponent(jnationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jconfirmpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createAccount)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(85, 85, 85))
        );

        jLabel3.setText("© Singhal Softwares, Inc. All rights reserved.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public final void jdbcConnection(){
        String url="jdbc:mysql://localhost:3306/bank";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url,"root","shiv");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void createAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountActionPerformed

        DateFormat df= new SimpleDateFormat("yyyy-MM-dd");
        String db = df.format(jdob.getDate());
        if((jfirstname.getText().equals(""))||(jlastname.getText().equals(""))
                ||(jgender.getSelectedIndex()==0)||(jfathername.getText().equals(""))
                ||(jmobileno.getText().equals(""))
                ||(jaadharno.getText().equals(""))||(jprimary.getText().equals(""))||
                (jpermanent.getText().equals(""))||(jpass.getText().equals(""))||(jconfirmpass.getText().equals(""))){
                JOptionPane.showMessageDialog(createAccount, "* all fields required");
        }
        else if((!jpass.getText().equals(jconfirmpass.getText()))){
            JOptionPane.showMessageDialog(createAccount, "Confirm password is not matched");
        }
        else if((jdob.getDate()==null)){
            JOptionPane.showMessageDialog(null, "Choose data of birth");
        }
        else if(jdob.getDate().after(Calendar.getInstance().getTime())){
            JOptionPane.showMessageDialog(null, "Date of birth can't be after the date of toay");
        }      
        else{
            long account_no;
            long temp_account_no;
            String name,gender,f_name,primary,permanent,pass,cpass,m_no,dob,doc;
            long aadhar;  
            try {
                //getting data from textfields 
                name=jfirstname.getText()+" "+jlastname.getText();
                gender= (String) jgender.getSelectedItem();
                f_name=jfathername.getText();
                primary=jprimary.getText();
                permanent=jpermanent.getText();
                pass=jpass.getText();
                cpass=jconfirmpass.getText();
                m_no= jmobileno.getText();
                aadhar= Long.parseLong(jaadharno.getText());
                dob= df.format(jdob.getDate());
                doc= df.format(Calendar.getInstance().getTime());
                try {
                    //getting account number from database table acc_nos to update previous account number
                    stmt=con.createStatement();
                    rs=stmt.executeQuery("select * from acc_nos");
                    rs.next();
                    account_no=rs.getLong("acc_no");
                    temp_account_no= account_no+1;
                    pstmt=con.prepareStatement(("update acc_nos set acc_no=? where acc_no=?"));
                    pstmt.setLong(1, temp_account_no);
                    pstmt.setLong(2, account_no);
                    pstmt.executeUpdate();
                    pstmt=con.prepareStatement("insert into accounts value(?,?,?,?,?,?,?,?,?,?)");
                    pstmt.setLong(1,account_no);
                    pstmt.setString(2,name);
                    pstmt.setString(3, dob );
                    pstmt.setString(4, gender);
                    pstmt.setString(5, f_name);
//                    pstmt.setString(6, m_name);
                    pstmt.setString(6, m_no);
                    pstmt.setLong(7, aadhar);
                    pstmt.setString(8, permanent);
                    pstmt.setString(9, pass);
                    pstmt.setString(10, doc);
                    pstmt.executeUpdate();
                } catch (Exception e) {
                   JOptionPane.showMessageDialog(createAccount, e);
                }
                finally{
                    try {
                    con.close();
                    stmt.close();
                    pstmt.close();
                    rs.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                }
            }catch(NullPointerException npe){
                JOptionPane.showMessageDialog(null, npe);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            AccountCreated ac= new AccountCreated();
            ac.show();
            hide();
        }
    }//GEN-LAST:event_createAccountActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MainMenu mm= new MainMenu();
        mm.show();
        hide();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()){
            jpermanent.setText(jprimary.getText());
            jpermanent.setEditable(false);
        } else {
            jpermanent.setEditable(true);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jmobilenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmobilenoActionPerformed
        
    }//GEN-LAST:event_jmobilenoActionPerformed

    private void jmobilenoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jmobilenoKeyPressed
        String mno=jmobileno.getText();
        int len=mno.length();
        
        char c= evt.getKeyChar();
        
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(len<10){
                jmobileno.setEditable(true);
            }else{
                jmobileno.setEditable(false);
            }
        }else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                jmobileno.setEditable(true);
            }else{
                jmobileno.setEditable(false);
            }
        }
        
    }//GEN-LAST:event_jmobilenoKeyPressed

    private void jaadharnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jaadharnoKeyPressed
        String aadhar=jaadharno.getText();
        int len=aadhar.length();
        
        char c= evt.getKeyChar();
        
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(len<12){
                jaadharno.setEditable(true);
            }else{
                jaadharno.setEditable(false);
            }
        }else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                jaadharno.setEditable(true);
            }else{
                jaadharno.setEditable(false);
            }
        }
    }//GEN-LAST:event_jaadharnoKeyPressed

    private void jdobFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jdobFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jdobFocusLost

    private void jdobFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jdobFocusGained
       // TODO add your handling code here:
    }//GEN-LAST:event_jdobFocusGained

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
            java.util.logging.Logger.getLogger(NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton createAccount;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jaadharno;
    private javax.swing.JPasswordField jconfirmpass;
    private com.toedter.calendar.JDateChooser jdob;
    private javax.swing.JTextField jfathername;
    private javax.swing.JTextField jfirstname;
    private javax.swing.JComboBox<String> jgender;
    private javax.swing.JTextField jlastname;
    private javax.swing.JTextField jmobileno;
    private javax.swing.JComboBox<String> jnationality;
    private javax.swing.JPasswordField jpass;
    private javax.swing.JTextField jpermanent;
    private javax.swing.JTextField jprimary;
    // End of variables declaration//GEN-END:variables
}
