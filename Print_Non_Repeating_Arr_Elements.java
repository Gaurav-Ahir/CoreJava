package HelloWorld;

public class Print_Non_Repeating_Arr_Elements {
	public static void main(String[] args) {
		int[] arr = {2, 5, 2, 8, 5, 6, 8, 8, 8, 8, 2, 1};
		for(int i=0; i<arr.length; i++)
		{	int flag = 0;
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
