
package Com_eviro_assessment_grad001_DesmondZulu;

import java.math.BigDecimal;                                                                                                              
import javax.swing.*; 

public class MainClass {

    
    public static void main(String[] args) {
         
        String accountNum;                                                                                                                
	BigDecimal amountToWithdraw;                                                                                                      
		                                                                                                                                  
		// Welcome Menu                                                                                                                   
	Welcome();                                                                                                                        
	int enterAcc = Integer.parseInt(JOptionPane.showInputDialog("Enter Account Number"));                                             
	accountNum = enterAcc + "";                                                                                                       
	//amountToWithdraw = new BigDecimal(Double.parseDouble(JOptionPane.showInputDialog("Enter Amount to withdraw")));                 
		                                                                                                                                  
	SystemDB bank = SystemDB.getInstance();                                                                                           
	//Object [] accs = (Object[]) bank.getAccounts();
                
        System.out.println(bank.getAccounts().length);
        
    }
    
    public static void Welcome() {                                                                                                        
		                                                                                                                                  
		System.out.print("Welcome to Eviro Banking Service\n");                                                                           
	}                                                                                                                                     
}        
    

