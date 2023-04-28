package Array;

import java.util.Scanner;

public class q8printpairs {
	public static int[]takeinput(){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int [n];
		for(int i=0;i<n;i++) {      //input variables
			input[i]=s.nextInt();}
	          return input;}  
	
	
	public static void printpairs(int arr[]){
		int n=arr.length;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				System.out.print("("+arr[i]+ "," +arr[j]+")");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]=takeinput();
     printpairs(arr);
	}

}
