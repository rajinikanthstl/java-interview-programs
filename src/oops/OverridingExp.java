package oops;

//declaring base class Customer
class Customer
{
	int id;
	String name;
	double billAmount;
	
	//base class constructor
	Customer(int id,String name,double billAmount)
	{
		this.id=id;
		this.name=name;
		this.billAmount=billAmount;
	}
	
	//base class method implementation
	void printBillAmount()
	{
		System.out.println(name+" "+"your bill amount is:"+billAmount);
		System.out.println("Thank you for visiting!");
		System.out.println("------------------------------------------");
	}
}

//PremiumCustomer class extending Customer class
class PremiumCustomer extends Customer
{
	double creditLimit;
	
	//sub class constructor
	PremiumCustomer(int id,String name,double billAmount,double creditLimit)
	{
		//calling base class constructor
		super(id,name,billAmount);
		this.creditLimit=creditLimit;
	}
	
	//overriding base class method
	@Override
	void printBillAmount()
	{
		System.out.println(name+" "+"your bill amount is:"+billAmount);
		System.out.println("you have got creditlimit:"+creditLimit);
		System.out.println("Thank you for visiting!");
		System.out.println("------------------------------------------");

	}
}

public class OverridingExp
{
	public static void main(String[] args)
	{
		//assigning base class instance to base class reference
		Customer c=new Customer(123,"Rajesh",40000);
		c.printBillAmount();
		
		//assigning sub class instance to sub class reference
		PremiumCustomer p=new PremiumCustomer(223,"Mounica",50000,100000);
		p.printBillAmount();
		
		//assigning sub class instance to base class reference
		Customer rajesh=new PremiumCustomer(323,"Radha",60000,20000);
		rajesh.printBillAmount();
	}
}
