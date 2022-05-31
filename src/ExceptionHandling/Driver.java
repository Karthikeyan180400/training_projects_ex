package ExceptionHandling;

public class Driver {
	public static void main(String[] args) 
	{
		Matrimony m = new Matrimony();
		try
		{
		m.ageVerrification(12);
		}
		catch(HavePatienceException h)
		{
			System.out.println(h.getMessage());
		} 
		}
;	}
	

}
