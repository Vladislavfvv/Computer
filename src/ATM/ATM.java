package ATM;

public class ATM {
    int bankStorage;

    int banknote_20;
    int banknote_50;
    int banknote_100;
    Bank bank;
    Money mon;

    public ATM(int b20, int b50, int b100) {
        this.banknote_20 = b20;
        this.banknote_50 = b50;
        this.banknote_100 = b100;
        this.bankStorage = bankStorage + this.banknote_20*20 + this.banknote_50*50 + this.banknote_100*100;
        this.bank = new Bank("Belarusbank, ATM #100");
    }


    public void getinfoStorage() {
        System.out.println(this.bank.name);
        System.out.println("� ��������� ��� ��������: " + this.bankStorage + " ���");
        System.out.println("������ 20� = " + this.banknote_20 + " ��");
        System.out.println("������ 50� = " + this.banknote_50 + " ��");
        System.out.println("������ 100� = " + this.banknote_100 + " ��");
    }
    public void putMoneyInAtm(int m20){
        this.banknote_20 = this.banknote_20 + m20;
        this.bankStorage = this.banknote_20*20 + this.banknote_50*50 + this.banknote_100*100;
    }

    public void putMoneyInAtm(int m20, int m50){
        this.banknote_20 = this.banknote_20 + m20;
        this.banknote_50 = this.banknote_50 + m50;
        this.bankStorage = this.banknote_20*20 + this.banknote_50*50 + this.banknote_100*100;
    }

    public void putMoneyInAtm(int m20, int m50, int m100){
        this.banknote_20 = this.banknote_20 + m20;
        this.banknote_50 = this.banknote_50 + m50;
        this.banknote_100 = this.banknote_100 + m100;
        this.bankStorage = this.banknote_20*20 + this.banknote_50*50 + this.banknote_100*100;
    }


}