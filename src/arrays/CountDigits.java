package arrays;

public class CountDigits {

	public static void main(String[] args) {
		int[] arr= {1,2,3,3,3,4,4,4,4,4,4,5,6,7,7,7,7,1};
		
		boolean[] visited=new boolean[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(!visited[i])				
			{
				int count=1;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[j]==arr[i])
					{
						count++;
						visited[j]=true;
					}
				}
				visited[i]=true;
				if(visited[i]==true)
				{
					System.out.println("count of "+arr[i]+" is "+count);
				}
			}
		}

	}

}
