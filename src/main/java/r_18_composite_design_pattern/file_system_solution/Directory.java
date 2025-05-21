package r_18_composite_design_pattern.file_system_solution;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    String directoryName;
    List<FileSystem> files;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        files = new ArrayList<>();
    }

    public void add(FileSystem file) {
        files.add(file);
    }

    @Override
    public void ls() {
        System.out.println("Directory Name: " + directoryName);

        for (FileSystem file : files) {
            file.ls();
        }
    }
}
