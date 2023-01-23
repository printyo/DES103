public class TestRectangle {
    
	public static void main(String[] args) {
		Rectangle box1 = new Rectangle();
		System.out.println(box1.width);
		System.out.println(box1.length);
		
		double perm1 = box1.findPerimeter();
		System.out.println(perm1);
		
		boolean isSq1 = box1.isSquare();
		if (isSq1 == true) {
			System.out.println("It is a square box.");
			
		}	
		else {
			System.out.println("It is not a square box.");
		}
		
		
		
		Rectangle box2 = new Rectangle(3,4);
		System.out.println(box2.width);
		System.out.println(box2.length);
		
		double perm2 = box2.findPerimeter();
		System.out.println(perm2);
		
		boolean isSq2 = box2.isSquare();
		if (isSq2 == true) {
			System.out.println("It is a square box.");
			
		}	
		else {
			System.out.println("It is not a square box.");
		}
		
	}
}

