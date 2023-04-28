package Array;

public class q7allpairs {
	
	public static void printpairs(int arr[]){
		int n=arr.length;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				System.out.print("("+arr[i]+ "," +arr[j]+")");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
         int arr[]= {1,2,3,4,5,6};
         printpairs(arr);     
	}
}
