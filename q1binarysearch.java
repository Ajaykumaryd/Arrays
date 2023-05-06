package arrays2;

public class q1binarysearch {

	public static int binarysearch(int arr[],int x){
	int n=arr.length;
	int start =0;
	int end=n-1;
	while(start<=end){
		
	int mid=(start+end)/2;
	  if (arr[mid]>x){
		  end=mid-1;}
	  else if(arr[mid]<x){
		  start=mid+1;
	  } else {  
		  
			  return mid;}
	}
	return -1;
	}  
	public static void main(String[] args) {
       int arr[]= {1,2,3,4,5,6,8,9};
       int element=binarysearch(arr,8);
       System.out.print("Element is" + " " + element); 
      
	}
}
