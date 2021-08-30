package driver;

import java.util.Scanner;

import model.Department;
import model.Employee;
import service.CredentialService;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employee employee=new Employee("Sumit", "Patel");
     System.out.println("Enter your Department");
     System.out.println("1.Technical\n2.Legal\n3. HR\n4. Manager");
     Scanner sc = new Scanner(System.in);
     int choice = sc.nextInt();	
     Department department=new Department();
     CredentialService service=new CredentialService();
        switch (choice) {
        case 1:
        department.setDepName("Technical");
        String Email= service.generateEmail(employee, department);
        String Password=service.generatePassword();
        service.showCredentials(Email, Password, employee.getFirstname());
         break;
        case 2:
    	department.setDepName("Legal");
    	String Email1= service.generateEmail(employee, department);
    	String Password1= service.generatePassword();
    	service.showCredentials(Email1, Password1, employee.getFirstname());
    	break;
        case 3:
    	department.setDepName("HR");
    	String Email2= service.generateEmail(employee, department);
    	String Password2= service.generatePassword();
    	service.showCredentials(Email2, Password2, employee.getFirstname());
    	break;
        case 4:
    	department.setDepName("Manager");
    	String Email3= service.generateEmail(employee, department);
    	String Password3= service.generatePassword();
    	service.showCredentials(Email3, Password3, employee.getFirstname());
    	break;
        default:
			System.out.println("Please give a valid department no.");
		}
		sc.close();
        
     }
     

	}

