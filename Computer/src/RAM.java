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
    public void getInfoRam(){
        System.out.println("Options RAM:");
        System.out.println("Model: " + this.model);
        System.out.println("Amount of RAM: " + this.amountOfRam);
        System.out.println("Cost: " + this.cost);
    }
}
