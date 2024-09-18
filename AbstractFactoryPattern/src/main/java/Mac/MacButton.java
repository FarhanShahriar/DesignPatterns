package Mac;

import Interfaces.Button;

public class MacButton implements Button {
    @Override
    public void pressed() {
        System.out.println("mac button pressed!");
    }
}
