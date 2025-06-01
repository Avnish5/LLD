package u_21_builder_design_pattern;

public class NormalComputerBuilder implements ComputerBuilder{
    private String cpu;
    private int ram;
    private int ssd;
    private boolean graphicsCard;
    private String os;

    public ComputerBuilder buildCpu() {
        this.cpu = "Intel Core i3";
        return this;
    }

    public ComputerBuilder buildRam() {
        this.ram = 8;
        return this;
    }

    public ComputerBuilder buildSsd() {
        this.ssd = 256;
        return this;
    }

    public ComputerBuilder buildGraphicsCard() {
        this.graphicsCard = false;
        return this;
    }

    public ComputerBuilder buildOs() {
        this.os = "Windows 10 Home";
        return this;
    }

    public Computer build() {
        return new Computer(this);
    }

    // Getters for Product to use
    public String getCpu() { return cpu; }
    public int getRam() { return ram; }
    public int getSsd() { return ssd; }
    public boolean hasGraphicsCard() { return graphicsCard; }
    public String getOs() { return os; }
}
