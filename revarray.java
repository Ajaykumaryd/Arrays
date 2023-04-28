package Array;

import java.util.Scanner;

public class revarray {
	
    public static void reverse(int arr[]){
	int n=arr.length;
	for(int i=n-1;i>=0;i--){
    	System.out.print(arr[i]+ " ");
	     }
	    System.out.println();        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {    
		a[i]=s.nextInt();
		}
		reverse(a);	   
		}
	}


