package k_11_chain_of_responsibility.Logger;

public class InfoLogProcessor extends LogProcessor{

    InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String msg) {

        if (logLevel == INFO) {
            System.out.println("INFO: " + msg);
        } else {
            super.log(logLevel, msg);
        }
    }
}
