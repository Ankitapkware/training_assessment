package employee;

import java.util.Scanner;

class Payroll{  
	 float salary=50000;  
	}  
	

class finalPayroll extends Payroll{

	int bonus=0;  
	
	public static void main(String[] args) {
		
		finalPayroll f = new finalPayroll();  
		   System.out.println("Types of Employee: ");  
		   System.out.println("1 \n2 \n3 \n4 "); 
		   int[] arr = {1,2,3,4};
		   
		   System.out.println("Enter the number for employee, to calculate payroll: ");  

		   Scanner sc = new Scanner(System.in);
		   int i = sc.nextInt();

		   if (i == arr[0]) {
			   System.out.println("Salary of salaried employees is: " +f.salary );
		   }
		   
		   else if(i == arr [1]) {
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
		   
		   else if(i == arr[2]) {
			   System.out.println("Enter the value of sales: ");
			   float sales = sc.nextFloat();
			   System.out.println("Sales salary is: " + sales*0.15);
		   }
		   
		   else if(i == arr[3]) {
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
}
	


