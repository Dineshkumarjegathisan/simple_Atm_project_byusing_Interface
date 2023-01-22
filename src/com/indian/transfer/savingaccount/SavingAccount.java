package com.indian.transfer.savingaccount;
import com.indian.transfer.account.Account;

public class SavingAccount implements Account
{
   int AccNo;
   String Name;
   double Accbal;
   public SavingAccount(int AccNo,String Name,double Accbal)
   {
	   this.AccNo=AccNo;
	   this.Accbal=Accbal;
	   this.Name=Name;
	   
   }
   public void deposit(double dep_amt)
   {
	   if (dep_amt>0)
	   {
	   System.out.println("depositing ammount="+dep_amt);
	   Accbal=Accbal+dep_amt;
	   System.out.println("current balance in savingAccount="+Accbal);
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
		   Accbal=Accbal-wd_amt;
		   System.out.println("current balanace in savingAccount="+Accbal);
	   }
	   else 
	   {
		   System.out.println("if you enter" + wd_amt +" you will get insufficint balance either Invalid ammount");
	   }
		   
   }
   public void  balanceEnq()
   {
	   System.out.println("Balance Enquary="+Accbal);
   }
   

}
