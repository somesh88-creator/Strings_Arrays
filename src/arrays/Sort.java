package arrays;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int[] arr= {11,22,24,56,1,222,4};
		for(int i=0;i<arr.length-1;i++)
		{
			
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					arr[j+1]=arr[j+1]+arr[j];
					arr[j]=arr[j+1]-arr[j];
					arr[j+1]=arr[j+1]-arr[j];
					
					
				}
			}
			
			
			
		}
		System.out.println(Arrays.toString(arr));

	}

}
