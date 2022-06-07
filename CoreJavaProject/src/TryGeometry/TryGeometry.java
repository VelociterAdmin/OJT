package TryGeometry;

public class TryGeometry {

	public static void main(String[] args) {
		Point start=new Point(10,11);
		Point end=new Point(12,13);
        System.out.println("Point created are"+start+"and"+end);
        Line line1 = new Line(start, end);
        Line line2 = new Line(25,26,27,29);
        System.out.println("Lines created are"+ line1 +"and"+ line2);
        System.out.println("Intersection is "+ line2.intersects(line1));
        System.out.println("Intersection is "+ line2.intersects(line1));
        end.move(5,10);
        System.out.println("Intersection is "+ line1.intersects(line2));
	}

}
