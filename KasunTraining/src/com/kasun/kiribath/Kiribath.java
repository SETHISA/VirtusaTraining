package com.kasun.kiribath;

public class Kiribath {
	public static void main(String[] args) throws InterruptedException {
		int protonCount=10;
		int p=0;
		String proton="* ";;
		String space="";
		String space1="  ";
		
		
		int count=1;
		

		for(int i=0;i<protonCount;i++) {
			
			
			p=i;
			
			
			
			for(int r=protonCount-i;r>0;r--) {
				
				
				space=space+" ";
				
				
			}
			

				
			for(int y=1;y<p+1;y++) 
			{
				 
				System.out.print(proton);
						count++;
			}
			
			System.out.println();
			
			System.out.print(space);
			
		
			space="";
			
			

		
		}
		
		
		
		for(int i=protonCount;i>0;i--) {
			
			
			p=i;
			
			
			
			for(int r=protonCount-i;r>0;r--) {
				
				
				space1=space1+" ";
				
				
			}
		
		
				
			for(int y=1;y<p+1;y++) 
			{
				 
				System.out.print(proton);
						count++;
			}
			
			System.out.println();
			
			System.out.print(space1);
			
		
			space1="  ";
			
			

		
		}
		
		
		
		
		
	}

}
