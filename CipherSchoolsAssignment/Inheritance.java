package CipherSchoolsAssignment;
import java.util.*;

class Rectangle
{
	int width;
	int height;
	void display(int width, int height)
	{
		System.out.println(width+" "+height);
	}
}

class RectangleArea extends Rectangle{
	void read_input(int a, int b) {
		this.width = a;
		this.height = b;
	}
	
	void display() {
		System.out.println(width*height);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		RectangleArea ra = new RectangleArea();
		Rectangle r = new Rectangle();
		r.display(a,b);
		ra.read_input(a, b);
		ra.display();

	}

}
