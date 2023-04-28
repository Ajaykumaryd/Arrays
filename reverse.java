package Array;

public class reverse {
	
	private static void swapElements(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
	public static void reversee(int a[],int si,int ei) {
	if(si>ei){
		return ;
	}	
	swapElements(a,si,ei);
	reversee(a,si+1,ei-1);		
	}
	
	
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {1,2,3,4,5};
     reversee(a,0,a.length-1);	
     for(int i=0;i<a.length;i++) {
    	 System.out.print(a[i]+ " ");
     }
	}

}
