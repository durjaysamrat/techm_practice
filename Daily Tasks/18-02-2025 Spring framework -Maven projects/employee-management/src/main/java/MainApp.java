import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.company.dao.EmployeeDAO;
import com.company.model.Employee;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeDAO employeeDAO = (EmployeeDAO) context.getBean("employeeDAO");
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Get Employee by ID");
            System.out.println("5. Get All Employees");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    Employee newEmp = new Employee();
                    System.out.print("Enter Name: ");
                    newEmp.setEmpName(scanner.nextLine());
                    System.out.print("Enter Department: ");
                    newEmp.setEmpDepartment(scanner.nextLine());
                    System.out.print("Enter Salary: ");
                    newEmp.setEmpSalary(scanner.nextDouble());
                    employeeDAO.addEmployee(newEmp);
                    System.out.println("Employee added successfully.");
                    break;
                
                case 2:
                    Employee updateEmp = new Employee();
                    System.out.print("Enter Employee ID: ");
                    updateEmp.setEmpId(scanner.nextInt());
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter New Name: ");
                    updateEmp.setEmpName(scanner.nextLine());
                    System.out.print("Enter New Department: ");
                    updateEmp.setEmpDepartment(scanner.nextLine());
                    System.out.print("Enter New Salary: ");
                    updateEmp.setEmpSalary(scanner.nextDouble());
                    employeeDAO.updateEmployee(updateEmp);
                    System.out.println("Employee updated successfully.");
                    break;
                
                case 3:
                    System.out.print("Enter Employee ID to Delete: ");
                    int deleteId = scanner.nextInt();
                    employeeDAO.deleteEmployee(deleteId);
                    System.out.println("Employee deleted successfully.");
                    break;
                
                case 4:
                    System.out.print("Enter Employee ID: ");
                    int empId = scanner.nextInt();
                    Employee emp = employeeDAO.getEmployeeById(empId);
                    System.out.println(emp);
                    break;
                
                case 5:
                    List<Employee> employees = employeeDAO.getAllEmployees();
                    for (Employee e : employees) {
                        System.out.println(e);
                    }
                    break;
                
                case 6:
                    System.out.println("Exiting Employee Management System.");
                    scanner.close();
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }
}
