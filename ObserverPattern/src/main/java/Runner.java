public class Runner {
    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.subscribe("farhan", new EmailService("farhan"));
        stock.subscribe("sakib", new WebDashboard("sakib"));
        stock.subscribe("hrdoy", new MobileApp("hridoy"));
        stock.sendNotification(101);
        stock.sendNotification(102);
        stock.unsubscribe("sakib");
        stock.sendNotification(104);
        stock.sendNotification(99);
    }
}
