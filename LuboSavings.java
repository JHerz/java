package lubobank;


public class SavingsAccount extends Account implements Printable {
    public SavingsAccount(int startingBalance) {
        super(startingBalance);
		}
    
    public void endOfMonth(){
        double interest = getBalance() * .02;
        addTransaction((int)interest);
		}
    
 public void print(){
        System.out.println("The savings account has " + getBalance() + " in it.");
        
		}
}