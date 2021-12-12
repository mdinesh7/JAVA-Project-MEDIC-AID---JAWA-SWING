/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author dineshmurugesan
 */
public class EmployeeDirectory {

    private ArrayList<Employee> empList;

    public EmployeeDirectory() {
        empList = new ArrayList();
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public Employee createEmployee(String name) {
        Employee employee = new Employee();
        employee.setEmpName(name);
        empList.add(employee);
        return employee;
    }
}
