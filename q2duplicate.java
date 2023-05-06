package arrayassingnments;

import java.util.Scanner;

public class q2duplicate {
	public static int[]takeinput(){                                 
        
		Scanner s = new Scanner(System.in);                         
		int n=s.nextInt();                                          
		int input[]=new int [n];
		for(int i=0;i<n;i++) {      //input variables
			input[i]=s.nextInt();}
	          return input;}  
	
	
	  private static final String Interger = null;

	public static int duplicate(int arr[]) {
	        int n=arr.length;
	        for(int i=0;i<n-1;i++){
	            for(int j=i+1;j<n;j++){
	                if(arr[i]==arr[j]){
	                return arr[j];
	            }
	        }
	    }
	        return 0;
	    }

	public static void main(String[] args){
		int arr[]=takeinput();
		int n=duplicate(arr);
		System.out.println(n);
	}
	}	

	


