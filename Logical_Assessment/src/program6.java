import java.util.Scanner;

public class program6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=n; i>=1; i--) {
			for(int j=i;j>0;j--) {
				System.out.print(j);
			}
			System.out.print("\n");
					}
		sc.close();
	}

}
