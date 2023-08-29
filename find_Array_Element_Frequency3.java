package HelloWorld;
import java.util.Scanner;

public class Array_Element_Frequency3 {
	
	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		size = sc.nextInt();
		int[] arr = new int[size];
		int[] freq = new int[size];

		System.out.println("Enter The array elements: ");
		for(int i=0; i<size; i++ )
		{
			arr[i] = sc.nextInt();
			freq[i] = -1;
		}
		
	/*	for(int i : arr)
		{
			System.out.println(i);
		}	*/
		
		for(int i=0; i<size; i++)
		{
			int count = 1;
			for(int j=i+1; j<size; j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
					freq[j] = 0;
				}
				
				if(freq[i] != 0)
				{
					freq[i] = count;
				} 
			}
		}
///////////////////////////////////////////////
		
		for(int i=0; i<size; i++)
		{
			if(freq[i] > 0)
			{
				//System.out.println(arr[i] + " occurs "+freq[i] + " time");
				System.out.println(arr[i]);
			}

		}
		
		
		
	}

}
