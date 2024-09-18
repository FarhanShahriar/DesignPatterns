package Actions;

import Jobs.AC;

public class ACTemperatureSetCommand implements Command {
    private final AC ac;
    private int temp;

    public ACTemperatureSetCommand(AC ac) {
        this.ac = ac;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public void execute() {
        ac.setTemperature(temp);
    }
}
