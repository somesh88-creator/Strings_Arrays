package arrays;

public class AscendingArray {

	public static void main(String[] args) {
		int[] arr= {22,1,2222,34,44,56,11,22,3};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					arr[j]=arr[j]+arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]=arr[j]-arr[j+1];
				}
			}
			
		
		}
		for(int num:arr)
		{
			System.out.print(num+" ");
		}

	}

}
