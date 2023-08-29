package HelloWorld;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {21, 23, 87, 34, 20, 1, 99, 11, 100};
		System.out.println("Array Before Sorting");
		for(int i : arr)
		{
			System.out.println(i);
		}
		//int [] arr1 = new int[arr.length];
		int[] arr1 = arr;
		BubbleSort b = new BubbleSort();
		b.bSort(arr1);

		System.out.println("Array After Sorting");
		for(int i : arr1)
		{
			System.out.println(i);
		}
	}

	private  void bSort(int[] arr1) {
		int temp = 0;
		int len = arr1.length;
		
		for(int i=0; i<len; i++)
		{
			for(int j=i+1; j<len; j++)
			{
				if(arr1[i] > arr1[j])
				{
					temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		
	}

}
