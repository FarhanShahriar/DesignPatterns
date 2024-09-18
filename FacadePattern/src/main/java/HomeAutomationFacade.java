public class HomeAutomationFacade {
    private final Lights lights;
    private final AC ac;
    private final HomeTheater homeTheater;

    public HomeAutomationFacade() {
        this.lights = new Lights();
        this.ac = new AC();
        this.homeTheater = new HomeTheater();
    }

    public void watchMovie() {
        System.out.println("watching movie");
        lights.turnOn();
        ac.turnOn();
        homeTheater.turnOn();
    }

    public void watchMovieInTheaterMode() {
        System.out.println("watching movie in theater mode");
        lights.turnOff();
        ac.turnOn();
        homeTheater.turnOn();
    }

    public void goToBed() {
        System.out.println("going to bed");
        lights.turnOff();
        ac.turnOff();
        homeTheater.turnOff();
    }
}
