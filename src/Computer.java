public class Computer {
    String model;
    double costComp;

    HDD hdd;
    RAM ram;
    CPU cpu;
    Motherboard motherboard;



    /*public Computer(String modelComp, Motherboard motherboard, HDD hdd, RAM ram, CPU cpu, double costComp) {
        this.model = modelComp;
        this.motherboard = new Motherboard("ASUS Prime H510M-K", "mATX", 300.25d);
        this.hdd = new HDD("WD Blue 2TB WD20EZBX", 2000, "internal", 85.3d);
        this.ram = new RAM("Kingston FURY Beast 2x8GB", 16, 95.7d);
        this.cpu = new CPU("AMD Ryzen 5 5600X ", 175.25d);
        this.costComp = costComp + this.motherboard.cost + this.hdd.cost + this.ram.cost + this.cpu.cost;
    }*/
    public Computer(String modelComp, double costComp) {
        this.model = modelComp;
        this.motherboard = new Motherboard("ASUS Prime H510M-K", "mATX", 300.25d);
        this.hdd = new HDD("WD Blue 2TB WD20EZBX", 2000, "internal", 85.3d);
        this.ram = new RAM("Kingston FURY Beast 2x8GB", 16, 95.7d);
        this.cpu = new CPU("AMD Ryzen 5 5600X ", 175.25d);
        this.costComp = costComp + this.motherboard.cost + this.hdd.cost + this.ram.cost + this.cpu.cost;
    }

    public Computer(String modelComp, Motherboard motherboard, HDD hdd, RAM ram, CPU cpu) {
        this.model = modelComp;
        this.motherboard = motherboard;
        this.hdd = hdd;
        this.ram = ram;
        this.cpu = cpu;
        this.costComp = costComp + this.motherboard.cost + this.hdd.cost + this.ram.cost + this.cpu.cost;
    }

/*    public double getCostComputer() {
        double cost = motherboard.cost + cpu.cost + hdd.cost + ram.cost;
        return cost;
    }*/

    public void getInfoComputer() {
        System.out.println("Компьютер: " + this.model);
        System.out.println("Стоимость: " + this.costComp);
        System.out.println("                 Параметры:");
        if (this.motherboard != null) {this.motherboard.getinfoMotherboard();}
        if (this.cpu != null) {this.cpu.getInfoCPU();}
        if (this.hdd != null)  {this.hdd.getInfoHdd();}
        if (this.ram != null)  {this.ram.getInfoRam();}

    }





}
