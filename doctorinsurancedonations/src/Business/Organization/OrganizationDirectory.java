/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import static Business.Organization.Organization.Type.InsuranceFinanceOrganization;
import java.util.ArrayList;


public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizations() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        
        //Adding HealthCenter Organizations
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        
         else if(type.getValue().equals(Type.Patient.getValue()))
        {
            organization = new PatientOrganization();
            organizationList.add(organization);
                    
        }
        
        else if(type.getValue().equals(Type.Accountant.getValue()))
        {
            organization = new AccountantOrganization();
            organizationList.add(organization);
                    
        }
        
        //Adding Government Organizations
        
        else if(type.getValue().equals(Type.HealthcareOfficer.getValue()))
        {
            organization = new HealthCareOfficerOrganization();
            organizationList.add(organization);
                    
        }
        
         else if(type.getValue().equals(Type.Secretary.getValue()))
        {
            organization = new SecretaryOrganization();
            organizationList.add(organization);
                    
        }
         else if(type.getValue().equals(Type.Treasurer.getValue()))
        {
            organization = new TreasurerOrganization();
            organizationList.add(organization);
                    
        }
                //Adding Insurance Organizations
                
          else if(type.getValue().equals(Type.InsuranceAgent.getValue()))
        {
            organization = new InsuranceAgentOrganization();
            organizationList.add(organization);
                    
        } 
          else if(type.getValue().equals(Type.InsuranceFinanceOrganization.getValue()))
        {
            organization = new InsuranceFinanceOrganization();
            organizationList.add(organization);
                    
        }
          else if(type.getValue().equals(Type.InsurancePolicyPlanner.getValue()))
        {
            organization = new InsurancePolicyPlannerOrganization();
            organizationList.add(organization);
                    
        }
        
        

       
        return organization;
    }
}