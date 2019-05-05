package com.kasun.multi;

public class MultipleTable {

	public static void main(String[] args) {
		int p=0;
		String space;
		for(int i=0; i<11;i++) {
			
			
			for(int r=0; r<11; r++) {
				
				if((r-1)*(p-1)>9) {
					space=" ";
					
				}
				
				else {
					space="  ";
				}
				if(p==0) {
					if(r==0) {
						System.out.print("   ");
					}
					
				    else if(r==1) {
						System.out.print("|");
					}
					else {
						System.out.print(r-1+space);
					}
					
					
				}
				
				else if(p==1) {
					if(r==0) {
						System.out.print("   ");
					}
					
				    else if(r==1) {
						System.out.print("|");
					}
					else {
						System.out.print("---");
					}
					
				}
				
				else if(p==2) {
					if(r==0) {
						System.out.print(r+1+"  ");
					}
					
				    else if(r==1) {
						System.out.print("|");
					}
					else {
						System.out.print((r-1)*1+space);
					}
					
				}
				else if(p==3) {
					if(r==0) {
						System.out.print(r+2+"  ");
					}
					
				    else if(r==1) {
						System.out.print("|");
					}
					else {
						System.out.print((r-1)*2+space);
					}
					
				}
				else if(p==4) {
					if(r==0) {
						System.out.print(r+3+"  ");
					}
					
				    else if(r==1) {
						System.out.print("|");
					}
					else {
						System.out.print((r-1)*3+space);
					}
					
				}
				else if(p==5) {
					if(r==0) {
						System.out.print(r+4+"  ");
					}
					
				    else if(r==1) {
						System.out.print("|");
					}
					else {
						System.out.print((r-1)*4+space);
					}
				}
				else if(p==6) {
					if(r==0) {
						System.out.print(r+5+"  ");
					}
					
				    else if(r==1) {
						System.out.print("|");
					}
					else {
						System.out.print((r-1)*5+space);
					}
				}
				else if(p==7) {
					if(r==0) {
						System.out.print(r+6+"  ");
					}
					
				    else if(r==1) {
						System.out.print("|");
					}
					else {
						System.out.print((r-1)*6+space);
					}
				}
				else if(p==8) {
					if(r==0) {
						System.out.print(r+7+"  ");
					}
					
				    else if(r==1) {
						System.out.print("|");
					}
					else {
						System.out.print((r-1)*7+space);
					}
				}
				else if(p==9) {
					if(r==0) {
						System.out.print(r+8+"  ");
					}
					
				    else if(r==1) {
						System.out.print("|");
					}
					else {
						System.out.print((r-1)*8+space);
					}
				}
				else if(p==10) {
					if(r==0) {
						System.out.print(r+9+"  ");
					}
					
				    else if(r==1) {
						System.out.print("|");
					}
					else {
						System.out.print((r-1)*9+space);
					}
				}
				
			}
			p++;
			
			System.out.println();
		}
		
	}

}
