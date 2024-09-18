package Windows;

import Interfaces.Button;

public class WindowsButton implements Button {
    @Override
    public void pressed() {
        System.out.println("windows button pressed!");
    }
}
