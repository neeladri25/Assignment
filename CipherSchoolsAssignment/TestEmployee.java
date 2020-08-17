package CipherSchoolsAssignment;
import java.util.*;
import java.util.stream.Collectors;
class Employee
{
	int empId,empSalary;
	String empName,empLocation,empDesignation;
	Scanner sc=new Scanner(System.in);
	Employee(int a,String s1,int b,String s2,String s3)
	{
		this.empId=a;
		this.empName=s1;
		this.empSalary=b;
		this.empDesignation=s2;
		this.empLocation=s3;
	}
	public String toString()
	{
		return (this.empId+","+this.empName+","+this.empSalary+","+this.empDesignation+","+this.empLocation);
	}
	
}
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> e1=new ArrayList<>();
		e1.add(new Employee(1,"neeladri",10000,"android developer","hyderabad"));
		e1.add(new Employee(2,"avishek",25000,"finance associate","banglore"));
		e1.add(new Employee(3,"pratip",60000,"civil site engineer","delhi"));
		e1.add(new Employee(4,"aayush",50000,"fitter","chennai"));
		e1.add(new Employee(5,"saptarshi",45000,"consultant","pune"));
		e1.add(new Employee(6,"sukarna",57000,"python developer","Mumbai"));
		e1.add(new Employee(7,"ajitabha",75000,"fullstack developer","kolkata"));
		e1.add(new Employee(8,"harish",85000,"content writer","coimbatore"));
		e1.add(new Employee(9,"yash",35000,"network engineer","mysore"));
		e1.add(new Employee(10,"mithun",90000,"buisness","kochi"));
		e1.stream().map(n->n).forEach(c->System.out.println(c.empName));
		e1.stream().filter(c->c.empSalary>50000).forEach(c->System.out.println(c.empSalary));
		List<String> ls3=e1.stream().filter(c->c.empLocation.toUpperCase().startsWith("M")).map(n->n.empLocation).collect(Collectors.toList());
		System.out.println(ls3);
		List<String> ls4=e1.stream().filter(s->s.empDesignation.toUpperCase().endsWith("R")).map(n->n.empDesignation).collect(Collectors.toList());
		System.out.println(ls4);
	
		
	}

}
