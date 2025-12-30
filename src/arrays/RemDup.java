package arrays;

public class RemDup {

	public static void main(String[] args) {
		int[] arr= {1,2,2,3,3,3,3,4,11,23,44,44};
		boolean[] visited=new boolean[arr.length];
		int a=0;
		boolean found=false;
		
		/*for(int i=0;i<arr.length;i++)
		{
			if(!visited[i])
			{
				visited[i]=true;
				System.out.print(arr[i]+" ");
				
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[j]==arr[i])
					{
						visited[j]=true;
					}
				}
			}
		}*/
		
		//1st repeating
		/*for(int i=0;i<arr.length;i++)
		{
			if(!visited[i])
			{
				visited[i]=true;
				//System.out.print(arr[i]+" ");
				
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[j]==arr[i])
					{
						visited[j]=true;
						a=arr[j];
						found=true;
						break;
						
					}
				}
			}
			if(found)
			{
				break;
			}
		}
		System.out.println(a);*/
		
		//1st non repeating element
		for(int i=0;i<arr.length;i++)
		{
			
		}

	}

}
