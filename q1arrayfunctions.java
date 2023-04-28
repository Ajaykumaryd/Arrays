package Array;
import java.util.Scanner;
public class q1arrayfunctions {

	

		public static int[]takeinput(){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int [n];
		for(int i=0;i<n;i++){      //input variables
	    input[i]=s.nextInt();}
		return input;}  
		
		public static void print(int ar[]){
		int n=ar.length;
		
		for(int i=0;i<n;i++){           //printing
		System.out.print(ar[i]+" ");
		}
		System.out.println();}
		
		public static void main(String[] args){
		int arr[]=takeinput();
		print(arr);
		}
        }
