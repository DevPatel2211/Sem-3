package College.lec_4;

// Employee class
class Employee {
    private String eName;
    private int basicSalary;

    // Default constructor
    public Employee() {
    }

    // Overloaded constructor
    public Employee(String name, int bs) {
        this.eName = name;
        this.basicSalary = bs;
    }

    // Copy constructor
    public Employee(Employee e) {
        this.eName = e.eName;
        this.basicSalary = e.basicSalary;
    }

    // Getter and Setter methods
    public String getEName() {
        return eName;
    }

    public void setEName(String eName) {
        this.eName = eName;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    // Calculate net income
    public int getNetIncome() {
        // Assuming some deductions for simplicity
        int deductions = 1000; // You can adjust this as needed
        return basicSalary - deductions;
    }

    // Static method to count employees
    public static int countEmployees() {
        // Implement your counting logic here
        return 0;
    }

    // Print employee details
    public void printEmployeeDetails() {
        System.out.println("Employee Name: " + eName);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Net Income: $" + getNetIncome());
    }
}

// SalesManager class, derived from Employee
class SalesManager extends Employee {
    private int salesAmount;

    // Default constructor
    public SalesManager() {
    }

    // Overloaded constructor
    public SalesManager(String name, int bs, int sa) {
        super(name, bs);
        this.salesAmount = sa;
    }

    // Override printEmployeeDetails from base class
    @Override
    public void printEmployeeDetails() {
        super.printEmployeeDetails();
        System.out.println("Sales Amount: $" + salesAmount);
    }

    // Override getNetIncome from base class
    @Override
    public int getNetIncome() {
        int baseIncome = super.getNetIncome();
        // Assuming 10% commission on sales
        int commission = (int) (salesAmount * 0.10);
        return baseIncome + commission;
    }
}

public class PayrollManagementSystem {
    public static void main(String[] args) {
        // Create Employee objects
        Employee emp1 = new Employee("John", 3000);
        Employee emp2 = new Employee("Alice", 2500);

        // Create SalesManager objects
        SalesManager manager1 = new SalesManager("Bob", 3500, 50000);
        SalesManager manager2 = new SalesManager("Eve", 3200, 60000);

        // Print employee details
        emp1.printEmployeeDetails();
        emp2.printEmployeeDetails();
        manager1.printEmployeeDetails();
        manager2.printEmployeeDetails();
    }
}
