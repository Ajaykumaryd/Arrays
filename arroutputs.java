package Array;

public class arroutputs {

	
	//1
//	public class Main {
//	    public static void main(String args[]){ 
//	      int arr[] = new int[5];
//	      arr[1] = 10;
//	      arr = new int[2];
//	      System.out.println(arr[0]);   
//	    }
//	}
	
	//2
//	public class Main {
//	    public static void change(int input[]){
//	    input[0] = 15;
//	    }
//
//	    public static void main(String args[]){
//	        int arr[] = new int[5];
//	        change(arr);
//	        System.out.println(arr[0]);
//	    }
//	}
	
	//3
//	public class Main {
//	    public static void change(int input[]){
//	    input = new int[5];
//	    input[0] = 15;
//	    }
//
//	    public static void main(String args[]){
//	        int arr[] = new int[5];
//	        change(arr);
//	        System.out.println(arr[0]);
//	    }
//	}
	//4
	public static int[] change(int input[]){
		input = new int[5];
		input[0] = 15;
		return input;
		}

		public static void main(String args[]){
		    int arr[] = new int[5];
		    arr=change(arr);
		    System.out.println(arr[0]);
		}
}


