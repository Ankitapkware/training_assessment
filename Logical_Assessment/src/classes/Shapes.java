package classes;

import java.util.ArrayList;
import java.util.Scanner;

class  Shape{
	String cname;

}

public class Shapes {
	private Object cname;
	public double area() {
		return 0;
	}
	public static void main(String args[]) {

        ArrayList<Shapes> list = new ArrayList<Shapes>();
        Scanner sc=new Scanner(System.in); 
        
        System.out.println("Enter the number of shapes you want to enter: ");
        try {
        int num = sc.nextInt();
        if (num<0) {
        	System.out.println("Enter number greater than 0");
        }
        for(int i=0; i<num; i++) {
               
        System.out.print("choose the number for shape: \t1 Circle \t2 Square \t3 Rectangle");  
    		 int n=sc.nextInt();  

    		 if (n == 1) {
    			 System.out.println("Enter details for Circle: \nRadius:");
    			 System.out.println("Enter name: ");
    			 String cname = sc.next();
    			 int r = sc.nextInt();
    			 CircleShapes c = new CircleShapes(r,cname);
    			 list.add(c);
    			// System.out.println("area: " + c.area() );
    		 }
    		 
    		 else if (n == 2)
    		 {
    			 System.out.println("Enter name: ");
    			 String cname = sc.next();
    			 System.out.println("Enter details for Square: \nSide:");
    			 int a = sc.nextInt();
    			 SquareShapes s = new SquareShapes(a,cname);
    			 list.add(s);
    		//	 System.out.println("area: " + s.area() );
    		 }
    		 
    		 else if (n == 3)
    		 {
    			 System.out.println("Enter name: ");
    			 String cname = sc.next();
    			 System.out.println("Enter details for Rectangle: \nLength:");
    			 int l = sc.nextInt();
    			 System.out.println("Breadth:");
    			 int b = sc.nextInt();
    			 ReactangleShapes rs = new ReactangleShapes(l,b,cname);
    			 list.add(rs);
    		//	 System.out.println("area: " + rs.area() );
    		 }
    		 
    		 else 
    			 System.out.println("Enter a valid shape!");
    		 
    		 
	}
        System.out.println("Enter shape name for which you need to find the area: ");
		String name = sc.next();
		int in=0;
		for(Shapes s : list) {
			if(s.cname.equals(name)) {
				in++;
				s.area();
			}
			else {

				System.out.println("No Shape");
			}
		}
           	   
       }
	catch (Exception e) {
		   System.out.println(e);
	}

	}
	}
	