package ExceptionHandling;

public class Matrimony 
{ 
	public void ageVerrification(int age) throws Exception
	{
		if(age<21)
				throw new HavePatienceException();
		else if(age>40)
			throw new NoUseException();
		else
			System.out.println("Welcome to Matrimony");
	}

}
