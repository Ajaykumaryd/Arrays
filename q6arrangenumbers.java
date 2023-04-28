package Array;
import java.util.Scanner;
public class q6arrangenumbers {
	
//You have been given an empty array(ARR) and its size N.
//The only input taken from the user will be N and you need not worry about the array.	
//Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order 
//1,3,5,.......,6,4,2.
	//input    output
   //6         135642
		
	
	    public static void arrange(int[]arr,int n){
	    	int s=0;
	        int e=n-1;
	        int val=1;
	        while(s<=e) {
	            arr[s]=val;
	            val++;
	           if(s==e){
	             break;
	            }
	          else{
	            arr[e]=val;
	            val++;
	        s++;
	        e--;}
	    }
	        }
	    public static void print(int input[]){
			int n=input.length;
		for(int i=0;i<n;i++){           //printing
			System.out.print(input[i]+" ");
		}
		System.out.println();}
	    public static void main(String[] args) {
	        Scanner s =new Scanner(System.in);
	        int n =s.nextInt(); 
	        int arr[]= new int[n];
	        arrange(arr,n);
	        print(arr);
	        
	}
	}


