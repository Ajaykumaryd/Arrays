package arrayassingnments;

public class t1arrayrotatn {
	public static void shiftktimes(int a[],int k){
	int n=a.length;
	int temp[]=new int[k];
	for(int j=0;j<k;j++){
	temp[j]=a[j];		
	}
	int i;	
	for(i=0;i<n-k;i++){
	a[i]=a[i+k];	
	}	
	for(int j=0;j<k;j++){	
    a[i] = temp[j];
    i++;
	}
	}	
    public static void print(int arr[]){
	int n=arr.length;
	for(int i=0;i<n;i++){
		System.out.print(arr[i]+ " ");
	}
	System.out.println();
	}    
    public static void main(String[] args) {	
    int arr[]= {1,2,3,4,5,6,7};
    int d=2;
    shiftktimes(arr,d);
    print(arr);  	
    }}