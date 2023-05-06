package arrays2;

public class q3insertionsorting {
	public static void insertion(int arr[]) {
	int	n=arr.length;
	for(int i=1;i<n;i++){
		int j=i-1;
		int temp=arr[i];
        while(j>=0&&arr[j]>temp) {
        	arr[j+1]=arr[j];
        	j--;
        }
	    arr[j+1]=temp;
	}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= { 5,7,8,4,1,25};
        insertion(arr);
        int n=arr.length;
        for(int i=0;i<n;i++){           //printing
        System.out.print(arr[i]+" ");
        }
        }
        }
	


