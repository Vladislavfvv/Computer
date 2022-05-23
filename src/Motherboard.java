public class Motherboard {
    String model;
    String form_factor;
    double cost;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getForm_factor() {
        return form_factor;
    }

    public void setForm_factor(String form_factor) {
        this.form_factor = form_factor;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


    /*{
        model = "AMD";
        cost = 155.55d;
        form_factor = "mATX";
    }*/

    public Motherboard() {

    }
    public Motherboard(String m){
        this.model = m;

    }

    public Motherboard(String m, String form_factor, double c) {
        this.model = m;
        this.form_factor = form_factor;
        this.cost = c;

    }

    public void getinfoMotherboard() {
        System.out.println("Motherboard: " + this.model);
        System.out.println("Form factor motherboard: " + this.form_factor);
        System.out.println("Cost: " + this.cost);
    }
}
