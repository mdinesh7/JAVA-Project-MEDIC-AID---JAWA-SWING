/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.NGOAdminOrganization;
import Business.Organization.NGODirectorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.NGOAdministratorRole.NGOAdministratorWorkAreaPanel;
import userinterface.NGODirectorRole.DirectorWorkAreaJPanel;


/**
 *
 * @author dineshmurugesan
 */
public class NGODirectorRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DirectorWorkAreaJPanel(userProcessContainer, account, (NGODirectorOrganization)organization, enterprise);
    }
}
