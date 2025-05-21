package r_18_composite_design_pattern.file_system_solution;

public class File implements  FileSystem{

    String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void ls() {
        System.out.println("File Name: " + fileName);
    }
}
