package com.indian.transfer.ATM;
import com.indian.transfer.account.*;
import com.indian.transfer.savingaccount.*;
import com.indian.transfer.loanaccount.*;

public class MainClass 
{
	
	public static void main(String[] args) 
	{
		Account a1 = new SavingAccount(1234,"dinesh",5000);
									//(accNo,Acc_Hol_Name,Acc_Bal)
		a1.deposit(200);
		a1.withdraw(5000);
		a1.balanceEnq();
		
		Account a2 = new LoanAccount(1234,"dinesh", 1000);
		
		a2.deposit(500);
		a2.withdraw(200);
		a2.balanceEnq();		
	}
}
