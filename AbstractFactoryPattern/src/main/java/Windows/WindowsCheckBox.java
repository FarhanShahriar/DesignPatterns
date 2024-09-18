package Windows;

import Interfaces.CheckBox;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void pressed() {
        System.out.println("windows checkbox pressed");
    }
}
