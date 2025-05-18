package k_11_chain_of_responsibility.Logger;

public class ErrorLogProcessor extends LogProcessor{

    ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String msg) {
        if (logLevel == ERROR) {
            System.out.println("ERROR: " + msg);
        } else {
            super.log(logLevel, msg);
        }
    }
}
