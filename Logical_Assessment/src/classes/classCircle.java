package classes;

import java.util.*;

class Circle{
	 private static String name; 
	 private static int radius=0;
	 private String color;
	 
	/* void circle(String name, int radius, String color) {
		 this.name = name;
		 this.radius = radius;
		 this.color = color;
	 }*/
	 
	public static String getName() {
		 return name;
	 }
	
	public void setName(String name) {
		this.name = name;
	 }
	 
	public static int getRadius() {
		 return radius;
	 }
	
	public void setRadius(int radius) {
		this.radius = radius;
	 }
	
	public String getColor() {
		 return color;
	 }
	
	public void setColor(String color) {
		this.color = color;
	 }


}

public class classCircle {
	 
	public static void main(String args[]) {

	        ArrayList<Circle> cir = new ArrayList<Circle>();
	        Scanner sc=new Scanner(System.in);  
	               
	        System.out.print("Enter the number of circles you want to store: ");  
	    		 int n=sc.nextInt();  
	    		 Circle circleObj;
	    	
	    		 for (int i=1; i<=n ; i++) {
	    		
	        String n1=sc.next();
	        int r1=sc.nextInt();
	        String c1=sc.next();
	
	        for(Circle circle : cir) {
	        	circleObj = new Circle();
	        	circleObj.setName(n1);
	        	circleObj.setRadius(r1);
	        	circleObj.setColor(c1);
	        	cir.add(circleObj);
	        	
	        }      
	 }
	    		 
	    		System.out.println("Name of circle, for area:");
	 	        String nameAr = sc.next();
	 	        for(int j=1; j<cir.size(); j++) {
	 	        	Circle circ = cir.get(j);
	 	        	
	 	        	if(nameAr.equals(circ.getName())) {
	 	        		 int r = circ.getRadius();
	 	        		 double area= 3.14*r*r;
	 	        		 System.out.println("Area is: " + area);
	 	        	}
	 	        	else
	 	        		System.out.println("Enter a valid name");
	 	        }
	    
	 }

	}

