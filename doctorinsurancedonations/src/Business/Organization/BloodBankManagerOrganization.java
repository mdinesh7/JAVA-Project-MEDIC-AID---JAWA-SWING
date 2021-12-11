/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.BloodBankManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bunty
 */
public class BloodBankManagerOrganization extends Organization{
    
    public BloodBankManagerOrganization() {
        super(Organization.Type.BloodBank.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BloodBankManagerRole());
        return roles;
    }
     
   
    
    
}

