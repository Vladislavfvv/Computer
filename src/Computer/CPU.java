package Computer;

public class CPU {
    String model;
    double cost;

    public CPU() {

    }

    public CPU(String s) {
        this.model = s;
    }

    public CPU(String m, double c) {
        this.model = m;
        this.cost = c;
    }


    public void getInfoCPU() {
        System.out.println("Options Computer.CPU: ");
        System.out.println("Model: " + this.model);
        System.out.println("Cost: " + this.cost);
    }
}
