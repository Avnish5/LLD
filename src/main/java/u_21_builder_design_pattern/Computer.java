package u_21_builder_design_pattern;

public class Computer {
    private final String cpu;
    private final int ram;
    private final int ssd;
    private final boolean graphicsCard;
    private final String os;

    // Constructor accepts a builder
    public Computer(ComputerBuilder builder) {
        this.cpu = builder.getCpu();
        this.ram = builder.getRam();
        this.ssd = builder.getSsd();
        this.graphicsCard = builder.hasGraphicsCard();
        this.os = builder.getOs();
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + cpu +
                ", RAM=" + ram + "GB" +
                ", SSD=" + ssd + "GB" +
                ", Graphics Card=" + graphicsCard +
                ", OS=" + os + "]";
    }
}
