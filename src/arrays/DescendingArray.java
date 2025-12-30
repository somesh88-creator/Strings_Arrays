package arrays;

public class DescendingArray {

	public static void main(String[] args) {
		int[] arr= {1,2,33,4,56,5,6,7};
		
		for(int j=0;j<arr.length-1;j++)
		{
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i]<arr[i+1])
				{
					arr[i+1]=arr[i]+arr[i+1];
					arr[i]=arr[i+1]-arr[i];
					arr[i+1]=arr[i+1]-arr[i];
				}
			
			}
		}
		
		
		for(int num:arr)
		{
			System.out.print(num+" ");
		}

	}

}
