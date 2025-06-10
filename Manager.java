/**
 * Manager class extends Employee and adds a department field.
 * Overrides employeeSummary to include department info.
 */
public class Manager extends Employee {
    private String department;

    /** Set the manager's department. */
    public void setDepartment(String department) {
        this.department = department;
    }

    /** Get the manager's department. */
    public String getDepartment() {
        return department;
    }

    /**
     * Print all employee details plus department.
     * Overrides the method from Employee.
     */
    @Override
    public void employeeSummary() {
        super.employeeSummary();
        System.out.println("Department: " + department);
    }
}