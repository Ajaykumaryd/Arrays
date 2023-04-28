package Array;

import java.util.Scanner;

public class q5swapalternate {
	
	public static int[]takeinput(){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int [n];
		for(int i=0;i<n;i++) {      //input variables
			input[i]=s.nextInt();}
	          return input;}  
	
	     public static void swapalternate(int arr[]){
	     int n=arr.length;  
	     for(int i=0;i<n-1;i+=2){
	    	 int temp=arr[i];
	    	 arr[i]=arr[i+1];
	    	 arr[i+1]=temp;}
	     }		   		   
	     public static void print(int input[]){
				int n=input.length;
			
			for(int i=0;i<n;i++){           //printing
				System.out.print(input[i]+" ");
			}
			System.out.println();}   
            public static void main(String[] args){
           	int[]arr=takeinput();
            swapalternate(arr);
            print(arr);
           }          
           }

