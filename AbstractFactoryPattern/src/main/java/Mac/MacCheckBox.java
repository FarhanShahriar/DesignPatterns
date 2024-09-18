package Mac;

import Interfaces.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void pressed() {
        System.out.println("mac checkbox pressed");
    }
}
