package arrayassingnments;

public class sort012m2 {
	public static void sort(int arr[]){
	int n=arr.length;
	int nz=0;
	int nt=n-1;
	int i=0;
	while(i<=nt){
	if(arr[i]==0){
		int t=arr[nz];
		arr[nz]=arr[i];
		arr[i]=t;
		nz++;
		i++;
	     }
	else if(arr[i]==2){
		int t=arr[nt];
		arr[nt]=arr[i];
		arr[i]=t;
		nt--;}         
	else {	
	    i++;
	}
	}
	}	
	public static void print(int arr[]){
		int n=arr.length;
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		}         // TODO Auto-generated method stub
	public static void main(String[] args) {		
		  int arr[]={2,2,1,1,2,1,0,0,1,2,2};				      
		  sort(arr);
		  print(arr);			
	}
}
