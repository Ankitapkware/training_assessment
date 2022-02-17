import java.util.*;

public class program8 {
	
	public static String reverseRec(String a)
	{
		if((a==null) || (a.length()<=1))
		{
			return a;
		}
		else
		{
			System.out.print(a.charAt(a.length()-1));
			return reverseRec(a.substring(0,a.length()-1));
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string: ");
		String a= sc.next();
		
		System.out.print("Recursive: ");
		System.out.print(reverseRec(a));
		
		System.out.print("\nIterative: ");
		System.out.print(reverseItr(a));

		sc.close();
		
	}

}
