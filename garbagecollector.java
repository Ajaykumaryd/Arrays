package Array;

public class garbagecollector {
	
     
	public static void incarray(int input[]){
		input=new int[5];
		for(int i=0;i<input.length;i++){
			input[i]++;}}
	
	
	public static void print(int input[]){
		int size = input.length;
		for(int i = 0; i < size; i++){
			System.out.print(input[i] +" ");
		}
		System.out.println();
		
	}
	public static void main(String[] args){
		int arr[]= {1,2,3,4,5};
		incarray(arr);
		print(arr);				
	}		
	   }
	

