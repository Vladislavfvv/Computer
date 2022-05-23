package CreditCard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard(111111111, 1500);
        CreditCard creditCard2 = new CreditCard(222222222, 2000);
        CreditCard creditCard3 = new CreditCard(333333333, 3000);

        System.out.println("Balance on your credit cards: ");
        creditCard1.printCurrentCardInfo();
        creditCard2.printCurrentCardInfo();
        creditCard3.printCurrentCardInfo();

        System.out.println("�� ����� ����� ��������� 1 �����?");
        Scanner scanner = new Scanner(System.in);
        int sum1 = scanner.nextInt();

        System.out.println("�� ����� ����� ��������� 2 �����?");
        int sum2 = scanner.nextInt();

        System.out.println("������� ������� � 3 �����?");
        int sum3 = scanner.nextInt();

        creditCard1.addMoneyToCard(sum1);
        creditCard2.addMoneyToCard(sum2);
        creditCard3.withdrawMoneyFromCard(sum3);

        System.out.println("After transaction:");
        creditCard1.printCurrentCardInfo();
        creditCard2.printCurrentCardInfo();
        creditCard3.printCurrentCardInfo();
    }
}
