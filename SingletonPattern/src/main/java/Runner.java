public class Runner {
    public static void main(String[] args) {
        new TestClassA().test();
        new TestClassB().test();
        new TestClassC().test();
        new TestClassD().test();
        MyLogger logger = MyLogger.getLogger();
        logger.info("farhan");
        logger.warn("farhan");
        logger.error("farhan");
    }
}
