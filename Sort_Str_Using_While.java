package HelloWorld;
import java.util.Arrays;

public class Sort_Str_Using_While {
	public static void main(String[] args) {
		String s1 = "silent";
		String s2 = "listen";
		
		char[] chr1 = new char[s1.length()];
		char[] chr2 = new char[s2.length()];
		
		chr1 = s1.toCharArray();
		chr2 = s2.toCharArray();
		
		char[] Sorted1 = fun_sort(chr1);
		char[] Sorted2 = fun_sort(chr2);
		//Arrays.sort(chr1);
		//Arrays.sort(chr2);

		
		System.out.println(Sorted1);
		System.out.println(Sorted2);

	}

	private static char[] fun_sort(char[] s) {
		
		char temp;
		int i = 0;
		int j;
		while(i < s.length)
		{
			j = i+1;
			while(j < s.length)
			{
				if(s[i]>s[j])
				{
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
				j++;
			}
			i++;
		}
		
		return s;
	}

}
