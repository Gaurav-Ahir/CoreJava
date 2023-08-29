package HelloWorld;
//import java.util.HashSet;

public class Second_Smallest_In_Arr {
	public static void main(String[] args) {
		//HashSet<Integer> h = new HashSet<Integer>();
		int[] arr = {22, 22, 5, 8, 5, 6, 8, 8, 8, 8, 22,1,4,90};
		for(int j=0; j<arr.length; j++)
			{
				if(arr[0] > arr[j])
				{
					arr[0] = arr[j];
				}
			}
		for(int j=0; j<arr.length; j++)
		{
			if(arr[j]!=arr[0] &&  arr[1] > arr[j])
			{
				arr[1] = arr[j];
			}
		}
		
		System.out.println("Second Lowest Element in Array is: " +arr[0]);
		
	}

}
