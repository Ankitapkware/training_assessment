package classes;

public class SquareShapes extends Shapes{
	int a;
	String cname;

	SquareShapes(int a, String cname) {
		super();
		this.a = a;
		this.cname = cname;
	}
	
	@Override
	
	public double area(){
		return  a*a;
	}
}
