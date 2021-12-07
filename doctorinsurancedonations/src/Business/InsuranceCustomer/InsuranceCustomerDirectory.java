/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.InsuranceCustomer;

/**
 *
 * @author Vaishnavi
 */

import java.util.ArrayList;
import java.util.List;


public class InsuranceCustomerDirectory {

    private List<InsuranceCustomer> insuranceCustomers = new ArrayList<>();

    public List<InsuranceCustomer> getInsuranceCustomers() {
        return insuranceCustomers;
    }

    public void setInsuranceCustomers(List<InsuranceCustomer> insuranceCustomers) {
        this.insuranceCustomers = insuranceCustomers;
    }

    @Override
    public String toString() {
        return "InsuranceCustomerDirectory{" + "insuranceCustomers=" + insuranceCustomers + '}';
    }

}
