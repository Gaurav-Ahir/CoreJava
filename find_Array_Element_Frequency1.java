package HelloWorld;
import java.util.HashSet;

public class find_Array_Element_Frequency1 {

	public static void main(String[] args) {
		HashSet<Integer> frequency = new HashSet<Integer>();
		HashSet<Integer> frequencyCount = new HashSet<Integer>();		
		int arr[] = {2, 5, 2, 8, 5, 6, 8, 8};
		//System.out.println(arr);
		for (int x : arr)
		{
			frequency.add(x);
		}
		System.out.println(frequency);
		
		for(int i= 1; i<= arr.length; i++)
		{
			int count = 0;
		}
		
	/*	int len = arr.length;
		int[] freq = new int[len];
		for(int i=0; i<len; i++)
		{
			freq[i] = 1;
			for(int j=i+1; j<len; j++)
			{
				if(arr[i] == arr[j])
				{
					freq[i]++;
				}
			}
		}
		
		for(int k=0; k<len; k++)
		{
			System.out.println(freq[k]);
		}	*/

	}
}
