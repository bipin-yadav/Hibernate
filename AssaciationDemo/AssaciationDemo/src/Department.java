
import java.util.Set;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bipin yadav
 */
public class Department {
    private int deptId;
    private String deptName;
    Set<Employee> employees;

    /**
     * @return the deptId
     */
    public int getDeptId() {
        return deptId;
    }

    /**
     * @param deptId the deptId to set
     */
    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    /**
     * @return the deptName
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * @param deptName the deptName to set
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * @return the employees
     */
    public Set<Employee> getEmployees() {
        return employees;
    }

    /**
     * @param employees the employees to set
     */
    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
    
    
    
}
