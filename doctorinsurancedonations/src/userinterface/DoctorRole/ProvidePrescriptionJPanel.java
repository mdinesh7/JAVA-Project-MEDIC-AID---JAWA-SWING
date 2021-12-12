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
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rajesh
 */
public class ProvidePrescriptionJPanel extends javax.swing.JPanel {

    private JPanel jPanel;
    private UserAccount usrAcnt;
    private Enterprise entrpz;
    private PatientTreatmentWorkRequest req;

    /**
     * Creates new form ProvidePrescriptionJPanel
     */
    public ProvidePrescriptionJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, PatientTreatmentWorkRequest workRequest) {
        initComponents();
        this.jPanel = userProcessContainer;
        this.usrAcnt = userAccount;
        this.entrpz = enterprise;
        this.req = workRequest;
        pplTbl();
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
        jLabel6 = new javax.swing.JLabel();
        fstNmTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lstNmTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ageTxt = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        prscrptnTxt = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        medCondTxt = new javax.swing.JTextField();
        asgndDocTxt = new javax.swing.JTextField();
        sbmtBtn = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setEnabled(false);
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Provide Prescription");
        add(jLabel1);
        jLabel1.setBounds(283, 30, 242, 29);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("PATIENT INFORMATION");
        add(jLabel6);
        jLabel6.setBounds(361, 113, 146, 15);

        fstNmTxt.setEditable(false);
        add(fstNmTxt);
        fstNmTxt.setBounds(244, 146, 131, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("First Name :");
        add(jLabel7);
        jLabel7.setBounds(169, 148, 73, 15);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Last Name :");
        add(jLabel10);
        jLabel10.setBounds(425, 148, 71, 15);

        lstNmTxt.setEditable(false);
        add(lstNmTxt);
        lstNmTxt.setBounds(500, 146, 131, 23);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Assigned Doctor Information :");
        add(jLabel8);
        jLabel8.setBounds(53, 224, 183, 15);

        ageTxt.setEditable(false);
        ageTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTxtActionPerformed(evt);
            }
        });
        add(ageTxt);
        ageTxt.setBounds(500, 184, 131, 23);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Age :");
        add(jLabel27);
        jLabel27.setBounds(464, 186, 31, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("PRESCRIPTION");
        add(jLabel3);
        jLabel3.setBounds(141, 260, 94, 15);

        prscrptnTxt.setColumns(20);
        prscrptnTxt.setRows(5);
        jScrollPane1.setViewportView(prscrptnTxt);

        add(jScrollPane1);
        jScrollPane1.setBounds(250, 260, 400, 86);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Patient Medical Condition :");
        add(jLabel4);
        jLabel4.setBounds(75, 186, 166, 15);

        medCondTxt.setEditable(false);
        add(medCondTxt);
        medCondTxt.setBounds(245, 184, 130, 23);

        asgndDocTxt.setEditable(false);
        add(asgndDocTxt);
        asgndDocTxt.setBounds(244, 222, 131, 23);

        sbmtBtn.setBackground(new java.awt.Color(0, 153, 255));
        sbmtBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sbmtBtn.setText("Submit");
        sbmtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmtBtnActionPerformed(evt);
            }
        });
        add(sbmtBtn);
        sbmtBtn.setBounds(250, 364, 80, 29);

        backJButton.setBackground(new java.awt.Color(0, 153, 255));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(29, 11, 90, 29);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/doctor2.gif"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(610, -100, 360, 1020);
    }// </editor-fold>//GEN-END:initComponents

    private void ageTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTxtActionPerformed

    private void sbmtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmtBtnActionPerformed
        String prescription = prscrptnTxt.getText();
        if (prescription.equals("")) {
            JOptionPane.showMessageDialog(null, "Prescription is mandatory");
            return;
        } else {
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
            if (dialogResult == JOptionPane.YES_OPTION) {
                req.setPrescription(prescription);
                req.setStatus("Prescription Provided");
                JOptionPane.showMessageDialog(null, "Prescription submitted successfully");
                sbmtBtn.setEnabled(false);
            }
        }        
    }//GEN-LAST:event_sbmtBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        jPanel.remove(this);
        Component[] componentArray = jPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;
        dwjp.pplReqTbl();
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.previous(jPanel);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTxt;
    private javax.swing.JTextField asgndDocTxt;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField fstNmTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lstNmTxt;
    private javax.swing.JTextField medCondTxt;
    private javax.swing.JTextArea prscrptnTxt;
    private javax.swing.JButton sbmtBtn;
    // End of variables declaration//GEN-END:variables


    private void pplTbl() {
        fstNmTxt.setText(req.getPatient().getPatientFirstName());
        lstNmTxt.setText(req.getPatient().getPatientLastName());
       // txtBirthDate1.setText(String.valueOf(request.getPatient().getDateOfBirth()));
        ageTxt.setText(String.valueOf(req.getPatient().getPatientAge()));
        medCondTxt.setText(req.getReasonForVisit());
        asgndDocTxt.setText(req.getAssignedDoctor().getEmployee().getName());


    }
}
