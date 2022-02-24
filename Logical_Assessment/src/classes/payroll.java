package classes;

import java.util.Scanner;

class Payroll{  
	 float salary=50000;  
	}  
	
class baseSalaryc extends Payroll {
	
	 int bonus=0;  

public static void main(String[] args) {

   	   baseSalaryc p = new baseSalaryc();  
	   System.out.println("Types of Employee: ");  
	   System.out.println("1 \n2 \n3 \n4 "); 
	   int[] arr = {1,2,3,4};
	   
	   System.out.println("Enter the number of employee, for which you want payroll: ");  

	   Scanner sc = new Scanner(System.in);
	   int i = sc.nextInt();

	//   for(int j=0; j<arr.length; j++ ) {
	   if (i == arr[0]) {
		   System.out.println("Salary of salaried employees is: " +p.salary );
	   }
}
}
//}