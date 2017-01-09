import java.util.*;
class NegativeAgeException extends Exception
{
	public NegativeAgeException()
	{
		super("Error! Invalid age entered.");
	}
}
class MyAge 
{
	int age;
	Scanner obj = new Scanner(System.in);
	
	void input()
	{
		System.out.println("Enter the age: ");
		age = obj.nextInt();
	}
	
	void test() throws NegativeAgeException
	{
		
		if(age<=0)
		{
		try
		{
			throw new NegativeAgeException();
		}
		catch(NegativeAgeException e)
		{
			System.out.println(e);
		}
		}
		else
		{
			System.out.println("The age entered is valid.");
		}
	}
}

class Age
{
	public static void main(String[] args) throws NegativeAgeException
	{
		MyAge m = new MyAge();
		m.input();
		m.test();
	}
}

























