package com.kasun.Account;

import java.io.InvalidObjectException;

public class VisaCard extends CreditAccount{
	//public void checkBalance() {}


	@Override

	public  void withdraw(Double amount){

		System.out.println("Withdraw made from Credit Acount Class");

	};



	public boolean validateCardNumber(String cardNumber) throws InvalidObjectException, CreditAccountException {

		try{
		try {

			if (validateAccount(cardNumber)) {


				if (cardNumber.startsWith("8126"))
					return true;
				throw new InvalidObjectException("Invalid Card Number");
			} else throw new CreditAccountException("Invalid Account Number");

		}catch(AccountException e){
			throw new CreditAccountException("Account validation failed", e);
		}

		}catch(IllegalArgumentException iae){
			throw new AccountException("Account validation failed",iae);
		}
	}

}
