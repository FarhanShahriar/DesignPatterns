import Actions.*;
import Jobs.AC;
import Jobs.GarageDoor;
import Jobs.Light;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Invoker invoker = new Invoker();
        Thread thread = new Thread(invoker);
        thread.start();

        Light light = new Light();
        AC ac = new AC();
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        ACTurnOnCommand acTurnOnCommand = new ACTurnOnCommand(ac);
        ACTurnOffCommand acTurnOffCommand = new ACTurnOffCommand(ac);
        ACTemperatureSetCommand temperatureSetCommand = new ACTemperatureSetCommand(ac);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        invoker.setCommand(lightOnCommand);
        invoker.setCommand(acTurnOnCommand);
        invoker.setCommand(garageDoorOpenCommand);
        invoker.setCommand(garageDoorCloseCommand);
        temperatureSetCommand.setTemp(23);
        invoker.setCommand(temperatureSetCommand);
        invoker.setCommand(acTurnOffCommand);
        invoker.setCommand(lightOffCommand);
        invoker.stopInvoking();
        thread.join();
    }
}
