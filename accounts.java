package assignment2;

class  Account {
private long accnum;
protected double balance;
private  String accholder;
public void deposit(double money)
{
	 balance+=money;
}
public void withdraw(double money)
{
	balance-=money ;
}
public long getAccnum() {
	return accnum;
}
public void setAccnum(long accnum) {
	this.accnum = accnum;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

}

  class person extends Account
{
	private String name;
	private float age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	
		
	}


 class savingaccounts extends person
{
	final double minbal=500;
	@Override
	public void withdraw(double money)
	{
		if(money>minbal)
		{
		balance-=money;
		}
		else
		{
			System.out.println("you've to maintain balance i.e. 500");
		}
	}

	
	
}
 class currentaccount extends savingaccounts
{
	double overdraft=5000;
	@Override
	public void withdraw(double money)
	{
		if(money<overdraft)
		{
		balance-=money;
		}
		else
		{
			System.out.println("limit reached");
		}
	}
}
public class accounts
{
	public static void main(String[] args)
	{
		currentaccount b=new currentaccount();
		b.setName("smith");
		b.setAge(54);
		System.out.println("name of account holder:"+b.getName());
		System.out.println("age of account holder:"+b.getAge());
		b.setAccnum(12345);
		System.out.println("account no:"+b.getAccnum());
		b.setBalance(2000);
		System.out.println("initial bank amount:"+b.getBalance());
		b.deposit(2000);
		System.out.println("updated amount:"+b.getBalance());
		b.setName("kathy");
		b.setAge(24);
		System.out.println("name of account holder:"+b.getName());
		System.out.println("age of account holder:"+b.getAge());
		b.setAccnum(12346);
		System.out.println("account no:"+b.getAccnum());
		b.setBalance(3000);
		System.out.println("initial bank amount:"+b.getBalance());
		b.withdraw(2000);
		System.out.println("updated amount:"+b.getBalance());
	}
}
