package CipherSchoolsAssignment;

import java.util.Arrays;
import java.util.*;

public class Operations {
	
	static int a;
	static void X(String A,String B)
	{
		switch(a)
		{
		case 1:
			if(A.matches("[0-9]+") && B.matches("[0-9]+"))
					{
						int Aval = Integer.parseInt(A);
						int Bval = Integer.parseInt(B);
						int addition = Aval+Bval;
					}
			int sumA=0,sumB=0;
			for(int i=0;i<A.length();i++)
			{
				char characterA = A.charAt(i);
				int asciiA = (int)characterA;
				sumA=sumA+asciiA;
			}
			for(int i=0;i<B.length();i++)
			{
				char characterB = B.charAt(i);
				int asciiB = (int)characterB;
				sumB=sumB+asciiB;
			}
			
			int sum=sumA+sumB;
			System.out.println(sum);
			break;
			
		case 2:
			String add = A+B;
			System.out.println(add);
			break;
			
		case 3:
			int summA=0,summB=0;
			for(int i=0;i<A.length();i++)
			{
				char characterA = A.charAt(i);
				int asciiA = (int)characterA;
				summA=summA+asciiA;
			}
			for(int i=0;i<B.length();i++)
			{
				char characterB = B.charAt(i);
				int asciiB = (int)characterB;
				summB=summB+asciiB;
			}
			
			int summ=summA+summB;
			System.out.println(summ);
			break;
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Operations op = new Operations();
		String A = sc.nextLine();
		String B = sc.nextLine();
		int a = sc.nextInt();
		Operations.a = a;
		X(A,B);
	}

}
