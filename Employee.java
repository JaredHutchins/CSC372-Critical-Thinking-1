/**
 * Represents a basic employee with name, ID, and salary.
 * Includes methods to set and get each field, and a summary printer.
 */
public class Employee {
    private String firstName;
    private String lastName;
    private int employeeID;
    private double salary;

    /** 
     * Constructor initializes salary to zero. 
     */
    public Employee() {
        this.salary = 0.0;
    }

    /** Set the employee's first name. */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /** Get the employee's first name. */
    public String getFirstName() {
        return firstName;
    }

    /** Set the employee's last name. */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /** Get the employee's last name. */
    public String getLastName() {
        return lastName;
    }

    /** Set the employee ID number. */
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    /** Get the employee ID number. */
    public int getEmployeeID() {
        return employeeID;
    }

    /** Set the employee's salary. */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /** Get the employee's salary. */
    public double getSalary() {
        return salary;
    }

    /**
     * Print all employee details to console.
     */
    public void employeeSummary() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Salary: $" + salary);
    }
}