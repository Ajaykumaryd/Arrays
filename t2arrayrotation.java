package arrayassingnments;

public class t2arrayrotation {
	
	public static int arrayrotation(int arr[]){
	int n=arr.length;
	int ans=0;
	for(int i=0;i<n-1;i++){
	if(arr[i]>arr[i+1]){
	ans=i+1;	
	}
	}
	return ans;
	}
	
		// TODO Auto-generated method stub
		public static void main(String[] args) {		
		int arr[]={6,5,4,1,2,3,4,5};
		System.out.println(arrayrotation(arr));		      
			 
	}
}
