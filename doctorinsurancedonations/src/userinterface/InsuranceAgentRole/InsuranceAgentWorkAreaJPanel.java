/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InsuranceAgentRole;

import Business.Enterprise.Enterprise;
import Business.Organization.InsuranceAgentOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.UUID;
import javax.swing.JPanel;

/**
 *
 * @author bunty
 */
public class InsuranceAgentWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InsuranceAgentWorkAreaJPanel
     */
    private JPanel jPanel;
    private UserAccount usrAcnt;
    private InsuranceAgentOrganization insrAgntOrg;
    private Enterprise entrpz;

    public InsuranceAgentWorkAreaJPanel(JPanel jpanel, UserAccount userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
        this.jPanel = jpanel;
        this.usrAcnt = userAccount;
        this.insrAgntOrg = (InsuranceAgentOrganization) organization;
        this.entrpz = enterprise;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {


        addNewUsrBtn = new javax.swing.JButton();
        prcsInsrReqBtn = new javax.swing.JButton();

        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);


        addNewUsrBtn.setBackground(new java.awt.Color(0, 153, 255));
        addNewUsrBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addNewUsrBtn.setText("Add New Customer");
        addNewUsrBtn.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewUsrBtnActionPerformed(evt);
            }
        });

        add(addNewUsrBtn);
        addNewUsrBtn.setBounds(0, 10, 184, 41);

        prcsInsrReqBtn.setBackground(new java.awt.Color(0, 153, 255));
        prcsInsrReqBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        prcsInsrReqBtn.setText("Process Insurance Requests");
        prcsInsrReqBtn.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prcsInsrReqBtnActionPerformed(evt);
            }
        });

        add(prcsInsrReqBtn);
        prcsInsrReqBtn.setBounds(490, 380, 200, 39);


        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/policy planner.web.gif"))); // NOI18N
        add(jLabel2);

        jLabel2.setBounds(1, 5, 690, 430);

    }// </editor-fold>//GEN-END:initComponents

    private void addNewUsrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewUsrBtnActionPerformed
        String plcyNum = UUID.randomUUID().toString().substring(0, 7);
        CardLayout layout = (CardLayout) jPanel.getLayout();
        jPanel.add("AddNewPolicyHolderJPanel", new AddNewPolicyHolderJPanel(jPanel, usrAcnt, entrpz, plcyNum));
        layout.next(jPanel);

    }//GEN-LAST:event_addNewUsrBtnActionPerformed

    private void prcsInsrReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prcsInsrReqBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) jPanel.getLayout();
        jPanel.add("ProcessInsuranceRequestsJPanel", new AllInsuranceRequestsJPanel(jPanel, usrAcnt, entrpz, insrAgntOrg));
        layout.next(jPanel);
    }//GEN-LAST:event_prcsInsrReqBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables

    private javax.swing.JButton addNewUsrBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton prcsInsrReqBtn;

    // End of variables declaration//GEN-END:variables
}
