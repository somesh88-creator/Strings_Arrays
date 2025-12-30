package arrays;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		//int[] arr= {1,4,22,222222,67,5555};
		
		//freq of each element
		/*boolean[] visited=new boolean[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(!visited[i])
			{
				int count=1;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						visited[j]=true;
						count++;
					}
				}
				visited[i]=true;
				System.out.println("count of "+arr[i]+" is: "+count);
			}
		}*/
		
		//check sorting
		/*boolean sort=true;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i+1]<arr[i])
			{
				sort=false;
				break;
			}
			
		}
		if(sort==true)
		{
			System.out.println("sorted");
		}
		else
		{
			System.out.println("not sorted");
		}*/
		
		//merge 2 arrays
		/*int[] arr1= {1,2};
		int[] arr2= {3,4};
		int[] arr3=new int[arr1.length+arr2.length];
		int index=0;
		for(int val:arr1)
		{
			arr3[index]=val;
			index++;
		}
		for(int val:arr2)
		{
			arr3[index]=val;
			index++;
		}
		System.out.println(Arrays.toString(arr3));*/
		
		//missing number
		/*int[] arr= {1,2,4,5};
		int n=arr.length+1;
		int exp_sum=n*(n+1)/2;
		int act_sum=0;
		for(int i=0;i<arr.length;i++)
		{
			act_sum=act_sum+arr[i];
		}
		System.out.println("missing number: "+(exp_sum-act_sum));*/
		
		//move 0 to end
		/*int[] arr= {1,0,0,2,3,4,0,5};
		//int[] arr1=new int[arr.length];
		int j=0;
		for(int val:arr)
		{
			if(val!=0)
			{
				arr[j]=val;
				j++;
			}
		}
		while(j<arr.length)
		{
			arr[j]=0;
			j++;
		}
		System.out.println(Arrays.toString(arr));*/
		
		//separate even and odd
		int[] arr= {1,2,3,4};
		int[] res=new int[arr.length];
		int j=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				res[j]=arr[i];
				j++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 !=0)
			{
				res[j]=arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(res));
		
	}

}
