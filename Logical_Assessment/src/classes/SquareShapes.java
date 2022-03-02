package classes;

public class SquareShapes extends Shape{
	int a;
	String cname;

	SquareShapes(int a, String cname) {
		super();
		this.a = a;
		nameShape = cname;
	}
	
	 String getName(String cname){
			return cname;
		}
	@Override
	
	public void area(){
		System.out.println("Area: " + a*a);
	}
	
}
