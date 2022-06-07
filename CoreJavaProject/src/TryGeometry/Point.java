package TryGeometry;
import static java.lang.Math.sqrt;
public class Point {
		
		public double x;
		public double y;
		
		public Point(double xVal, double yVal) {
		this.x = xVal;
		this.y = yVal;
		}
		
		Point(final Point oldPoint) {
		x = oldPoint.x; 
		y = oldPoint.y; 
		}
		
		void move(double xDelta, double yDelta) {
		
		x += xDelta;
		y += yDelta;
		}
		
		double distance(final Point aPoint) {
		return sqrt((x-aPoint.x)*(x-aPoint.x) + (y-aPoint.y)*(y-aPoint.y));
		}
		
		public String toString() {
		return Double.toString(x) +" , "+ y; 
		}
		public static void main(String[] args) {
		Point point=new Point(300,400);
	    double temp=point.distance(point);
	    System.out.println(temp);
		}
		
}


