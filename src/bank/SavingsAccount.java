
package bank;

import java.math.BigDecimal;

public class SavingsAccount extends AccountService {
    
        private BigDecimal balance;
	private String id;
	public String accountNum;
        
public SavingsAccount(String id,String accountNum, BigDecimal balance) {
    
	this.id = id;
	this.accountNum = accountNum;
	this.balance = balance;
	}

public String getAccountNumber() {
    
		return accountNum;
	}


	public void withdraw(String accountNum, BigDecimal amountToWithdraw) {
		
		if(balance.compareTo(amountToWithdraw) == 0 || balance.compareTo(amountToWithdraw) == 1) {
			// withdraw
			balance = balance.subtract(amountToWithdraw);
		}else  {
			// cannot withdraw
                        System.out.println("Can not withdraw");
			
		}
    
    
}
}
