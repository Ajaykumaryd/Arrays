

public class Solution {

	public static void spiralPrint(int a[][]){
	int rows=a.length;
	if(rows==0){
		return;
	}
	int cols=a[0].length;
	int cs=0;
	int ce=cols-1;
	int rs=0;
	int re=rows-1;

    while(cs<=ce && rs<=re){   
	 for(int i=cs;i<=ce;i++){
		  System.out.print(a[rs][i]+" ");
	}
	rs++;
   
    for(int i=rs;i<=re;i++){
	     System.out.print(a[i][ce]+" ");
	}	
	ce--;
	
	if(rs<=re)
	for(int i=ce;i>=cs;i--){
		System.out.print(a[re][i]+" ");
	}	
	re--;
	

	if(cs<=ce)
    for(int i=re;i>=rs;i--){
		System.out.print(a[i][cs]+" ");
	}
	cs++;
  		
	}
  }
}
