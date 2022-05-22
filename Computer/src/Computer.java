public class Computer {
    String model;
   // double costComp = 1d;

    HDD hdd;
    RAM ram;
    CPU cpu;
    Motherboard motherboard;

   /* public double getCostComp() {
        return costComp;
    }

    public void setCostComp(double costComp) {
        this.costComp = costComp + motherboard.cost + cpu.cost + hdd.cost + ram.cost;
    }*/

   /* public Computer(String modelComp, double costComp) {
        this.model = modelComp;
        this.costComp = costComp;
    }*/


    public Computer(String modelComp, Motherboard motherboard, HDD hdd, RAM ram, CPU cpu) {
        this.model = modelComp;
        //this.cost = cost;
        this.motherboard = motherboard;
        this.hdd = hdd;
        this.ram = ram;
        this.cpu = cpu;
    }

    /*public double getCostComputer(Motherboard cost1, HDD cost2, RAM cost3, CPU cost4){
            this.cost = cost1 + cost2 + cost3 + cost4;
            return this.cost;
    }*/
    public void getInfoComputer() {
        System.out.println("Компьютер: " + this.model);
        System.out.println("Параметры:");
        System.out.println("Motherboard :" + this.motherboard.model);
        System.out.println("CPU: " + this.cpu.model);
        System.out.println("HDD" + this.hdd.model + " \n type: " + this.hdd.type);
        System.out.println("RAM: " + this.ram.model);
    }


    public double getCostComputer() {
        double cost = motherboard.cost + cpu.cost + hdd.cost + ram.cost;
        return cost;
    }


}
