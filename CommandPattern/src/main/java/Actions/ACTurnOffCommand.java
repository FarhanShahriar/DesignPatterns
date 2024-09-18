package Actions;

import Jobs.AC;

public class ACTurnOffCommand implements Command {
    private final AC ac;

    public ACTurnOffCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOff();
    }
}
