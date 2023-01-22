package com.indian.transfer.loanaccount;
import  com.indian.transfer.account.Account;

public class LoanAccount implements Account //inherite the interface class by implements keyword
{
	int Accno;
	String name;
	double Accbal;
	public LoanAccount(int accno, String name,double accbal )//create constructor with args
	{
		this.Accno=accno; 
		this.name=name;   //Initialize the args
		this.Accbal=accbal;		
	}
	public void deposit (double dep_amt)//implement the methods 
	{
		if(dep_amt>0)
		 {
			 System.out.println("depositing ammount="+dep_amt);
			 Accbal=Accbal-dep_amt;
			 System.out.println("current balance in LoanAccount="+Accbal);
	     }
	     else 
		 {
				   System.out.println("Enter valid Amount");
	     }
	}
	public void withdraw(double wd_amt)
	{
		   if (wd_amt<=Accbal && wd_amt>0)
		 {
			 System.out.println("withdraw amount="+wd_amt);
			 Accbal=Accbal+wd_amt;
			 System.out.println("current balanace in loanAccount="+Accbal);
	     }
	 else 
	   {
		System.out.println("limit reached");
	   }
	}
	 public void  balanceEnq()
	   {
		   System.out.println("Balance Enquary="+Accbal);
	   }
}
			   
	


