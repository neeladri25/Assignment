package CipherSchoolsAssignment;
import java.util.*;

class Rect
{
	int width;
	int height;
	void display()
	{
		System.out.println("width: "+width+" "+"height: "+height);
	}
}

class Rec extends Rect{
	void display()
	{
		super.display();
		System.out.println("area is: "+(width*height));
	}
}

public class RectangleCalculation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Rec re = new Rec();
		re.width = sc.nextInt();
		re.height = sc.nextInt();
		re.display();

	}

}
