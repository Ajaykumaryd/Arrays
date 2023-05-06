package arrayassingnments;

public class q71zeroesatend {
	public static void zeroesend(int arr[]) {
	int n=arr.length;
	int temp[]=new int[n];
	int k=0;
	for(int i=0;i<n;i++){
	if(arr[i]!=0){
	temp[k]=arr[i];
	k++;
	}
	}
	while(k<n){
		temp[k]=0;
		k++;		
	}
	 for(int i=0;i<n;i++){
         arr[i]=temp[i];
         System.out.print(arr[i]+ " ");
     }    
 }  
		public static void main(String[] args) {		
	    int arr[]={0,2,8,7,0,8,0,5,4,2};    
		zeroesend(arr);			 			
		}
	}


