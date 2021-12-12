/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NGOAdministratorRole;

import userinterface.HealthcareOfficerRole.*;
import userinterface.NGOAdministratorRole.NGOAdministratorWorkAreaPanel;
import Business.Enterprise.Enterprise;
import Business.Organization.NGODirectorOrganization;
import Business.Organization.Organization;
import Business.Organization.SecretaryOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GovernmentFundRequest;
import Business.WorkQueue.NGOFundRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author dineshmuurgesan
 */
public class NGOAdministratorProcessWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    private JPanel jPanel;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private NGOFundRequest ngoFundRequest;
    private OfficerWorkAreaJPanel officerWorkAreaJPanel;

    public NGOAdministratorProcessWorkRequestJPanel(JPanel jPanel, UserAccount userAccount, NGOFundRequest fundRequest, Enterprise enterprise) {
        initComponents();

        this.jPanel = jPanel;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.ngoFundRequest = fundRequest;
        amountNeededTxt.setText(String.valueOf(ngoFundRequest.getNeededamtreq()));
        hospitalNameTxt.setText(ngoFundRequest.getHospname());
        hospitalAddressTxt.setText(String.valueOf(ngoFundRequest.getHospaddress()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        amountNeededTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        messageTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sendRequestToDirectoryBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        hospitalNameTxt = new javax.swing.JTextField();
        hospitalAddressTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnReject = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        amountNeededTxt.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Amount Needed:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Message:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("NGO Admin Request Process area ");

        sendRequestToDirectoryBtn.setBackground(new java.awt.Color(0, 153, 255));
        sendRequestToDirectoryBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sendRequestToDirectoryBtn.setText("Send Request to Director to approve");
        sendRequestToDirectoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendRequestToDirectoryBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(0, 153, 255));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Hospital Name:");

        hospitalNameTxt.setEnabled(false);

        hospitalAddressTxt.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Hospital Address:");

        btnReject.setBackground(new java.awt.Color(0, 153, 255));
        btnReject.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(38, 38, 38)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(amountNeededTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hospitalNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel5))
                                    .addGap(38, 38, 38)
                                    .addComponent(hospitalAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(messageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(sendRequestToDirectoryBtn)
                            .addGap(39, 39, 39)
                            .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(191, 191, 191))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(hospitalNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountNeededTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hospitalAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendRequestToDirectoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(207, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        jPanel.remove(this);
        Component[] componentArray = jPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        NGOAdministratorWorkAreaPanel ngoAdministratorWorkAreaJPanel = (NGOAdministratorWorkAreaPanel) component;
        ngoAdministratorWorkAreaJPanel.populateRequestTable();
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.previous(jPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void sendRequestToDirectoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendRequestToDirectoryBtnActionPerformed
        // TODO add your handling code here:

        String message = messageTxt.getText();
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is mandatory!");
            return;
        } else {
            ngoFundRequest.setMessage(message);

            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");

            if (dialogResult == JOptionPane.YES_OPTION) {

                ngoFundRequest.setSender(userAccount);
                ngoFundRequest.setStatus("Sent to Director");

                Organization org = null;
                for (Organization organization : enterprise.getOrgDir().getOrganizations()) {
                    if (organization instanceof NGODirectorOrganization) {
                        org = organization;
                        break;
                    }
                }
                if (org != null) {
                    org.getWorkQueue().getWorkRequests().add(ngoFundRequest);
                    userAccount.getWorkQueue().getWorkRequests().add(ngoFundRequest);
                }
                JOptionPane.showMessageDialog(null, "Request to Director Successful!!!");
                messageTxt.setText("");
                btnReject.setEnabled(false);
                sendRequestToDirectoryBtn.setEnabled(false);
            }
            messageTxt.setText("");
        }

    }//GEN-LAST:event_sendRequestToDirectoryBtnActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        String message = messageTxt.getText();
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is mandatory!");
            return;
        } else {
            ngoFundRequest.setMessage(message);
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");

            if (dialogResult == JOptionPane.YES_OPTION) {
                ngoFundRequest.setStatus("Rejected");
                messageTxt.setText("");
                btnReject.setEnabled(false);
                sendRequestToDirectoryBtn.setEnabled(false);
            }

            messageTxt.setText("");
        }
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountNeededTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnReject;
    private javax.swing.JTextField hospitalAddressTxt;
    private javax.swing.JTextField hospitalNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField messageTxt;
    private javax.swing.JButton sendRequestToDirectoryBtn;
    // End of variables declaration//GEN-END:variables
}
