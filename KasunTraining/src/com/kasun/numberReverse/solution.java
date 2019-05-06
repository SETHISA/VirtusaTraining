package com.kasun.numberReverse;

public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=730053;
		int r=1;
		int sum=0;
		int sol=0;
		while(r<i) {
			sum=i%(10*r);
//			sol=sol+sum;
			System.out.print(sum/r);
			i=i-(i%(10*r));
			r=r*10;
		}
	}

}
