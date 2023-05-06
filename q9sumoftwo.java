package arrayassingnments;

public class q9sumoftwo {
	
	  public static void arraysum(int a1[],int a2[],int result[]) {
	  int n=a1.length;
	  int m=a2.length;
	  int i=n-1;
	  int j=m-1;
	  int k=Math.max(n,m);
	  int carry=0;
	  while(i>=0&&j>=0){
	  int sum=a1[i]+a2[j]+carry;
	  result[k]=sum%10;
	  carry=sum/10;
	  i--;
	  k--;
	  j--;
	  }
	  while(i>=0){
	  int sum=a1[i]+carry;
	  result[k]=sum%10;
	  carry=sum/10;
	  i--;
	  k--;}
	  while(j>=0) {
	  int sum=a1[j]+carry;
	  result[k]=sum%10;
	  carry=sum/10;
	  j--;
	  k--;}	    
	  result[0]=carry;
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
       int a1[]= {6,4,3,2,1,0};
       int a2[]= {5,4,3,2};
       int result[]=new int[Math.max(a1.length,a2.length)+1];
       arraysum(a1,a2,result);
       print(result);
	}
}
