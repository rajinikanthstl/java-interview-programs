package oops;

//declaring an abstract Employee class
abstract class Employee {
	String name,designation;
	Employee(String name,String designation)
	{
		this.name=name;
		this.designation=designation;
	}
	//abstract method with no implementation
	abstract int getSalary();
}

//RegularEmployee class implements the abstract method by extending 
class RegEmployee extends Employee{
	int salary;
	RegEmployee(String name,String designation,int salary)
	{
		super(name,designation);
		this.salary=salary;
	}
	//abstract method implementation
	@Override
	int getSalary()
	{
		return salary;
	}
}

//ConEmployee class implements the abstract method by extending 
class ConEmployee extends Employee{
	int hrs,rate;
	ConEmployee(String name,String designation,int hrs,int rate)
	{
		super(name,designation);
		this.hrs=hrs;
		this.rate=rate;
	}
	//abstract method implementation
	@Override
	int getSalary()
	{
		return hrs*rate;
	}
}

public class AbstractExp {
	
	public static void main(String[] args) {
		
		//accessing implemented clases with abstract class reference
		Employee e1=new RegEmployee("Mounika","Software Engineer",90000);
		Employee e2=new ConEmployee("Rajesh","Software Tester",4,1200);

		System.out.println("Salary of regular employee:"+e1.getSalary());
		System.out.println("Salary of contract employee:"+e2.getSalary());
	}
}
