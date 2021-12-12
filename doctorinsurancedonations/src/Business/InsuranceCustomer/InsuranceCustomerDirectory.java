/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.InsuranceCustomer;

/**
 *
 * @author bunty
 */

import java.util.ArrayList;
import java.util.List;


public class InsuranceCustomerDirectory {

    private List<InsuranceCustomer> insCust = new ArrayList<>();

    public List<InsuranceCustomer> getInsCust() {
        return insCust;
    }

    public void setInsCust(List<InsuranceCustomer> insCust) {
        this.insCust = insCust;
    }

    @Override
    public String toString() {
        return "InsuranceCustomerDirectory{" + "insuranceCustomers=" + insCust + '}';
    }

}
