package arrays2;

public class q2selectionsorting {
	 public static void selectionSort(int[] arr) {
        	    int n=arr.length;
                for(int i=0;i<n-1;i++){
                int min=i;
                for(int j=i+1;j<n;j++){
                if(arr[j] < arr[min]){
                min=j;
                 }
                 }
                 int temp = arr[i];
                 arr[i] = arr[min];
                 arr[min] = temp;   
                 }
                 }
	             public static void main(String[] args){	
		         int arr[]= {7,5,8,1,9,2};
		         selectionSort(arr);
		         int n=arr.length;
                 for(int i=0;i<n;i++){           //printing
                 System.out.print(arr[i]+" ");
                 }
	             }
                 }
