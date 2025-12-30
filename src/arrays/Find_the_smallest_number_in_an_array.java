package arrays;

public class Find_the_smallest_number_in_an_array {

	public static void main(String[] args) {
		int[] arr= {5, 2, 9, 1};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("smallest number: "+min);
	}

}
