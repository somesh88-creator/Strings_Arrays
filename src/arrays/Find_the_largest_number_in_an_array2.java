package arrays;

import java.util.Arrays;

public class Find_the_largest_number_in_an_array2 {

	public static void main(String[] args) {
		int[] arr= {1,2,44,5,67,33,4,55,6};
		
		//using sort
		/*Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
		System.out.println(Arrays.toString(arr));*/
		
		//using traditional method
		/*int mx=1;
		for(int i:arr)
		{
			if(i>mx)
			{
				mx=i;
			}
		}
		System.out.println(mx);*/
		
		//print 2nd largest number
		/*int lar=arr[0];
		int sec=arr[0];
		int thi=arr[0];*/
		
		int lar=Integer.MIN_VALUE;
		int sec=Integer.MIN_VALUE;
		int thi=Integer.MIN_VALUE;
		
		for(int i:arr)
		{
			if(i>lar)
			{
				thi=sec;
				sec=lar;
				lar=i;
				
			}
			else if(i>sec && i!=lar)
			{
				thi=sec;
				sec=i;
			}
			
			else if(i>thi && i!=lar && i!=sec)
			{
				thi=i;
			}
		}
		
		System.out.println(thi);
		
		

	}

}
