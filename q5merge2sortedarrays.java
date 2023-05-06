package arrays2;

public class q5merge2sortedarrays {
	
	public static void print(int input[]){
		int n=input.length;
	for(int i=0;i<n;i++){           //printing
		System.out.print(input[i]+" ");
	}}
	
	public static int[] mergesortedarray(int arr1[],int arr2[]){
	int n=arr1.length;
	int m=arr2.length;
	int arr[]=new int [n+m];
	int i=0,j=0,k=0;
	while( i<n && j<m){
		if(arr1[i]<=arr2[j]){
			arr[k]=arr1[i];
			i++;
			k++;
		}else {
			arr[k]=arr2[j];
			j++;
			k++;
		   }	
	       }
	while(i<n){
		arr[k]=arr1[i];
		i++;
		k++;
	}
	while(j<m){
		arr[k]=arr2[j];
		j++;
		k++;
	}
	return arr;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr1[]= {1,3,4,6,7,8};
      int arr2[]= {3,6,7,9,13,14};
      int arr[]=mergesortedarray(arr1,arr2);   
      print(arr);
	}
}
