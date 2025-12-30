package arrays;

public class ArraySortCheck {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,1,2,44};
		boolean sorted=false;
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
				sorted=true;
				//System.out.println("sorted");
			}
			else
			{
				sorted=false;
				break;
			}
		}
		if(sorted==true)
		{
			
			System.out.println("sorted");
		}
		else
		{
			System.out.println("not sorted");
		}

	}

}
