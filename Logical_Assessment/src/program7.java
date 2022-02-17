import java.util.*;
public class program7 {

	public static int sumRecursive(int i){
		int sum = i%10;
		if(i==0)
		{
			return 0;
		}
		else {
			return sum + sumRecursive(i/10);
		}	
	}
	
	public static int sumItr(int i) 
	{
		int sum=0;	
		while(i!=0)
		{
			sum=sum+i%10;
			i=i/10;
		}
		return sum;	
		}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int i= sc.nextInt();
		
		System.out.print("Recursive: ");
		System.out.print(sumRecursive(i) );
		
		System.out.print("\nIterative:" );
		System.out.print(sumItr(i));

		sc.close();
	}
}
