package prep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RectangleApp {
	
	public static void main(String[] args) {
	List<Rectangle> rectangles = new ArrayList<Rectangle>();
	Collections.addAll(rectangles, new Rectangle(3,5),new Rectangle(6,2),
			new Rectangle(4,5),new Rectangle(2,3), new Rectangle(3,1));

	System.out.println("rectangles: " + rectangles.toString());
	
	Collections.sort(rectangles);
	System.out.println("rectangles: " + rectangles.toString());
	
	}
}
