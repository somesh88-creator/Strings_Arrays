package arrays;

public class SecLargest {

	public static void main(String[] args) {
		int[] arr= {1,22,4,5555,67};
		int max=arr[0];
		int sec=arr[0];
		int th=arr[0];
		
		/*for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				sec=max;
				max=arr[i];
			}
			else if(arr[i]>sec && arr[i]!=max)
			{
				sec=arr[i];
			}
		}
		
		System.out.println("2nd largest: "+sec);*/
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				th=sec;
				sec=max;
				max=arr[i];
			}
			else if(arr[i]>sec && arr[i]!=max)
			{
				th=sec;
				sec=arr[i];
			}
			else if(arr[i]>th && arr[i]!=sec && arr[i]!=max)
			{
				th=arr[i];
			}
		}
		System.out.println("3rd largest: "+th);

	}

}
