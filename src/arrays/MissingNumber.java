package arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr= {1,2,3,5,7,9,11,20};
		System.out.println("Missing num: ");
		for(int i=0;i<arr.length-1;i++)
		{
			int c=arr[i];
			if(arr[i+1]==c+1)
			{
				continue;
			}
			else
			{
				System.out.println(c+1);
			}
		}

	}

}
