package com.kasun.Account;

public class Account {


	int withdrawCount=5;

	public boolean accountWithdrawValidation(){
		if(withdrawCount<=3){

			return true;

		}
		else{
			throw new AccountException("Withdraw count exceeded");
		}
	}


	public  void withdraw(Double amount){};

}
