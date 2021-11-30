
package Com_eviro_assessment_grad001_DesmondZulu;

import java.math.BigDecimal;


public class SystemDB {
    
    private static SystemDB systemDB = null;
	private Object [] accounts = {
            
			new SavingsAccount("101", "1", new BigDecimal(2000.00)),
			new SavingsAccount("102", "2", new BigDecimal(5000.00)),
			new CurrentAccount("102", "2", new BigDecimal(1000.00), new BigDecimal(10000.00)),
			new CurrentAccount("104", "4", new BigDecimal(-5000.00), new BigDecimal(20000.00)),
	};
        
    private SystemDB() {
		
	}
    
    public static SystemDB getInstance() {
		if(systemDB == null)
			systemDB = new SystemDB();
		
		return systemDB;
	}

	public Object[] getAccounts() {
		return accounts;
	}
    
}
