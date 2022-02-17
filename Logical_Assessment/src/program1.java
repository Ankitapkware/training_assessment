
public class program1 {
	
		
		public static void main(String[] args) {
			double[] arr= {5,-10,-150.2,-86.7,-63.9};
			float sum=0;
			
			for (int i=0;i<arr.length;i++) {
				sum += arr[i];
			}		
			float avg = sum/arr.length; 
			System.out.println(avg);		
		}
}
//format("Average is %.2f", avg);		