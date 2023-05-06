package arrayassingnments;

import java.util.Scanner;
public class q3intersection {
	
	public static int[]takeinput(){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int [n];
		for(int i=0;i<n;i++) {      //input variables
			input[i]=s.nextInt();}
	          return input; } 


	public static void intersections(int arr1[], int arr2[]) {
	int n1 = arr1.length;
    int n2 = arr2.length;
    for (int i = 0; i <n1; i++) {
        for (int j = 0; j <n2; j++) {
            if(arr1[i] == arr2[j]) {
             System.out.print(arr1[i]+ " ");
             arr2[j] = Integer.MIN_VALUE;
             break; //once you print the value dont move forward.
            }
        }
    }
}

public static void main(String[] args) {
	int arr1[] = takeinput();
    int arr2[] = takeinput();
	intersections(arr1,arr2);
}}

