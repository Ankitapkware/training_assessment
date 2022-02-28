package classes;

public class CircleShapes extends Shapes{
	int r;
	String cname;

		CircleShapes(int r, String cname) {
			super();
			this.r = r;
			this.cname = cname;
		}
		
		@Override
		
		public double area(){
			return  Math.PI*r*r;
		}
}

