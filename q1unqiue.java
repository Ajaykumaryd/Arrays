package arrayassingnments;

import java.util.Scanner;

public class q1unqiue {
	
	public static int[]takeinput(){                                 
                                                                    
		Scanner s = new Scanner(System.in);                         
		int n=s.nextInt();                                          
		int input[]=new int [n];
		for(int i=0;i<n;i++) {      //input variables
			input[i]=s.nextInt();}
	          return input;}  
	
	   public static int unique(int arr[]){
	    int n=arr.length;
	    for(int i=0;i<n;i++){
	    	int count=0;
	    	for(int j=0;j<n;j++){
	    		if(arr[i]==arr[j]){
	    		   count++;
	    		}}
	            if(count==1){
	            	return arr[i];
	        }
	    }    
	    return arr[0];
	   }
		public static void main(String[] args) {
			int arr[]=takeinput();
			int ans=unique(arr);
			System.out.print(ans);
		}   
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	