package com.kasun.nuclear;
public class Nuclear {

	public static void main(String[] args) throws InterruptedException {
		int protonCount=10;
		int p=0;
		String proton="P ";;
		String space="";
		
		
		int count=0;
		

		for(int i=0;i<protonCount;i++) {
			
			
			p=(int) Math.pow(2, i);
			
			count=count+p;
			
			for(int r=10-i;r>0;r--) {
				
				
				space=space+"  ";
				
				
			}
			
			System.out.print(space);
			
			
			
			if(count<protonCount) {
				
			for(int y=1;y<p+1;y++) 
			{
				 
				System.out.print(proton);
						
			}
			Thread.sleep(2000);
			System.out.println();
			
			System.out.print(space);
			
			for(int y=1;y<p+1;y++) 
			{		
				 
				System.out.print("N ");
				
			}
			Thread.sleep(1000);
			}
			System.out.println();
			space=" ";
				
		}
		
		
	}

}
