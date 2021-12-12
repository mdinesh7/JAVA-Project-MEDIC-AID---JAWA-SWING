/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import static Business.Organization.Organization.Type.InsuranceFinanceOrganization;
import java.util.ArrayList;

public class OrganizationDirectory {

    private ArrayList<Organization> orgList;

    public OrganizationDirectory() {
        orgList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizations() {
        return orgList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;

        // Adding HealthCenter Organizations
        if (type.getValue().equals(Type.Doctor.getValue())) {
            organization = new DoctorOrganization();
            orgList.add(organization);
        } else if (type.getValue().equals(Type.Lab.getValue())) {
            organization = new LabOrganization();
            orgList.add(organization);
        }

        else if (type.getValue().equals(Type.Patient.getValue())) {
            organization = new PatientOrganization();
            orgList.add(organization);

        }

        else if (type.getValue().equals(Type.Accountant.getValue())) {
            organization = new AccountantOrganization();
            orgList.add(organization);

        } else if (type.getValue().equals(Type.BloodBank.getValue())) {
            organization = new BloodBankManagerOrganization();
            orgList.add(organization);

        }

        // Adding Government Organizations

        else if (type.getValue().equals(Type.HealthcareOfficer.getValue())) {
            organization = new HealthCareOfficerOrganization();
            orgList.add(organization);

        }

        else if (type.getValue().equals(Type.Secretary.getValue())) {
            organization = new SecretaryOrganization();
            orgList.add(organization);

        } else if (type.getValue().equals(Type.Treasurer.getValue())) {
            organization = new TreasurerOrganization();
            orgList.add(organization);

        }
        // Adding Insurance Organizations

        else if (type.getValue().equals(Type.InsuranceAgent.getValue())) {
            organization = new InsuranceAgentOrganization();
            orgList.add(organization);

        } else if (type.getValue().equals(Type.InsuranceFinanceOrganization.getValue())) {
            organization = new InsuranceFinanceOrganization();
            orgList.add(organization);

        } else if (type.getValue().equals(Type.InsurancePolicyPlanner.getValue())) {
            organization = new InsurancePolicyPlannerOrganization();
            orgList.add(organization);

        }
        // Adding NGO Organizations

        else if (type.getValue().equals(Type.NGOAdministrator.getValue())) {
            organization = new NGOAdminOrganization();
            orgList.add(organization);

        }

        else if (type.getValue().equals(Type.Director.getValue())) {
            organization = new NGODirectorOrganization();
            orgList.add(organization);

        }
        return organization;
    }
}