package ATM;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        ATM atm = new ATM(1, 1, 1);
        atm.getinfoStorage();
        while (true) {
            System.out.println("///////////////////////////");
            System.out.println("∆елаете положить деньги в банкомат? (y/n)");
            char m = (char) System.in.read();
            if (m == 'n') break;
            else {
                System.out.println("¬ведите количество купюр номиналом 20р:");
                Scanner scanner = new Scanner(System.in);
                int n20 = scanner.nextInt();

                System.out.println("¬ведите количество купюр номиналом 50р:");
                int n50 = scanner.nextInt();

                System.out.println("¬ведите количество купюр номиналом 100р:");
                int n100 = scanner.nextInt();

                if (n20 != 0 & n50 == 0 & n100 == 0) {
                    atm.putMoneyInAtm(n20);
                } else if (n20 != 0 & n50 != 0 & n100 == 0) {
                    atm.putMoneyInAtm(n20, n50);
                } else if (n20 != 0 & n50 != 0 & n100 != 0) {
                    atm.putMoneyInAtm(n20, n50, n100);
                }
            }

        System.out.println("///////////////////////////");
        atm.getinfoStorage();
        }
    }
}
