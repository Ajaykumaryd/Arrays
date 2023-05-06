package arrayassingnments;

public class q91sort012 {

	public static void sort012(int arr[]) {
	int n=arr.length;
	int zero=0;
	int one=0;
	int two=0;
	for(int i=0;i<n;i++){
		if(arr[i]==0){
			zero++;}
		else if(arr[i]==1){
			one++;
		}else{
			two++;
		}}
		int index=0;
		for(int i=0;i<zero;i++){
			arr[index]=0;
			index++;}
		for(int i=0;i<one;i++){
			arr[index]=1;
			index++;}
		for(int i=0;i<two;i++){
			arr[index]=2;
			index++;}			
		}
	public static void print(int arr[]){
		int n=arr.length;
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		}         
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]={0,2,0,1,2,1,0,2,0};    
	  sort012(arr);
	  print(arr);
}
}