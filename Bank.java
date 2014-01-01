package bank;

import java.util.ArrayList;


public class Bank {

   
    public static void main(String[] args) {
         ArrayList <Account> accounts = new ArrayList <Account>();
    accounts.add(new CheckingAccount("John"));
    accounts.add(new SavingsAccount("Sam"));
    accounts.add(new CheckingAccount("Gerald"));
    
    accounts.get(0).addTransaction(900);
    accounts.get(1).addTransaction(100000);
    accounts.get(2).addTransaction(2000);
   
    
    
    for(Account account : accounts){
    account.endOfMonth();
    System.out.println(account.getName() + "'s final balance is: " + account.getBalance());
    //System.out.println(account);
    }
   
    
    }
    
}