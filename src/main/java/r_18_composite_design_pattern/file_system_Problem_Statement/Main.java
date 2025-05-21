package r_18_composite_design_pattern.file_system_Problem_Statement;

public class Main {

    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movie");

        File file = new File("Border");
        movieDirectory.add(file);

        Directory comedyDirectory = new Directory("ComedyMovie");
        File golmaal = new File("Golmaal");
        comedyDirectory.add(golmaal);

        movieDirectory.add(comedyDirectory);

        movieDirectory.ls();


    }

}
