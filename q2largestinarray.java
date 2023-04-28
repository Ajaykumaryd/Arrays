package Array;

import java.util.Scanner;

public class q2largestinarray {

	public static int largestarray(int arr[]){
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];}
			}
             return max;
		    }
//	public static int[]takeinput(){
//		Scanner s = new Scanner(System.in);
//		int n=s.nextInt();
//		int arr[]=new int [n];
//		for(int i=0;i<n;i++){      //input variables
//			arr[i]=s.nextInt();}
//	          return arr; }  
	
	public static void main(String[] args){
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int ans=largestarray(arr);
		System.out.print("largest"+ " " + ans+ " ");		
	}
}
