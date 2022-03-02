package classes;

public class ReactangleShapes extends Shape{
	int l;
	int b;
	String cname;


	ReactangleShapes(int l, int b, String cname) {
		super();
		this.l = l;
		this.b = b;
		nameShape = cname;

	}
	
	 
	@Override
	
	public void area(){
		System.out.println("Area: "  +l*b);
	}
}