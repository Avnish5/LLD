package u_21_builder_design_pattern;

public interface ComputerBuilder {

    ComputerBuilder buildCpu();
    ComputerBuilder buildRam();
    ComputerBuilder buildSsd();
    ComputerBuilder buildGraphicsCard();
    ComputerBuilder buildOs();
    Computer build(); // builds and returns the final product

    // Getters for Product constructor
    String getCpu();
    int getRam();
    int getSsd();
    boolean hasGraphicsCard();
    String getOs();
}
