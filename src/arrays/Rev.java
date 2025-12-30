package arrays;

import java.util.Arrays;

public class Rev {

	public static void main(String[] args) {
		int[] arr= {11,22,24,56,1,222,4};
		int[] arr2=new int[arr.length];
		int j=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			arr2[j]=arr[i];
			j++;
			//System.out.print(arr[i]+" ");
			//arr[i].equals(arr2[i]);
		}
		
		System.out.println(Arrays.toString(arr2));

	}

}
