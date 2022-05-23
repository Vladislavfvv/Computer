import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        Computer computer00 = new Computer("AMDFIRST", 500d);

        Computer computer0 = new Computer("AMD", 250.0d);

        Computer comp1 = new Computer("Intel-100500",
                new Motherboard("ASRock B660M Pro RSá", "mATX", 300.33d),
                new HDD("Seagate Barracuda 2TB", 2000, "external HDD", 100.5d),
                new RAM("Crucial Ballistix 2x8GB DDR4", 16, 50.3d),
                new CPU("Intel Core i9-9900K", 200.5d));

        Computer comp2 = new Computer("Intel2022",
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
        comp2.getInfoComputer();


        System.out.println("/////////////////////");
        System.out.println("/////////////////////");
        comp1.getInfoComputer();
        System.out.println();


    }
}
