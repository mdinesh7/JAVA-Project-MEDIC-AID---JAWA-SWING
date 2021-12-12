package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;


public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem ecosystem = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = ecosystem.getEmpDir().createEmployee("sysadmin");
        
        UserAccount userAccount = ecosystem.getUsrAccDir().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return ecosystem;
    }
    
}
