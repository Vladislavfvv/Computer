public class HDD {
    String model;
    int capacityofHdd;
    String type;
    double cost;

    public HDD(){

    }

    public HDD(String model, int capacityofHdd, String type, double cost){
        this.model = model;
        this.capacityofHdd = capacityofHdd;
        this.type = type;
        this.cost = cost;
    }

    public void getInfoHdd(){
        System.out.println("HDD options: ");
        System.out.println("Model: " + this.model);
        System.out.println("Capacity of HDD: " + this.capacityofHdd);
        System.out.println("Type: " + this.type);
        System.out.println("Cost: " + this.cost);
    }
}
