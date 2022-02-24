package employee;

import java.util.ArrayList;
import java.util.Scanner;

class PersonalDetails{
	String name;
	int id;
	String email;
	int empType;
	
	PersonalDetails(String name, int id, String email, int empType) {
		 this.name = name;
		 this.id = id;
		 this.email = email;
		 this.empType = empType;
	 }
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getEmpType() {
		return empType;
	}
	public void setEmpType(int empType) {
        this.empType = empType;		
	}

	public void setEmail(String email) {
		this.email = email;	
	}

	public void setId(int id) {
		this.id = id;		
	}

	public void setName(String name) {
	     this.name = name;			
	}
	
}

public class EnhancedPayroll {

	public static void main(String[] args) {
		
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter number of employees: ");
		   int n = sc.nextInt();
		   
		   ArrayList<PersonalDetails> list = new ArrayList<>();
		   
  		 for (int i=1; i<=n ; i++) {

		   System.out.println("Enter name of the employee: ");
		   String name = sc.next();
		   
		   int id = sc.nextInt();
		   String email = sc.next();

		   System.out.println("Choose \n1 \n2 \n3 \n4 "); 
		   int empType = sc.nextInt();
		   PersonalDetails details = new PersonalDetails(name, id, email, empType);
		   list.add(details);
  		 
  		 }
		
		System.out.println("Name of Employee, for salary:");
	        String nameEmp = sc.next();
	        for(int j=1; j<list.size(); j++) {
	        	PersonalDetails d = list.get(j);
	        	
	        	if(nameEmp.equals(d.getName())) {
	    
	        		int type = d.getEmpType();
	        		
	        		int[] arr = {1,2,3,4};
	        		 if ( type == arr[0]) {
	        			 float salary = 50000;
	      			   System.out.println("Salary of salaried employees is: " + salary );
	      		   }
	      		   
	      		   else if(type == arr [1]) {
	      			   System.out.println("Enter the salary by hours of hourly-emplyees");
	      			   float salPerHour = sc.nextFloat();
	      			   System.out.println("Enter the number of hours of hourly-emplyees, to calculate payroll: ");
	      			   int hourEmp = sc.nextInt();
	      			   System.out.println("Enter number of hours of overtime, if any: ");
	      			   int overtimeHours = sc.nextInt();
	      			   if(hourEmp <= 40) {
	      				   System.out.println("Salary of hourly employees is: " + salPerHour*hourEmp );
	      			   }
	      			   else {
	      				   double overtime = overtimeHours*1.5 *hourEmp;
	      				   double sal = (salPerHour*40) + overtime;
	      				   System.out.println("Salary of hourly employees is: " + sal );
	      			   }
	      			   }
	      		   
	      		   else if(type == arr[2]) {
	      			   System.out.println("Enter the value of sales: ");
	      			   float sales = sc.nextFloat();
	      			   System.out.println("Sales salary is: " + sales*0.15);
	      		   }
	      		   
	      		   else if(type == arr[3]) {
	      			   System.out.println("Enter the base salary: ");
	      				   float baseSal = sc.nextFloat();
	      				   System.out.println("Enter the base salary: ");
	      				   float sales = sc.nextFloat();
	      				   
	      				   baseSal += baseSal*0.1;
	      				   baseSal += sales*0.12;
	      				   System.out.println("salary is: " + baseSal);
	      		   }
	      		   
	      		   else 
	      			   System.out.println("Enter a valid number!");
	      		   
	      		   
	        	}
	        	else
	        		System.out.println("Enter a valid name");
		   
         }
	}

	
}
	


