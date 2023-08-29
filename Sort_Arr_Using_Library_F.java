package HelloWorld;
import java.util.Arrays;
import java.util.Collections;

public class Sort_Arr_Using_Library_F {
	public static void main(String[] args) {
		Integer[] arr = {22, 22, 5, 8, 5, 6, 1, 8, 8, 8, 22,1,4,90};
		Arrays.sort(arr, Collections.reverseOrder());
		//Arrays.sort(arr);
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.println(arr[i]);
		}
	}
}
