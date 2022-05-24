package Computer;

public class Motherboard {
   String  model;
    String form_factor;
    double cost;



    public Motherboard(String m, String form_factor, double c) {
        this.model = m;
        this.form_factor = form_factor;
        this.cost = c;

    }

    public void printInfoMotherboard() {
        System.out.println("Computer.Motherboard: " + this.model);
        System.out.println("Form factor motherboard: " + this.form_factor);
        System.out.println("Cost: " + this.cost);
    }
}
