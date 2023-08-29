package HelloWorld;
import java.util.HashSet;

public class Count_Distinct_Array_Elements {
	public static void main(String[] args) {
		HashSet<Integer> unique = new HashSet<Integer>();
		int[] arr = {2, 5, 2, 8, 5, 6, 8, 8, 8, 8, 2};
		
		for(int i=0; i<arr.length; i++)
		{
			unique.add(arr[i]);
		}

		System.out.println(unique+" Size: "+ unique.size());
		//////////////////////////////////////////
		int count = 0;
		for(int i=0; i<arr.length; i++)
		{
			count ++;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					count--;
					break;
				}
				
			}
		}
		
		System.out.println("Distinct count is:" + count);
	}

}
