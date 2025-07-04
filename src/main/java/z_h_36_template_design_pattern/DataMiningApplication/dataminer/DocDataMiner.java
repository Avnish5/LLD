package z_h_36_template_design_pattern.DataMiningApplication.dataminer;

public class DocDataMiner extends DataMiner{

    @Override
    protected void openFile(String path) {
        System.out.println("Opening DOC file: " + path);
    }

    @Override
    protected void extractData() {
        System.out.println("Extracting text from DOC document...");
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing DOC content...");
    }

    @Override
    protected void closeFile() {
        System.out.println("Closing DOC file.");
    }
}
