package javabasics1;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20,20,10,9,5,10,5};
		
		int size=arr.length;
		
		for(int i=0;i<=size;i++)
		{
			for(int j=i+1;j<=size-1;j++)
			{
				if(arr[i]==arr[j])
				{
					
				System.out.println(arr[i]);
			}
			}
		}
	}

}
