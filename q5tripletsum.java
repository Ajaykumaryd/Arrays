package arrayassingnments;

public class q5tripletsum {
	 public static int findTriplet(int[] arr, int x) {
	    	int n=arr.length;
	        int pairs=0;
	        for(int i=0;i<n-1;i++){
	            for(int j=i+1;j<n;j++){
	                for(int k=j+1;k<n;k++){
	                if(arr[i]+arr[j]+arr[k]==x){
	                        pairs+=1;
	                }         
	            }
	        }
	    }
	    return pairs;
	}
public static void main(String[] args) {
	int arr[]= {8,9,9,1,7,5,5,10,1,0,7};			
	int n=16;
	int ans=findTriplet(arr,n);
	System.out.println(ans);  
}}



