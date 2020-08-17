package CipherSchoolsAssignment;
import java.util.*;

class Employee{
	int year;
	int salary;
	String name,address;
	
	Employee(String name,int year,int salary,String address){
		this.name=name;
		this.year=year;
		this.salary=salary;
		this.address=address;
	}
	void displayInfo()
	{
		System.out.println(name+"\t"+"\t"+year+"\t"+"\t"+salary+"\t"+"\t"+address+"\n");
	}
}
public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list1=new ArrayList<>();
		list1.add(new Employee("Robert",1994,45000,"64C- WallStreet"));
		list1.add(new Employee("Sam",2000,50000,"68D- WallStreet"));
		list1.add(new Employee("John",1999,64000,"26B- WallStreet"));
		System.out.println("Name"+"\t"+"  "+"Year of joining"+"\t"+"salary"+"\t"+"\t"+"Address"+"\n");
		list1.stream().map(n->n).forEach(s->s.displayInfo());

	}

}
