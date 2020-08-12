package CipherSchoolsAssignment;
import java.util.*;

class SavingsBank {
	int savings;
	public SavingsBank(int savings)
	{
		this.savings=savings;
	}
	public int getSavings()
	{
		return savings;
	}
	public void setName(int savings)
	{
		this.savings=savings;
	}
	public int decrement() {
		savings = savings-100;
		return savings;
	}
	public int increment() {
		savings = decrement()+1000;
		return savings;
	}
	
	public void checkSavings(int savings) {
		if(getSavings()>=1000)
			System.out.println("Congratulations! You have saved a good amount ");
		else if(getSavings()<1000 && getSavings()>=0) 
			System.out.println("Insufficient saving!");
		else
			System.out.println("You are in debt");
	}
}

public class Savings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		SavingsBank s = new SavingsBank(a);
		int out = s.increment();
		s.checkSavings(out);
		if(out>=1000)
			System.out.println("Your current savings are Rs "+out);
		else if(out<1000 && out>=0)
			System.out.println("Your current savings are Rs "+out);
		else
			System.out.println("Your current savings are Rs "+out);
	}

}
