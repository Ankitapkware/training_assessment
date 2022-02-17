import java.util.Scanner;

//import java.util.*;
public class program5 {

	public static void shiftZeroes(int[] arr) {
		int len=arr.length;
		int index=0;
		
		for(int i=0; i<len; i++) {
			if (arr[i] != 0); 
			{
				arr[index++]=arr[i];
			}					
		}		
		while(index<len) 
		{
			arr[index++]=0;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j] + " ");
		}	
		shiftZeroes(arr);	
		
	
}
}
