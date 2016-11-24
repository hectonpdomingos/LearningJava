package aprendizadojava;

/**
 * Created by Hecton on 23/11/2016.
 */
public class AccessBank {
    public static void main(String[] args){
        Account account = new Account("12345", 0.0, "Hecton Domingos", "hecton@myemail.com", "89888989");

        System.out.println(account.getNumber());
        System.out.println(account.getBalance());





        /*account.setNumber("0740");
        account.setBalance(0.0);
        account.setCustomerName("Hecton Domingos");
        account.setCustomerEmailAddress("hecton@gmail.com");
        account.setCustomerPhoneNumber("84199539");
*/


    /*    account.withdrawal(100.0);
        account.deposit(50.0);
        account.withdrawal(100.0);
        account.deposit(51.0);
        account.withdrawal(100.0);

        Account hectonAccount = new Account("Hecton", "hec@memail", "1234");
        System.out.println(hectonAccount.getNumber() + " name " + hectonAccount.getCustomerName());
    */



    }
}
