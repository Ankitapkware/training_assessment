package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Shapes {
	public static void main(String args[]) {

        ArrayList<Shapes> list = new ArrayList<Shapes>();
        Scanner sc=new Scanner(System.in);  
               
        System.out.print("choose the shape: ");  
    		 int n=sc.nextInt();  

    		 if (n == 1) {
    			 System.out.println("Enter details for Circle: \nRadius:");
    			 int r = sc.nextInt();
    			 CircleShapes c = new CircleShapes(r);
    			 list.add(c);
    			 System.out.println("area: " + c.area() );
    		 }
    		 
    		 else if (n == 2)
    		 {
    			 System.out.println("Enter details for Square: \nSide:");
    			 int a = sc.nextInt();
    			 SquareShapes s = new SquareShapes(a);
    			 list.add(s);
    			 System.out.println("area: " + s.area() );
    		 }
    		 
    		 else if (n == 3)
    		 {
    			 System.out.println("Enter details for Rectangle: \nLength:");
    			 int l = sc.nextInt();
    			 System.out.println("Breadth:");
    			 int b = sc.nextInt();
    			 ReactangleShapes rs = new ReactangleShapes(l,b);
    			 list.add(rs);
    			 System.out.println("area: " + rs.area() );
    		 }
    		 
    		 else 
    			 System.out.println("Enter a valid shape!");
	}

	public double area() {
		return 0;
	}
	
}
	