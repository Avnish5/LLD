package z_h_36_template_design_pattern.DataMiningApplication.dataminer;

public class PdfDataMiner extends DataMiner{
    @Override
    protected void openFile(String path) {
        System.out.println("Opening PDF file: " + path);
    }

    @Override
    protected void extractData() {
        System.out.println("Extracting text from PDF document...");
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing PDF content...");
    }

    @Override
    protected void closeFile() {
        System.out.println("Closing PDF file.");
    }

    @Override
    protected void hook() {
        System.out.println("Logging PDF-specific metrics...");
    }
}
