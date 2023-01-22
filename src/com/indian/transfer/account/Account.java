package com.indian.transfer.account;

public interface Account 
{
	//inside the interface class we have only declare the methods
	//function members are by default abstract class
	void deposit(double dep_amt);
	void withdraw(double wd_amt);
	void balanceEnq();
    //int x=10;
}
