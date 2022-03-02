package classes;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.logging.Log;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;


public class Shapes {

	public static void main(String args[]) {

        ArrayList<Shape> list = new ArrayList<Shape>();
        Scanner sc=new Scanner(System.in); 
        Logger logger= Logger.getLogger(Log.class.getName());

        
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
 		         logger.log(Level.INFO, "circle object is created!");
    			 list.add(c);
    		 }
    		 
    		 else if (n == 2)
    		 {
    			 System.out.println("Enter name: ");
    			  String cname = sc.next();
    			 System.out.println("Enter details for Square: \nSide:");
    			 int a = sc.nextInt();
    			 SquareShapes s = new SquareShapes(a,cname);
    		        logger.log(Level.INFO, "Square object is created!");
    			 list.add(s);
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
 		        logger.log(Level.INFO, "Recatangle object is created!");

    			 list.add(rs);
    		 }
    		 
    		 else 
    			 System.out.println("Enter a valid shape!");
    		 
    		 
	}
        System.out.println("Enter shape name for which you need to find the area: ");
		String name = sc.next();
		int in = 0;
		for(Shape s : list) {
			if(s.nameShape.equals(name)) {

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
	