package classes;

public class ReactangleShapes extends Shapes{
	int l;
	int b;
	String cname;


	ReactangleShapes(int l, int b, String cname) {
		super();
		this.l = l;
		this.b = b;
		this.cname = cname;

	}
	
	@Override
	
	public double area(){
		return  l*b;
	}
}