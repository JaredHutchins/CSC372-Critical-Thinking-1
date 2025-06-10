import java.util.Scanner;

/**
 * Main class to interact with users, collect info for Employee and Manager,
 * and print their details. Demonstrates basic inheritance and user input handling.
 */
public class Main {
    /**
     * Runs the program. Takes user input for both employee and manager.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get employee data from user
        Employee emp = new Employee();
        System.out.print("Enter employee first name: ");
        emp.setFirstName(scanner.nextLine());
        System.out.print("Enter employee last name: ");
        emp.setLastName(scanner.nextLine());

        int empID;
        while (true) {
            System.out.print("Enter employee ID: ");
            try {
                empID = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a whole number.");
            }
        }
        emp.setEmployeeID(empID);

        double empSalary;
        while (true) {
            System.out.print("Enter employee salary: ");
            try {
                empSalary = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid salary.");
            }
        }
        emp.setSalary(empSalary);

        System.out.println("\n=== Employee Info ===");
        emp.employeeSummary();

        // Get manager data from user
        Manager mgr = new Manager();
        System.out.print("\nEnter manager first name: ");
        mgr.setFirstName(scanner.nextLine());
        System.out.print("Enter manager last name: ");
        mgr.setLastName(scanner.nextLine());

        int mgrID;
        while (true) {
            System.out.print("Enter manager ID: ");
            try {
                mgrID = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a whole number.");
            }
        }
        mgr.setEmployeeID(mgrID);

        double mgrSalary;
        while (true) {
            System.out.print("Enter manager salary: ");
            try {
                mgrSalary = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid salary.");
            }
        }
        mgr.setSalary(mgrSalary);

        System.out.print("Enter manager department: ");
        mgr.setDepartment(scanner.nextLine());

        System.out.println("\n=== Manager Info ===");
        mgr.employeeSummary();

        scanner.close();
    }
}