public class Rectangle {
    int width;
	int length;
	
	Rectangle() {
		width = 1;
		length = 1;
	}
	
	Rectangle(int w, int l) {
		width = w;
		length = l;
	}
	
	double findArea() {
		return width *length;
	}
	
	double findPerimeter() {
		return 2*width + 2*length;
	}
	
	double findDiagonal() {
		return Math.sqrt(length*length+width*width);
	}
	
	boolean isSquare() {
		if (width == length) {
			return true;
		} else {
			return false;
		}
	}
	
	void printBasicInfo() {
		System.out.println("The width is " + width);
		System.out.println("The length is " + length);
	}


}
