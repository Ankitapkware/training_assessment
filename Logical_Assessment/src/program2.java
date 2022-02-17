import java.util.*;

public class program2 {
	public static void main(String[] args) {
		char[] arr={'3','2','*','#','7','8','$','5','&','9'};
		
		int k= arr.length;
		for(int i=0; i<arr.length; i++) {}
		
	int[] numbers = new int[k];
	char[] specialChar = new char[k];
	int index=0;
	
	/*for(char j=0;j<=k; j++)
	{
		if(j>='0' && j<='9')
		{
			
		}
		else
		{
			specialChar[index++]=j;
		}
	}*/
	
		System.out.println("numbers:");
		for(int i=0; i<index;i++)
		{System.out.print(numbers[i]);
		}
		
		System.out.println("special characters:");
		for(int i=0; i<index;i++)
			System.out.print(specialChar[i]);
		
		}
		
}

