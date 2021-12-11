/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Insurance.InsurancePolicyDirectory;
import Business.InsuranceCustomer.InsuranceCustomerDirectory;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;
//import java.util.List;
import java.util.List;

/**
 *
 * @author dineshmurugesan
 */
public class InsuranceCompanyEnterprise extends Enterprise {

    private InsuranceCustomerDirectory insuranceCustomerDirectory;

    private InsurancePolicyDirectory insurancePolicyDirectory;

    public InsuranceCompanyEnterprise(String name) {
        super(name, EnterpriseType.InsuranceCompany);
        insuranceCustomerDirectory = new InsuranceCustomerDirectory();
        insurancePolicyDirectory = new InsurancePolicyDirectory();

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public List<Organization.Type> getAllOrganizationTypes() {
        List<Organization.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Organization.Type.InsuranceAgent);
        orgTypes.add(Organization.Type.InsurancePolicyPlanner);
        orgTypes.add(Organization.Type.InsuranceFinanceOrganization);

        return orgTypes;
    }

    public InsuranceCustomerDirectory getInsuranceCustomerDirectory() {
        return insuranceCustomerDirectory;
    }

    public void setInsuranceCustomerDirectory(InsuranceCustomerDirectory insuranceCustomerDirectory) {
        this.insuranceCustomerDirectory = insuranceCustomerDirectory;
    }

    public InsurancePolicyDirectory getInsurancePolicyDirectory() {
        return insurancePolicyDirectory;
    }

    public void setInsurancePolicyDirectory(InsurancePolicyDirectory insurancePolicyDirectory) {
        this.insurancePolicyDirectory = insurancePolicyDirectory;
    }

}
