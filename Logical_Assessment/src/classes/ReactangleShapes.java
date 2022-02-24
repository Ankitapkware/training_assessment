package classes;

public class ReactangleShapes extends Shapes{
	int l;
	int b;


	ReactangleShapes(int l, int b) {
		super();
		this.l = l;
		this.b = b;

	}
	
	@Override
	
	public double area(){
		return  l*b;
	}
}