
package atm;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    Scanner input =new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance=0;
    private double savingBalance=0;
//    Set the customer no
    
    public void setCustomerNumber(int customerNumber){
        this.customerNumber=customerNumber;
    }
    
//    get the customer no
    
    public int getCustomerNumber(){
        return customerNumber;
    }
    
    // set the pin no
    public void setPinNumber(int pinNumber){
        this.pinNumber=pinNumber;
    }
    
    //get the pin no
    public int getPinNumber(){
        return pinNumber;
    }
    //get checking account balance
    
    public double getCheckingBalance(){
        return checkingBalance;
    }
    //get saving account balance
    public double getSavinBalance(){
        return savingBalance;
    }
    //calculate checking account withdrawl
    public void calcCheckingWithdraw(double amount){
        checkingBalance=(checkingBalance-amount);
     
    }
    //calculate saving account withdrawl
    public void calcSavingWithdraw(double amount){
        savingBalance=(savingBalance-amount);
        
    }
    //calculate checking account deposit
    public void calcCheckingDeposit(double amount){
        checkingBalance=(checkingBalance+amount);
        
    }
    //calculate saving account deposit
    public void calcSavingDeposit(double amount){
        savingBalance=(savingBalance+amount);
        
    }
    
    //customer checking account withdraw input
    public void getCheckingWithdrawInput(){
        System.out.println("Checking account balance: "+ moneyFormat.format(checkingBalance));
        System.out.println("Account you want to withdraw from checking account:");
        double amount=input.nextDouble();
        
        if ((checkingBalance-amount)>0) {
            calcCheckingWithdraw(amount);
            System.out.println("New checking balance :"+moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Balance cannot be negative."+"\n");
        }
    }
    
    //customer saving account withdraw input
    public void getSavingWithdrawInput(){
        System.out.println("Saving account balance: "+ moneyFormat.format(savingBalance));
        System.out.println("Account you want to withdraw from saving account:");
        double amount=input.nextDouble();
        
        if ((savingBalance-amount)>0) {
            calcSavingWithdraw(amount);
            System.out.println("New saving account balance :"+moneyFormat.format(savingBalance)+"\n");
        }else{
            System.out.println("Balance cannot be negative."+"\n");
        }
    }
    
    //customer checking account deposit input
    public void getCheckingDepositInput(){
        System.out.println("Checking account balance: "+ moneyFormat.format(checkingBalance));
        System.out.println("Are you want to deposit from checking account:");
        double amount=input.nextDouble();
        
        if ((checkingBalance+amount)>0) {
            calcCheckingDeposit(amount);
            System.out.println("New checking balance :"+moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Balance cannot be negative."+"\n");
        }
    }
    
    //customer saving account deposit input
    public void getSavingDepositInput(){
        System.out.println("Saving account balance: "+ moneyFormat.format(savingBalance));
        System.out.println("Account you want to deposit from saving account:");
        double amount=input.nextDouble();
        
        if ((savingBalance-amount)>=0) {
            calcSavingDeposit(amount);
            System.out.println("New saving account balance :"+moneyFormat.format(savingBalance)+"\n");
        }else{
            System.out.println("Balance cannot be negative."+"\n");
        }
    }

}
