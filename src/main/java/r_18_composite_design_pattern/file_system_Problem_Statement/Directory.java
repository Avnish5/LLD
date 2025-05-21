package r_18_composite_design_pattern.file_system_Problem_Statement;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    String directory;
    List<Object> objectList;

    public Directory(String directory) {
        this.directory = directory;
        objectList = new ArrayList<>();
    }

    public void add(Object obj) {
        objectList.add(obj);
    }

    public void ls() {
        System.out.println("Directory Name: " + directory);

        for (Object obj : objectList) {
            if (obj instanceof File) {
                ((File) obj).ls();
            } else {
                ((Directory) obj).ls();
            }
        }
    }
}
