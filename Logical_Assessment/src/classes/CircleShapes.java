package classes;

public class CircleShapes extends Shapes{
	int r;

		CircleShapes(int r) {
			super();
			this.r = r;
		}
		
		@Override
		
		public double area(){
			return  Math.PI*r*r;
		}
}

