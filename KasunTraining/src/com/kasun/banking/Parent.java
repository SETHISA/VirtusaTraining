package com.kasun.banking;

public class Parent {

	private int money;   // encapsulation 01
	
	public int getMoney() {
		return money/2;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void run() {
		System.out.println("parent Run");
	}
}
