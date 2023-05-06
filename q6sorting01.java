package arrayassingnments;

public class q6sorting01 {
		
	public static void sortZeroesAndOne(int[] arr){
	 int nextZeros =0;
	 int n=arr.length;
     for(int i=0;i<n;i++){
         if(arr[i]==0){
             int temp = arr[nextZeros];
             arr[nextZeros] = arr[i];
             arr[i] = temp;
             nextZeros++;
             }
             }}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int a[]= {0 ,1, 1, 0 ,1 ,0 };
             sortZeroesAndOne(a);  
         	int n=a.length;
         	for(int i=0;i<n;i++){           //printing
         		System.out.print(a[i]+" ");
         	}}}

