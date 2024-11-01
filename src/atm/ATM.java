
package atm;

public class ATM extends Optionmenu{
    public static void main(String[] args) {
        Optionmenu optionmenu=new Optionmenu();
        try {
            optionmenu.getLogin();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}
