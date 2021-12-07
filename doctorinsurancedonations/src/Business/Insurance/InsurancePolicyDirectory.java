/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Insurance;

/**
 *
 * @author Pooja
 */

import java.util.ArrayList;
import java.util.List;

public class InsurancePolicyDirectory {

    private List<Insurance> policies = new ArrayList<>();

    public List<Insurance> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Insurance> policies) {
        this.policies = policies;
    }
    
}
