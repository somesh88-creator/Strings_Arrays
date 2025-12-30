package arrays;

import java.util.Arrays;

public class LargestNum {

	public static void main(String[] args) {
		int[] arr= {1,22,4,5555,67};
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
		
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);

	}

}
