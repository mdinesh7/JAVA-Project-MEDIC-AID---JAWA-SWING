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

    private InsuranceCustomerDirectory insCustDir;

    private InsurancePolicyDirectory insPlcyDir;

    public InsuranceCompanyEnterprise(String name) {
        super(name, EntType.InsuranceCompany);
        insCustDir = new InsuranceCustomerDirectory();
        insPlcyDir = new InsurancePolicyDirectory();

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

    public InsuranceCustomerDirectory getInsCustDir() {
        return insCustDir;
    }

    public void setInsCustDir(InsuranceCustomerDirectory insCustDir) {
        this.insCustDir = insCustDir;
    }

    public InsurancePolicyDirectory getInsPlcyDir() {
        return insPlcyDir;
    }

    public void setInsPlcyDir(InsurancePolicyDirectory insPlcyDir) {
        this.insPlcyDir = insPlcyDir;
    }

}
