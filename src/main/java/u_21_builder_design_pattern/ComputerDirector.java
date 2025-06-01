package u_21_builder_design_pattern;

public class ComputerDirector {

    private final ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer constructComputer() {
        return builder.buildCpu()
                .buildRam()
                .buildSsd()
                .buildGraphicsCard()
                .buildOs()
                .build();
    }
}
