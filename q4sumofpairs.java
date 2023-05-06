package arrayassingnments;

public class q4sumofpairs {

	public static int pairSum(int arr[], int x) {
    	int n=arr.length;
        int pairs=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==x){
                   pairs+=1;
                }
            }
        }
        return pairs;
    }

public static void main(String[] args) {
	int arr[]= {0,4,1,2,5,4 };			
	int n=5;
	int ans=pairSum(arr,n);
	System.out.println(ans);  
}}

