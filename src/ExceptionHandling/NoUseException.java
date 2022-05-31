package ExceptionHandling;

public class NoUseException extends RuntimeException

{
	@override
	public String getMessage()
	{
		return "Validity Expired";
	}
	

}
