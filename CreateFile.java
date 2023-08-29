package HelloWorld;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class CreateFile 
{
	public static void main(String args[]) 
		{
		
			try
			{
				File myObj = new File("C:\\Users\\GRameshMoti\\OneDrive - Rockwell Automation, Inc\\Documents\\Zoom\\Shreyu_More");
				
				if(myObj.createNewFile())
				{
					System.out.println("File Created -> "+ myObj.getName());
				}
				else
				{
					System.out.println("File already Created.");
				}
			}
			catch(IOException e)
			{
				System.out.println("IO Exception Occured!!!");
			}
			
		}
}
