package arrayassingnments;

public class q82ndlargest {
		
		public static int secondLargestElement(int[] arr) {
		int n=arr.length;
		int l=Integer.MIN_VALUE;
		int sl=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
		if(arr[i]>l){
			 sl=l;
		         l=arr[i];
		        
		         }
		         else if(arr[i]>sl){
		        	 if(l!=arr[i]){
		               sl=arr[i];
		           }                  
		         }
		}
		        return sl;
		}

   public static void main(String[] args) {
	   int arr[]= { 8,9,9,1,7,5,5,10,1,0,7};
	   int ans=secondLargestElement(arr);
	   System.out.println(ans);
	   
   }}
   