package Array;

import java.util.Scanner;

public class arrayinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int [n];
		for(int i=0;i<n;i++){      //input variables
		input[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){           //printing
		System.out.print(input[i]+" ");
		}		
	    }
        }
