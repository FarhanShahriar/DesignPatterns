package Actions;

import Jobs.AC;

public class ACTurnOnCommand implements Command {
    private final AC ac;

    public ACTurnOnCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOn();
    }
}
