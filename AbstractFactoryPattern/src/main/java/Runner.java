import Interfaces.Button;
import Interfaces.CheckBox;
import Interfaces.Platform;
import Interfaces.TextBox;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        UIFactory factory = new UIFactory();
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("please choose a platform type!");
            System.out.println("1. windows\n" +
                               "2. mac");
            Scanner sc = new Scanner(System.in);
            System.out.print("press the number of your platform type: ");
            int platformType;
            try {
                platformType = sc.nextInt();
            } catch (Exception e) {
                System.out.println("must be a number between 1 & 2");
                System.out.println("=======================================================");
                Thread.sleep(3000L);
                continue;
            }
            Platform platform = factory.createPlatform(platformType);
            if (platform != null) {
                Button button = platform.createButton();
                CheckBox checkBox = platform.createCheckBox();
                TextBox textBox = platform.createTextBox();

                button.pressed();
                checkBox.pressed();
                textBox.write("farhan");
            }
            else System.out.println("you did not choose the correct platform Type");
            System.out.println("=======================================================");
            Thread.sleep(3000L);
        }
        System.out.println("!!!!thanks for using the program!!!!");
    }
}
