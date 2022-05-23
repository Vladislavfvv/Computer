package Computer;

public class RAM {
    String model;
    int amountOfRam;
    double cost;

    public RAM() {

    }
    public RAM(String model, int amountOfRam, double cost){
        this.model = model;
        this.amountOfRam = amountOfRam;
        this.cost = cost;
    }

    public RAM(String s) {
        this.model = s;
    }

    public void getInfoRam(){
        //System.out.println("Options Computer.RAM:");
        System.out.println("Model: " + this.model);
        System.out.println("Amount of Computer.RAM: " + this.amountOfRam);
        System.out.println("Cost: " + this.cost);
    }
}
