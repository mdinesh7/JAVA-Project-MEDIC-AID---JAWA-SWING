/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author dineshmurugesan
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    private OrganizationDirectory dir;
    private JPanel jPanel;
    private Enterprise entrpz;

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel(JPanel userProcessContainer, OrganizationDirectory directory,
            Enterprise enterprise) {
        initComponents();
        this.jPanel = userProcessContainer;
        this.dir = directory;
        this.entrpz = enterprise;

        pplTbl();
        pplCmbx();
    }

    private void pplCmbx() {
        organizationJComboBox.removeAllItems();
        // for (Type type : Organization.Type.values()){
        // if (!type.getValue().equals(Type.Admin.getValue()))
        // organizationJComboBox.addItem(type);
        // }
        for (Type orgType : entrpz.getAllOrganizationTypes()) {
            organizationJComboBox.addItem(orgType);
        }
    }

    private void pplTbl() {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : dir.getOrganizations()) {
            Object[] row = new Object[2];
            row[0] = organization.getOrgID();
            row[1] = organization;

            model.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        organizationJTable.setRowSorter(sorter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        lblHeaderManageOrg = new javax.swing.JLabel();
        btnDeleteOrg = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        organizationJTable.setBackground(new java.awt.Color(0, 153, 255));
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null },
                        { null, null },
                        { null, null },
                        { null, null }
                },
                new String[] {
                        "Organization Id", "Organization Name"
                }) {
            Class[] types = new Class[] {
                    java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[] {
                    false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        addJButton.setBackground(new java.awt.Color(0, 153, 255));
        addJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addJButton.setText("Add Organization");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        organizationJComboBox.setModel(
                new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Organization Type ");

        backJButton.setBackground(new java.awt.Color(0, 153, 255));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        lblHeaderManageOrg.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeaderManageOrg.setText("Manage Organizations");

        btnDeleteOrg.setBackground(new java.awt.Color(0, 153, 255));
        btnDeleteOrg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDeleteOrg.setText("Delete");
        btnDeleteOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteOrgActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mainframe.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(backJButton)
                                                .addGap(116, 116, 116)
                                                .addComponent(lblHeaderManageOrg,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 279,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(114, 114, 114)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 493,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(15, 15, 15)
                                                                .addComponent(jLabel1)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(organizationJComboBox,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        204,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(74, 74, 74)
                                                                                .addComponent(btnDeleteOrg))
                                                                        .addComponent(addJButton,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                138,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 585,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(330, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblHeaderManageOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(backJButton))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDeleteOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addGap(9, 9, 9)
                                .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 446,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(142, Short.MAX_VALUE)));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addJButtonActionPerformed

        Type type = (Type) organizationJComboBox.getSelectedItem();
        // populateTable();
        ArrayList<String> orgName = new ArrayList<String>();
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            orgName.add(model.getValueAt(i, 1).toString());
        }

        if (orgName.contains(type.getValue())) {
            JOptionPane.showMessageDialog(null, "Organization already exists!! ");
            return;
        } else {
            dir.createOrganization(type);
        }

        pplTbl();

    }// GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backJButtonActionPerformed

        jPanel.remove(this);
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.previous(jPanel);
    }// GEN-LAST:event_backJButtonActionPerformed

    private void btnDeleteOrgActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDeleteOrgActionPerformed
        // TODO add your handling code here:
        int selectedRow = organizationJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to view details", "Warning!",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            Organization organization = (Organization) organizationJTable.getValueAt(selectedRow, 1);

            entrpz.getOrganizationDirectory().getOrganizations().remove(organization);
            pplTbl();

        }

    }// GEN-LAST:event_btnDeleteOrgActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_organizationJComboBoxActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_organizationJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnDeleteOrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeaderManageOrg;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
