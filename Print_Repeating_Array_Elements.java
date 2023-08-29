package HelloWorld;
import java.util.HashSet;

public class Print_Repeating_Array_Elements {
	public static void main(String[] args) {
		HashSet<Integer> a1 = new HashSet<Integer>();
		int[] arr = {2, 5, 2, 8, 5, 6, 8, 8, 8, 8, 2, 1, 1};
		
		for(int i=0; i<arr.length; i++)
		{

			for(int j=i+1; j<arr.length; j++)
			{	
				if(arr[i] == arr[j])
				{
					a1.add(arr[i]);
				}
			}
		}
		
		System.out.println(a1);
		
	}

}
