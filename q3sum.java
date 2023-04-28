package Array;
import java.util.Scanner;
public class q3sum {
	
//ip 3 
//  989	
//op 26	
	    public static int[] takeInput(){
	        Scanner s = new Scanner(System.in);
	        int size = s.nextInt();
	        int[] input = new int[size];
	        for(int i=0;i<size;i++)
	        {
	            input[i]=s.nextInt();
	        }
	        return input;
	       } 
	public static int sum(int arr[] ){
		int n=arr.length;
	    int sum=0;
			for(int i=0;i<n;i++)
	        {
	            sum=sum+arr[i];
	        }
			return sum;
		}
	    public static void main(String[] args)
	    {
	        int arr[] = takeInput();
	        int allSum=sum(arr);
	        System.out.println(allSum);	        
	    }
}
