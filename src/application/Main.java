package application;

import java.util.Locale;

import entities.Oven;
import services.GrillMode;
import services.FormMode;
import services.SkewerMode;
import entities.DigitalDisplay;

public class Main {
    public static void main(String[] args) {
        System.out.printf("------------FRYMASTER------------%n");
        
        Oven oven = new Oven(false, 25.0);
        GrillMode grill = new GrillMode();
        DigitalDisplay display = new DigitalDisplay();

        display.showDisplay1();
        display.showDisplay2();
        System.out.println("---------------------------------");
    }
}
