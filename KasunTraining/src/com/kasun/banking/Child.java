package com.kasun.banking;

public class Child extends Parent{
	
	
	public static void main(String[] args) {
		
		
		Child child= new Child();


		Child.MoneyEarn ownMoney = child.new MoneyEarn();

		Parent parent=new Parent();
		parent.setMoney(100);

		ownMoney.setTotalMoney(1000);
		
		int spentMoney=90;
		int epf=30;
		
		System.out.println("Recieved from parent="+parent.getMoney());
		
		System.out.println("Own money="+ownMoney.getRecievedMoney(epf));
		
		System.out.println("Total money="+(ownMoney.getRecievedMoney(epf)+parent.getMoney()));
		
		child.moneySaved((ownMoney.getRecievedMoney(epf)+parent.getMoney())-child.moneySpend(spentMoney));
		


	}
	
	public int moneySpend(int toSpent) {

		
		int spentMoney=toSpent;
		 new Object(){						//anonymous inner class
			
			

			public int purches() {
				
				System.out.println("spent money="+spentMoney); 
				return spentMoney;
			}
		}.purches();
		
		
		return spentMoney;	
		
		
	}
	
	
	public void moneySaved(int s) {
		
		int saved=s;
		class Bank{
			public void saving() {
				System.out.println("Saved Money(Bank)="+saved);  // method local inner class
			}
		}
	
		
		
		Bank bank1=new Bank();
		
		bank1.saving();
	}
	
	
	
	class MoneyEarn{		// member inner class
		
		private int totalMoney;
		
		private int recievedMoney;

		public int getTotalMoney() {
			return totalMoney;
		}

		public void setTotalMoney(int totalMoney) {			
			this.totalMoney = totalMoney;
		}

		public int getRecievedMoney(int epf) {
			
			recievedMoney=totalMoney-epf;
			return recievedMoney;
		}

		public void setRecievedMoney(int recievedMoney) {
			this.recievedMoney = recievedMoney;
		} 
		

		
	}

}
