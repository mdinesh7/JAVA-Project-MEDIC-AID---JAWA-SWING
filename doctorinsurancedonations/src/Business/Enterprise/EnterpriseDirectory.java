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
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EntType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EntType.HealthCenter){
            enterprise=new HealthCenterEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if(type == Enterprise.EntType.Government)
        {
            enterprise =  new GovernmentEnterprise(name);
            enterpriseList.add(enterprise);
            
        }
        
        else if(type == Enterprise.EntType.InsuranceCompany)
        {
            enterprise = new InsuranceCompanyEnterprise(name);
            enterpriseList.add(enterprise);
            
            
        }
        else if(type == Enterprise.EntType.NGO)
        {
            enterprise = new NGOEnterprise(name);
            enterpriseList.add(enterprise);
            
        }
        return enterprise;
    }
}
