public class Computer {
    String model;
    double costComp;

    HDD hdd;
    RAM ram;
    CPU cpu;
    Motherboard motherboard;


    public Computer(String modelComp, double costComp) {
        this.model = modelComp;
        this.costComp = costComp;
        //Motherboard motherboard1 = new Motherboard();
       // HDD hdd1 = new HDD(this.model);
        //RAM ram1 = new RAM();
       // CPU cpu1 = new CPU();
    }

    public Computer(String modelComp, double costComp, Motherboard motherboard, HDD hdd, RAM ram, CPU cpu) {
        this.model = modelComp;
        this.costComp = costComp;
        Motherboard motherboard1 = new Motherboard();
        HDD hdd1 = new HDD(this.model);
        RAM ram1 = new RAM();
        CPU cpu1 = new CPU();
    }
    public void setModelHDD(HDD hdd){
        this.hdd = hdd;
    }



    public Computer(String modelComp, Motherboard motherboard, HDD hdd, RAM ram, CPU cpu) {
        this.model = modelComp;
        this.motherboard = motherboard;
        this.hdd = hdd;
        this.ram = ram;
        this.cpu = cpu;
    }


    public void getInfoComputer() {
        System.out.println("Компьютер: " + this.model);
        System.out.println("Стоимость: " + this.costComp);
        //System.out.println("Параметры:");
        //System.out.println("Motherboard :" + this.motherboard.model);
        // System.out.println("CPU: " + this.cpu.model);
        if(this.hdd != null )System.out.println("HDD " + this.hdd.model /*+ " \n type: " + this.hdd.type*/);
        //System.out.println("RAM: " + this.ram.model);
    }


    public double getCostComputer() {
        double cost = motherboard.cost + cpu.cost + hdd.cost + ram.cost;
        return cost;
    }


}
