package HelloWorld;
import java.util.Arrays;

public class Check_2Anagram_Str {
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		char[] chr1 = new char[str1.length()];
		char[] chr2 = new char[str1.length()];
		
		chr1 = str1.toCharArray();
		chr2 = str2.toCharArray();
		
		Arrays.sort(chr1);
		Arrays.sort(chr2);
		
		int flag = 0;
		for(int i=0; i<chr1.length; i++)
		{
			if(chr1[i] != chr2[i])
			{
				flag = 1;
			}
		}

		
		if(str1.length() == str2.length() && flag==0)
		{
			System.out.println(str1+ " and " +str2 +" are anagram Strings");
		}
		else 
		{
			System.out.println("Not anagram strings.");
		}
	}

}
