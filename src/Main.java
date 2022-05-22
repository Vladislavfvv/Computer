import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Computer computer00 = new Computer("AMDFIRST",
                new Motherboard("ASUS", "mATX", 300.25d),
                new HDD("WD ", 2000, "internal", 85.3d),
                new RAM("Kingston ", 16, 95.7d),
                new CPU("AMD ", 175.25d),
                500d);

        Computer computer0 = new Computer("AMD",
                new Motherboard("ASUS Prime H510M-K", "mATX", 300.25d),
                new HDD("WD Blue 2TB WD20EZBX", 2000, "internal", 85.3d),
                new RAM("Kingston FURY Beast 2x8GB", 16, 95.7d),
                new CPU("AMD Ryzen 5 5600X", 175.25d), 250.0d);
                //new CPU("AMD Ryzen 5 5600X", 175.25d));

       Computer comp1 = new Computer("Intel-100500",
                new Motherboard("ASRock B660M Pro RSá", "mATX", 300.33d),
                new HDD("Seagate Barracuda 2TB", 2000, "external HDD", 100.5d),
                new RAM("Crucial Ballistix 2x8GB DDR4", 16, 50.3d),
                new CPU("Intel Core i9-9900K", 200.5d));

        Computer comp2 = new Computer("Intel2",
                new Motherboard("ASRock B660M Pro RSá", "mATX", 300.33d),
                new HDD("Seagate Barracuda 2TB", 2000, "external HDD", 100.5d),
                new RAM("Crucial Ballistix 2x8GB DDR4", 16, 50.3d),
                new CPU("Intel Core i9-9900K", 200.5d));


        computer00.getInfoComputer();
        System.out.println("/////////////////////");
        System.out.println("/////////////////////");


        computer0.getInfoComputer();

        System.out.println("/////////////////////");
        System.out.println("/////////////////////");
        System.out.println();
        comp2.getInfoComputer();
        double test2 = comp1.getCostComputer();
        String formattedDouble2 = new DecimalFormat("#0.00").format(test2);
        System.out.println(formattedDouble2);
        System.out.println("/////////////////////");
        System.out.println("/////////////////////");
        comp1.getInfoComputer();
        System.out.println();
        //    System.out.println("/////////////////////");
        //    comp1.motherboard.getinfoMotherboard();
        double test1 = comp1.getCostComputer();
        String formattedDouble1 = new DecimalFormat("#0.00").format(test1);
        System.out.println(formattedDouble1);

        System.out.println("*******************");
        computer0.getinfoMotherboard1();
        computer0.motherboard.getinfoMotherboard();

    }
}
