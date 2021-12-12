/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import java.util.List;

public class UserAccount {

    private String uname;
    private String pwd;
    private Employee emp;
    private Role role;
    private WorkQueue wrkQ;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UserAccount() {
        wrkQ = new WorkQueue();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Role getRole() {
        return role;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmp() {
        return emp;
    }

    public WorkQueue getWrkQ() {
        return wrkQ;
    }

    @Override
    public String toString() {
        return uname;
    }

}