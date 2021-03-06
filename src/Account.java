
import java.awt.HeadlessException;
import java.sql.*;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Account extends javax.swing.JFrame {
Connection conn;
ResultSet rs;
PreparedStatement pst;
    /**
     * Creates new form Account
     */
    public Account() {
        super("Create Account");
        initComponents();
        conn=javaconnect.ConnecrDb();
        RandomAcc();
        RandomMICR();
        RandomPIN();
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
        Accnt_type_jLabel = new javax.swing.JLabel();
        MAG_INK_CHAR_RECG_jLabel3 = new javax.swing.JLabel();
        Accnt_type_cmBOX = new javax.swing.JComboBox<>();
        Sec_Ans_txt = new javax.swing.JTextField();
        Name_txt = new javax.swing.JTextField();
        Name_jLabel = new javax.swing.JLabel();
        PIN_txt = new javax.swing.JTextField();
        Sec_ques_jLabel = new javax.swing.JLabel();
        Mobl_jlabel = new javax.swing.JLabel();
        AccntNO_jLabel = new javax.swing.JLabel();
        Clear_btn = new javax.swing.JButton();
        dtchooser_jlabel = new javax.swing.JLabel();
        Pin_jLabel = new javax.swing.JLabel();
        Mobl_txt = new javax.swing.JTextField();
        MICRNO_txt = new javax.swing.JTextField();
        Religion_cmbox = new javax.swing.JComboBox<>();
        Adress_txt = new javax.swing.JTextField();
        Address_jLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        AccntNO_txt = new javax.swing.JTextField();
        Create_btn = new javax.swing.JButton();
        Back_btn = new javax.swing.JButton();
        Male_RdioBtn = new javax.swing.JRadioButton();
        Sec_Ans_jLabel = new javax.swing.JLabel();
        Female_RdioBtn = new javax.swing.JRadioButton();
        Gender_jLabel = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        Relegion_jLabel = new javax.swing.JLabel();
        Amnt_jLabel = new javax.swing.JLabel();
        Amount_txt = new javax.swing.JTextField();
        Sec_Ques_CmBox = new javax.swing.JComboBox<>();
        New_Accnt_jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51), 3), "New Account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(0, 51, 51))); // NOI18N

        Accnt_type_jLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Accnt_type_jLabel.setText("Account Type");

        MAG_INK_CHAR_RECG_jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MAG_INK_CHAR_RECG_jLabel3.setText("MICR NO.");

        Accnt_type_cmBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Saving", "Current" }));

        Name_jLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Name_jLabel.setText("Name");

        PIN_txt.setEditable(false);

        Sec_ques_jLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Sec_ques_jLabel.setText("Sequrity Q.");

        Mobl_jlabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Mobl_jlabel.setText("Mobile");

        AccntNO_jLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AccntNO_jLabel.setText("Account No.");

        Clear_btn.setText("Clear");
        Clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_btnActionPerformed(evt);
            }
        });

        dtchooser_jlabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dtchooser_jlabel.setText("Date of Birth");

        Pin_jLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Pin_jLabel.setText("Pin");

        MICRNO_txt.setEditable(false);

        Religion_cmbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Hindu", "Muslim", "Cristian", " " }));

        Address_jLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Address_jLabel.setText("Address");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Caste");

        AccntNO_txt.setEditable(false);

        Create_btn.setText("Create");
        Create_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_btnActionPerformed(evt);
            }
        });

        Back_btn.setText("Back");
        Back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_btnActionPerformed(evt);
            }
        });

        buttonGroup1.add(Male_RdioBtn);
        Male_RdioBtn.setText("Male");

        Sec_Ans_jLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Sec_Ans_jLabel.setText("Answer");

        buttonGroup1.add(Female_RdioBtn);
        Female_RdioBtn.setText("Female");

        Gender_jLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Gender_jLabel.setText("Gender");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        Relegion_jLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Relegion_jLabel.setText("Religion");

        Amnt_jLabel.setText("Amount");

        Sec_Ques_CmBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your nick name?", "What is your mother maiden name?" }));
        Sec_Ques_CmBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sec_Ques_CmBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(Create_btn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AccntNO_jLabel)
                                    .addComponent(MAG_INK_CHAR_RECG_jLabel3)
                                    .addComponent(Pin_jLabel)
                                    .addComponent(Accnt_type_jLabel)
                                    .addComponent(Gender_jLabel)
                                    .addComponent(Address_jLabel)
                                    .addComponent(Amnt_jLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AccntNO_txt)
                                    .addComponent(MICRNO_txt)
                                    .addComponent(PIN_txt)
                                    .addComponent(Adress_txt)
                                    .addComponent(Accnt_type_cmBOX, 0, 165, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Male_RdioBtn)
                                        .addGap(27, 27, 27)
                                        .addComponent(Female_RdioBtn))
                                    .addComponent(Amount_txt))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Name_jLabel)
                                        .addGap(49, 49, 49)
                                        .addComponent(Name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dtchooser_jlabel)
                                            .addComponent(Relegion_jLabel)
                                            .addComponent(jLabel11)
                                            .addComponent(Mobl_jlabel)
                                            .addComponent(Sec_ques_jLabel)
                                            .addComponent(Sec_Ans_jLabel))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Sec_Ans_txt)
                                                    .addComponent(Religion_cmbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jTextField6)
                                                    .addComponent(Mobl_txt)
                                                    .addComponent(Sec_Ques_CmBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(New_Accnt_jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addComponent(Clear_btn))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(Back_btn)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccntNO_jLabel)
                    .addComponent(AccntNO_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name_jLabel)
                    .addComponent(Name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MAG_INK_CHAR_RECG_jLabel3)
                        .addComponent(MICRNO_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dtchooser_jlabel))
                    .addComponent(New_Accnt_jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pin_jLabel)
                    .addComponent(PIN_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Relegion_jLabel)
                    .addComponent(Religion_cmbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Accnt_type_jLabel)
                    .addComponent(Accnt_type_cmBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gender_jLabel)
                    .addComponent(Male_RdioBtn)
                    .addComponent(Female_RdioBtn)
                    .addComponent(Mobl_jlabel)
                    .addComponent(Mobl_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Address_jLabel)
                    .addComponent(Adress_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sec_ques_jLabel)
                    .addComponent(Sec_Ques_CmBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sec_Ans_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sec_Ans_jLabel)
                    .addComponent(Amnt_jLabel)
                    .addComponent(Amount_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clear_btn)
                    .addComponent(Back_btn)
                    .addComponent(Create_btn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(777, 573));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    private void Back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_btnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Authentication ob=new Authentication();
        ob.setVisible(true);
    }//GEN-LAST:event_Back_btnActionPerformed

    public void RandomAcc(){
        Random ra=new Random();
        AccntNO_txt.setText(""+ra.nextInt(10000+1));
    }
    
    public void RandomMICR(){
        Random ra=new Random();
        MICRNO_txt.setText(""+ra.nextInt(1000+1));
    }
    
    public void RandomPIN(){
        Random ra=new Random();
        PIN_txt.setText(""+ra.nextInt(1000+1));
    }
    
    private void Clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_btnActionPerformed
        // TODO add your handling code here:
        AccntNO_txt.setText("");
        MICRNO_txt.setText("");
        PIN_txt.setText("");
        Adress_txt.setText("");
        Name_txt.setText("");
        jTextField6.setText("");
        Mobl_txt.setText("");
        Sec_Ans_txt.setText("");
        Amount_txt.setText("");
    }//GEN-LAST:event_Clear_btnActionPerformed

    private void Create_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_btnActionPerformed
        // TODO add your handling code here:
        String sql="insert into ACCOUNT(ACC,NAME,DOB,PIN,ACC_TYPE,NATIONALITY,CASTE,MICR_NO,GENDER,MOB,ADDRESS,SEC_Q,SEC_A,BALANCE) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
    
          pst=conn.prepareStatement(sql);
          pst.setString(1,AccntNO_txt.getText());
          pst.setString(2,Name_txt.getText());
          pst.setString(3, ((JTextField)New_Accnt_jDateChooser1.getDateEditor().getUiComponent()).getText());
          pst.setString(4,PIN_txt.getText());
          pst.setString(5, (String) Accnt_type_cmBOX.getSelectedItem());
          pst.setString(6, (String) Religion_cmbox.getSelectedItem());
          pst.setString(7,jTextField6.getText());
          pst.setString(8,MICRNO_txt.getText());
          
          Male_RdioBtn.setActionCommand("Male");
          Female_RdioBtn.setActionCommand("Female");
          pst.setString(9,buttonGroup1.getSelection().getActionCommand());
          
          pst.setString(10,Mobl_txt.getText());
          pst.setString(11,Adress_txt.getText());
          pst.setString(12, (String) Sec_Ques_CmBox.getSelectedItem());
          pst.setString(13,Sec_Ans_txt.getText());
          pst.setString(14,Amount_txt.getText());
          pst.execute();
          JOptionPane.showMessageDialog(null, "Congrtz\n Account has been Created");

        }catch(HeadlessException | SQLException e){
          //  JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_Create_btnActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void Sec_Ques_CmBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sec_Ques_CmBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sec_Ques_CmBoxActionPerformed

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
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccntNO_jLabel;
    private javax.swing.JTextField AccntNO_txt;
    private javax.swing.JComboBox<String> Accnt_type_cmBOX;
    private javax.swing.JLabel Accnt_type_jLabel;
    private javax.swing.JLabel Address_jLabel;
    private javax.swing.JTextField Adress_txt;
    private javax.swing.JLabel Amnt_jLabel;
    private javax.swing.JTextField Amount_txt;
    private javax.swing.JButton Back_btn;
    private javax.swing.JButton Clear_btn;
    private javax.swing.JButton Create_btn;
    private javax.swing.JRadioButton Female_RdioBtn;
    private javax.swing.JLabel Gender_jLabel;
    private javax.swing.JLabel MAG_INK_CHAR_RECG_jLabel3;
    private javax.swing.JTextField MICRNO_txt;
    private javax.swing.JRadioButton Male_RdioBtn;
    private javax.swing.JLabel Mobl_jlabel;
    private javax.swing.JTextField Mobl_txt;
    private javax.swing.JLabel Name_jLabel;
    private javax.swing.JTextField Name_txt;
    private com.toedter.calendar.JDateChooser New_Accnt_jDateChooser1;
    private javax.swing.JTextField PIN_txt;
    private javax.swing.JLabel Pin_jLabel;
    private javax.swing.JLabel Relegion_jLabel;
    private javax.swing.JComboBox<String> Religion_cmbox;
    private javax.swing.JLabel Sec_Ans_jLabel;
    private javax.swing.JTextField Sec_Ans_txt;
    private javax.swing.JComboBox<String> Sec_Ques_CmBox;
    private javax.swing.JLabel Sec_ques_jLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel dtchooser_jlabel;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
