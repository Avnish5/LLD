package k_11_chain_of_responsibility.Logger;

public class LogProcessor {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LogProcessor nextLogProcessor;

    LogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log (int logLevel, String msg) {

        if (nextLogProcessor != null) {
            nextLogProcessor.log(logLevel, msg);
        }
    }


}
