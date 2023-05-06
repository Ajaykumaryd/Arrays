package arrayassingnments;

import java.util.Scanner;

public class q12unique2 {
	//7
	//2 3 1 6 3 6 2
	public static int unique(int[] arr){
	      int n=arr.length;
	      for(int i=0;i<n;i++){
	        int count=0;
	        for(int j=0;j<n;j++){
	           if(i!=j){

	            if(arr[i]==arr[j]){
	             count++;
	        }
	           }}
	        if(count==0){
	          return arr[i];
	          }
	             }
	          return arr[0];   
	}
	public static void main(String[] args) {
		int arr[]= {1,2,2,3,3,5,5};
		int ans=unique(arr);
		System.out.println(ans);  
}}

