package u_21_builder_design_pattern;

public class Client {
    public static void main(String[] args) {
        // Gaming Computer
        ComputerBuilder gamingBuilder = new GamingComputerBuilder();
        ComputerDirector director1 = new ComputerDirector(gamingBuilder);
        Computer gamingPC = director1.constructComputer();
        System.out.println("Gaming PC: " + gamingPC);

        // Normal Computer
        ComputerBuilder normalBuilder = new NormalComputerBuilder();
        ComputerDirector director2 = new ComputerDirector(normalBuilder);
        Computer normalPC = director2.constructComputer();
        System.out.println("Normal PC: " + normalPC);
    }
}
