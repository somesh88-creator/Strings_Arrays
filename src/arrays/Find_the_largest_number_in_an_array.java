package arrays;

public class Find_the_largest_number_in_an_array {

	public static void main(String[] args) {
		int[] arr= {-3, -8, -1, -9, -2};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("largest number: "+max);

	}

}
