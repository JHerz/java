package lubobank;


public class CheckingAccount extends Account implements Printable{
    public CheckingAccount(int startingBalance) {
        super(startingBalance);
		}
    
	public void endOfMonth(){
        if (getBalance() < 100000) {
            addTransaction(-1000);
			}
		}
    
	public void print(){
        System.out.println("The checking account has " + getBalance() + " in it.");
        
		}
        
    }