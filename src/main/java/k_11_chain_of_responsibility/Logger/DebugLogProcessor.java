package k_11_chain_of_responsibility.Logger;

public class DebugLogProcessor extends LogProcessor{

    DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String msg) {
        if (logLevel == DEBUG) {
            System.out.println("DEBUG: " + msg);
        } else {
            super.log(logLevel, msg);
        }
    }
}
