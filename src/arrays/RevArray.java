package arrays;

import java.util.Arrays;

public class RevArray {

	public static void main(String[] args) {
		int[] arr= {11,22,24,56,1,222,4};
		int[] arr2=new int[arr.length];
		
		/*for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");						
		}*/
		
		for(int i=1;i<=arr.length;i++)
		{
			arr2[i-1]=arr[arr.length-i];
		}
		
		System.out.println(Arrays.toString(arr2));
		
	}

}
