import java.util.*;

public class program3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter A: ");
	int a= sc.nextInt();
	System.out.println("Enter B: ");
	int b= sc.nextInt();
	
	if(a==b)
	{
		System.out.println("TRUE");
	}
	
	else {
		float difference = (int) ((int)b*0.1);
		if (a<=b+difference && a>=b-difference)
		{
			System.out.println("TRUE");
		}
		else System.out.println("False");
	}
	sc.close();
	}
}
