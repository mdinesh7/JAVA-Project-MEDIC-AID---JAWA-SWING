/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientTreatmentWorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author rajesh
 */
public class ViewPatientJPanel extends javax.swing.JPanel {

    private JPanel jPanel;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private PatientTreatmentWorkRequest request;

    /**
     * Creates new form ViewPatientJPanel
     */

    ViewPatientJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, PatientTreatmentWorkRequest workRequest) {
        initComponents();
        this.jPanel = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.request = workRequest;
        
        populate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hmPhNoTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        fstNmTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adrsTxt = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lstNmTxt = new javax.swing.JTextField();
        ageTxt = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        prescptnTxt = new javax.swing.JTextArea();
        pntIdTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMedicalCondition = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        hmPhNoTxt.setEditable(false);
        hmPhNoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hmPhNoTxtActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("PATIENT INFORMATION");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Home phone No :");

        fstNmTxt.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("First Name :");

        jScrollPane1.setEnabled(false);

        adrsTxt.setEditable(false);
        adrsTxt.setColumns(20);
        adrsTxt.setRows(5);
        jScrollPane1.setViewportView(adrsTxt);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Address :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PATIENT DETAILS");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Last Name :");

        lstNmTxt.setEditable(false);

        ageTxt.setEditable(false);
        ageTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTxtActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Age :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Patient Medical Condition");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Prescription :");

        prescptnTxt.setEditable(false);
        prescptnTxt.setColumns(20);
        prescptnTxt.setRows(5);
        jScrollPane2.setViewportView(prescptnTxt);

        pntIdTxt.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Patient ID :");

        txtMedicalCondition.setEditable(false);

        backJButton.setBackground(new java.awt.Color(0, 153, 255));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/patient details.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(backJButton)
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(35, 35, 35)
                                        .addComponent(txtMedicalCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(hmPhNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(pntIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(fstNmTxt))))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lstNmTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ageTxt))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton)))
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fstNmTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(lstNmTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pntIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel24)
                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(hmPhNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMedicalCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3)))
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void hmPhNoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hmPhNoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hmPhNoTxtActionPerformed

    private void ageTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTxtActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        jPanel.remove(this);
        CardLayout layout = (CardLayout)jPanel.getLayout();
        layout.previous(jPanel);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea adrsTxt;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField fstNmTxt;
    private javax.swing.JTextField hmPhNoTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lstNmTxt;
    private javax.swing.JTextField pntIdTxt;
    private javax.swing.JTextArea prescptnTxt;
    private javax.swing.JTextField txtMedicalCondition;
    // End of variables declaration//GEN-END:variables

    private void populate() {


        fstNmTxt.setText(request.getPat().getPatFrstNm());
        lstNmTxt.setText(request.getPat().getPatLstNm());
        pntIdTxt.setText(String.valueOf(request.getPat().getPatId()));
        adrsTxt.setText(request.getPat().getAddress());
        hmPhNoTxt.setText(request.getPat().getCntctNo());
        ageTxt.setText(String.valueOf(request.getPat().getPatAge()));

        txtMedicalCondition.setText(request.getReasonForVisit());
        prescptnTxt.setText(request.getPrescription());
    }
}
