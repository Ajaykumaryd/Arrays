package Array;

import java.util.Scanner;
// 7
// 1 2 3 4 5 6 7 
//4
public class q4linearsearch {
	
	
//	public static int[]takeinput(){
//		Scanner s = new Scanner(System.in);
//		int n=s.nextInt();
//		int input[]=new int [n];
//		for(int i=0;i<n;i++) {      //input variables
//			input[i]=s.nextInt();}
//	          return input;}  
	
	 public static int linearSearch(int arr[],int x){
			int n=arr.length;
		    for(int i=0;i<n;i++){
		        if(arr[i]==x){
		        return i;
		       }                                             		                                       
		    } 
		    return -1;
		    }
	  public static void main(String[] args)
	    {
		 int arr[]= {1,2,3,4,5,6,7,8,9}; 
	     int x=4;
	     System.out.println(linearSearch(arr,x));
	    }
	  }
