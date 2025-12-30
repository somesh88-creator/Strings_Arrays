package arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr= {1,2,2,3,3,3,3,4,11,23,44,44};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[j]==arr[i])
				{
					arr[i]=0;
					break;
				}
			}
		}
		
		for(int num:arr)
		{
			if(num!=0)
			{
				System.out.print(num+" ");
			}
		}

	}

}
