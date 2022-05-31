package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFound {

	public static void main(String[] args)throws FileNotFoundException
	{
		
		m1();
	}
	public static void m1()throws FileNotFoundException
	{
		m2();
	}
	public static void m2()throws FileNotFoundException
	{
		openFile();
	}
	public static void openFile()throws FileNotFoundException
	{
		FileInputStream f = new FileInputStream("D:\\abc.txt");
		System.out.println("Exist");
	}


}
