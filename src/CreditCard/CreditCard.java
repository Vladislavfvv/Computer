package CreditCard;

public class CreditCard {
    long accountNumber;
    int currentAccountAmount;

    public CreditCard(long account, int amount) {
        this.accountNumber = account;
        this.currentAccountAmount = amount;
    }
    public void addMoneyToCard(int money){
        this.currentAccountAmount += money;
    }
    public void withdrawMoneyFromCard(int cash){
        this.currentAccountAmount -= cash;
    }
    public void printCurrentCardInfo(){
        System.out.println(accountNumber + " : " + currentAccountAmount);
    }
}

