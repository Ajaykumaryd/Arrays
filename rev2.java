package Array;

import java.util.Scanner;

public class rev2 {
	private static void swapElements(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    // helper code to reverse the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swapElements(arr, start, end);
            start++;
            end--;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
			for(int i=0;i<n;i++) {    
				a[i]=s.nextInt();
		}
		swapElements(a,0,0);
		reverse(a,0,0);
			
			
		}
	}
	


