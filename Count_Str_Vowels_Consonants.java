package HelloWorld;

public class Count_Str_Vowels_Consonants {
	public static void main(String[] args) {
		String str = " abcd efgh ikkl mno pqrstu  vwxyz ";
		int vowelsCount = 0;
		int ConsonantCount = 0;
		for(int i=0; i<str.length(); i++)
		{
			if(//str.charAt(i)!=' ' && 
					(str.charAt(i) == 'a' ||
					str.charAt(i) == 'e' || 
					str.charAt(i) == 'i' || 
					str.charAt(i) == 'o' || 
					str.charAt(i) == 'u'))
			{
				vowelsCount++;
			}
			else if(str.charAt(i)!=' ')
			{
				ConsonantCount++;
			}
		}
		System.out.println("Totel vowels are: "+vowelsCount);
		System.out.println("Totel consonants are: "+ConsonantCount);

	}
}
