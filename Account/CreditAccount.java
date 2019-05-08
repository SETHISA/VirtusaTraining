package com.kasun.Account;

public class CreditAccount extends Account {

	boolean validateAccount(String accountNumber) {


		try {

			if (accountWithdrawValidation()) {


				if (accountNumber.length() > 5)
					return true;
				throw new IllegalArgumentException("Account Number should lenght over 5 digits");


			} else {

				return false;
			}

		} catch (AccountException ae){
			throw new IllegalArgumentException("Withdraw count validation failed", ae);
		}
	}
}