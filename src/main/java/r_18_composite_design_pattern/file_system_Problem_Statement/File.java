package r_18_composite_design_pattern.file_system_Problem_Statement;

public class File {

    String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public void ls() {
        System.out.println("File Name: " + fileName);
    }
}
