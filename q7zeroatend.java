package arrayassingnments;

public class q7zeroatend {

	public static void zeroesatend(int arr[]){
		int n=arr.length;
		int nonzeroes=0;
		for(int i=0;i<n;i++){
			if(arr[i]!=0){
				int t=arr[nonzeroes];
				arr[nonzeroes]=arr[i];
				arr[i]=t;
				nonzeroes++;
			}
		}
	}
	public static void print(int arr[]){
	int n=arr.length;
	for(int i=0;i<n;i++){
		System.out.print(arr[i]+ " ");
	}
	System.out.println();
	}	
    public static void main(String[] args){
    int arr[]= {2,0,0,1,3,0,0};
    zeroesatend(arr);
    print(arr);
    }}            
             