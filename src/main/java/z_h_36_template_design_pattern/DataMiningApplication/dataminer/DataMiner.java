package z_h_36_template_design_pattern.DataMiningApplication.dataminer;

public  abstract class DataMiner {

    public final void mine(String filePath) {
        openFile(filePath);
        extractData();
        parseData();
        analyzeData();
        sendReport();
        hook();
        closeFile();
    }

    protected abstract void openFile(String path);
    protected abstract void extractData();
    protected abstract void parseData();
    protected abstract void closeFile();

    protected void analyzeData() {
        System.out.println("Analyzing data...");
    }

    protected void sendReport() {
        System.out.println("Sending report...");
    }

    // Hook method
    protected void hook() {
        // Optional extension point
    }
}
