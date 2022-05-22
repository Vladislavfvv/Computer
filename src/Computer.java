public class Computer {
    String model;
    double costComp;

    HDD hdd;
    RAM ram;
    CPU cpu;
    Motherboard motherboard;


    public Computer(String modelComp, Motherboard motherboard, HDD hdd, RAM ram, CPU cpu, double costComp) {
        this.model = modelComp;
        this.motherboard = new Motherboard();
        this.hdd = new HDD();
        this.ram = new RAM();
        this.cpu = new CPU();
        this.costComp = costComp + this.motherboard.cost + this.hdd.cost + this.ram.cost + this.cpu.cost;
    }

    public Computer(String modelComp, Motherboard motherboard, HDD hdd, RAM ram, CPU cpu) {
        this.model = modelComp;
        this.motherboard = motherboard;
        this.hdd = hdd;
        this.ram = ram;
        this.cpu = cpu;
    }


    public void setModelHDD(HDD hdd) {
        this.hdd = hdd;
    }


    public double getCostComputer() {
        double cost = motherboard.cost + cpu.cost + hdd.cost + ram.cost;
        return cost;
    }


    public void getInfoComputer() {
        System.out.println("Компьютер: " + this.model);
        System.out.println("Стоимость: " + this.costComp);
        //System.out.println("Параметры:");
        if (this.motherboard != null) System.out.println("Motherboard :" + this.motherboard.cost);
        if (this.cpu.model != null) System.out.println("CPU: " + this.cpu.model);
        if (this.hdd.model != null) System.out.println("HDD " + this.hdd.model /*+ " \n type: " + this.hdd.type*/);
        if (this.ram.model != null) System.out.println("RAM: " + this.ram.model);

    }





}
