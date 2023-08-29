package HelloWorld;

public class Sort_Arr_Elements1 {
	public static void main(String[] args) {
		int[] arr = {22, 22, 5, 8, 5, 6, 1, 8, 8, 8, 22,1,4,90};
		int temp = 0;
		int len = arr.length;
		for(int i=0; i<len; i++)
		{
			for(int j=i+1; j<len; j++)
			{
				if(arr[i] < arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i : arr)
		{
			System.out.println(i);
		}
	}

}
