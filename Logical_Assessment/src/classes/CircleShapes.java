package classes;

public class CircleShapes extends Shape{
	int r;
	String cname;

		CircleShapes(int r, String cname) {
			super();
			this.r = r;
			nameShape = cname;
		}
		
		 String getName(String cname){
			return cname;
		}
		 
		public void area(){
			System.out.println("Area: " +Math.PI*r*r);
		}
}

