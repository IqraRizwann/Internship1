package Internship;
import java.util.Scanner;
import java.util.ArrayList;
class Employee{
    private String name;
    private int id;
    private double hourlyRate;
    private double hoursWorked;

    public Employee(String name, int id){
        this.name = name;
        this.id = id;
        this.hourlyRate = hourlyRate;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
    return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHourlyRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate(){
    return  hourlyRate;
    }
  

    public void setHoursWorked(double hoursWorked){
        this.hoursWorked = hoursWorked;
    }

    public double totalSalary(){
        return hourlyRate*hoursWorked;
    }

    public void generatePayStub(){

        System.out.println("Pay Stub for Employee: "+name);
        System.out.println("Employee ID: "+id);
        System.out.println("Hourly Rate: "+hourlyRate);
        System.out.println("Hours Worked: "+hoursWorked);
        System.out.println("Total Salary: "+totalSalary());
    }
}

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> emps = new ArrayList<Employee>(); 

        while (true) {
            System.out.println("Payroll System Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Calculate Salary");
            System.out.println("3. Generate Pay Stub");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter employee name: ");
                    String name = sc.next();
                    System.out.print("Enter employee ID: ");
                    int id = sc.nextInt();
                    Employee employee = new Employee(name, id);
                    emps.add(employee);
                    System.out.println("Employee added successfully.");
                    break;
                case 2:
                    System.out.print("Enter employee ID: ");
                    int searchId = sc.nextInt();
                    System.out.print("Enter hourly rate: ");
                    double hourlyRate = sc.nextDouble();
                    System.out.println("Hours worked: ");
                    double hoursWorked = sc.nextDouble();
                    
                    double totalSalary= hourlyRate*hoursWorked;
                    for (Employee emp : emps) {
                        if (emp.getId() == searchId) { 
                            System.out.println("Salary for employee "  + ": $" +totalSalary);
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter employee ID: ");
                    int searchId2 = sc.nextInt();
                    for (Employee emp : emps) {
                        if (emp.getId() == searchId2) {
                            emp.generatePayStub();
                            break;
                        }
                    }
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }


    }   
}
