package HelloWorld;
import java.util.HashSet;

public class Remove_Duplicate_In_Array {
	public static void main(String[] args) {
		int[] arr = {2, 5, 2, 8, 5, 6, 8, 8, 8, 8, 2,1,4,90};
		int[] a2 = new int[arr.length];
		int flag;
		for(int i=0; i<arr.length; i++)
		{
			flag = 0;
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i] == arr[j] && j!=i)
				{
					flag = 1;
				}
			}
			if(flag == 0)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
