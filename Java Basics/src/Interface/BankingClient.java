package Interface;

public class BankingClient implements Interface, Investments {
//This class should implement all the methods stated in the Interface

    public static void main(String[] args) {

        BankingClient bc = new BankingClient();

        bc.checkingBalance();
        bc.payCreditCard();
        bc.transferBalance();
        bc.loggedIn();

        Interface bc2 = new BankingClient();
        bc2.checkingBalance();
        bc2.payCreditCard();
        bc2.transferBalance();
        //No loggedIn method
        // bc2 only have the methods of Interface since the obj is reference only in Interface
        // bc2 now is handled by Interface and not BankingClient
        // bc2 is responsible only to implement Interface's methods
        // this is called runtime polymorphism

        Investments inv = new BankingClient();
        inv.HouseSavings();
        //No checkingBalance, payCreditCard, transferBalance, and loggedIn methods
        // inv only have the methods of Investments since the obj is reference only in Investments
        // inv now is handled by Investments and not BankingClient
        // inv is responsible only to implement Investments' methods
        // this is called runtime polymorphism

    }

    @Override
    public void payCreditCard() {
        System.out.println("payCreditCard");
    }

    @Override
    public void transferBalance() {
        System.out.println("transferBalance");
    }

    @Override
    public void checkingBalance() {
        System.out.println("checkingBalance");
    }

    public void loggedIn(){
        System.out.println("logedIn");
    }

    @Override
    public void HouseSavings() {
        System.out.println("HouseSavings");
    }
}
