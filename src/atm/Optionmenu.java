
package atm;
//Main Class

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Optionmenu extends Account{
    Scanner menuInput=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
    
    HashMap<Integer, Integer> data=new  HashMap<Integer,Integer>();
    int selection;
    //Validate login information customer number and pin number
    
    public void getLogin() throws IOException{
        int x=1;
        
        do {
            try {
                data.put(9876543, 9876);
             data.put(8989898, 1890);
             data.put(8784365, 1982);
             
             System.out.println("Welcome to the atm project");
             System.out.println("Enter the customer no:");
             setCustomerNumber(menuInput.nextInt());
             
             System.out.println("Enter the pin no:");
             setPinNumber(menuInput.nextInt());
            } catch (Exception e) {
                System.out.println("\n"+"invalid characteer(s). Only numbers."+"\n");
                x=2;
            }
             for (Map.Entry<Integer,Integer> entry:data.entrySet()) {
                 if (entry.getKey()== getCustomerNumber() &&  entry.getValue()==getPinNumber()) {
                      getAccountType();
                 }
            }
             System.out.println("\n" + "Wrong Customer or pin Number."+"\n");
        } while (x==1);
    }
    
    //display account type menu wuith selection
    
    public void getAccountType(){
        System.out.println("Select the account you want to access:");
        System.out.println("Type 1.Checking account");
        System.out.println("Type 2.Saving account");
        System.out.println("Type 3.Exit");
        System.out.println("Choice:");
        
        selection=menuInput.nextInt();
        
        switch (selection) {
            case 1:getChecking();
                            break;
            case 2:getSaving();
                            break;
            case 3:System.out.println("thank you for using the atm,bye");;
                            break;
            default:System.out.println("\n"+"Invalid choice."+"\n");
                                getAccountType();
        }
    }
    
    //display checking account menu with selections
    
    public void getChecking(){
        System.out.println("Checking Account:");
        System.out.println("Type 1.-View Balance");
        System.out.println("Type 2.-Withdraw Funds");
        System.out.println("Type 3-Deposit Funds");
        System.out.println("Type 4-Exit");
        System.out.println("Choice:");
        
        selection=menuInput.nextInt();
        
        switch (selection) {
            case 1:System.out.println("Checking Account Balance:"+moneyFormat.format(getCheckingBalance()));
                          getAccountType();
                          break;
            case 2:getCheckingWithdrawInput();
                            getAccountType();
                            break;
            case 3:getCheckingDepositInput();
                            getAccountType();
                            break;
            case 4:System.out.println("thanking you for using this atm");        
                            break;
            default:System.out.println("\n"+"invalid choice.");
                                getChecking();
        }
    }
    public void getSaving(){
        
        System.out.println("Saving Account:");
        System.out.println("Type 1.-View Balance");
        System.out.println("Type 2.-Withdraw Funds");
        System.out.println("Type 3-Deposit Funds");
        System.out.println("Type 4-Exit");
        System.out.println("Choice:");
        
        selection=menuInput.nextInt();
        
        switch (selection) {
            case 1:System.out.println("Saving Account Balance:"+moneyFormat.format(getSavinBalance()));
                          getAccountType();
                          break;
            case 2:getSavingWithdrawInput();
                            getAccountType();
                            break;
            case 3:getSavingDepositInput();
                            getAccountType();
                            break;
            case 4:System.out.println("thanking you for using this atm");        
                            break;
            default:System.out.println("\n"+"invalid choice.");
                                getChecking(); 
        }
    }
}
