public class MyLogger {

    private static MyLogger logger = null;

    private MyLogger() {
        System.out.println("new logger created");
    }

    public static MyLogger getLogger() {
        if (logger == null) logger = new MyLogger();
        else {
            System.out.println("returning singleton logger");
        }
        return logger;
    }

    public void info(String msg) {
        System.out.println("info log: " + msg);
    }

    public void error(String msg) {
        System.out.println("error log: " + msg);
    }

    public void warn(String msg) {
        System.out.println("warn log: " + msg);
    }
}
