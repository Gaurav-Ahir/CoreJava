package HelloWorld;
import java.util.Scanner;

public class Find_First_Duplicar_Str_Occurance {
	public static void main(String[] args)
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter input String: ");
		String ip = myObj.nextLine();
		int len = ip.length();
		int flag = 0;
		for(int i = 0;i < len; i++)
		{
			for(int j = i+1;j < len; j++)
			{
				if(ip.charAt(i) == ip.charAt(j))
				{
					System.out.println(ip.charAt(i));
					flag = 1;
					break;
				}
				
				
			}
		}
		
		if(flag == 0)
		{
			System.out.println("No Repeated character in String: "+ ip);
			//System.out.println(flag);
		}
		
	}

}
