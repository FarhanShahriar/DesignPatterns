public class Runner {
    public static void main(String[] args) {
        HomeAutomationFacade facade = new HomeAutomationFacade();

        facade.watchMovie();
        System.out.println("============================");
        facade.watchMovieInTheaterMode();
        System.out.println("============================");
        facade.goToBed();
    }
}
