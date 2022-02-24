package classes;

public class SquareShapes extends Shapes{
	int a;

	SquareShapes(int a) {
		super();
		this.a = a;
	}
	
	@Override
	
	public double area(){
		return  a*a;
	}
}
