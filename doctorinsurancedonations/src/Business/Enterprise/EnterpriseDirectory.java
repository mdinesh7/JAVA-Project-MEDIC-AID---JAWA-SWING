/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author dineshmurugesan
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> entList;
   

    public ArrayList<Enterprise> getEntList() {
        return entList;
    }

    public void setEntList(ArrayList<Enterprise> entList) {
        this.entList = entList;
    }
    
    public EnterpriseDirectory(){
        entList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise crtAndAddEnt(String name,Enterprise.EntType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EntType.HealthCenter){
            enterprise=new HealthCenterEnterprise(name);
            entList.add(enterprise);
        }
        
        else if(type == Enterprise.EntType.Government)
        {
            enterprise =  new GovernmentEnterprise(name);
            entList.add(enterprise);
            
        }
        
        else if(type == Enterprise.EntType.InsuranceCompany)
        {
            enterprise = new InsuranceCompanyEnterprise(name);
            entList.add(enterprise);
            
            
        }
        else if(type == Enterprise.EntType.NGO)
        {
            enterprise = new NGOEnterprise(name);
            entList.add(enterprise);
            
        }
        return enterprise;
    }
}
