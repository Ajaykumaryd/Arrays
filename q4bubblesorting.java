package arrays2;

public class q4bubblesorting {
	 public static void bubbleSort(int[] arr){
	    	int n=arr.length;
	        for(int i=0;i<n-1;i++){
	            for(int j=0;j<n-1;j++){
	             if(arr[j]>arr[j+1]){
	                 int temp=arr[j];
	                 arr[j]=arr[j+1];
	                 arr[j+1]=temp;}
	         }           
	        }}
	        public static void main(String[] args) {
	    		// TODO Auto-generated method stub
	    		int arr[]= { 5,7,8,4,1,25};
	            bubbleSort(arr);
	            int n=arr.length;
	            for(int i=0;i<n;i++){           //printing
	            System.out.print(arr[i]+" ");
	            }
	            }
	            
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
