package entities;

import services.OperationMode;

public class Oven {
    private Double actualTemperature;
    private OperationMode activeMode;
    private boolean poweredOn;

    public Oven(boolean poweredOn, Double actualTemperature) {
        this.poweredOn = true;
        this.actualTemperature = 25.0;
    }

    public OperationMode getActiveMode() {
        return activeMode;
    }

    public Double getActualTemperature() {
        return actualTemperature;
    }
    public void setActualTemperature(Double actualTemperature) {
        this.actualTemperature = actualTemperature;
    }

    public void setMode(OperationMode mode){
        try {
            if(poweredOn) {
                this.activeMode = mode;
                System.out.println("Mode changed to: " + mode.getClass().getSimpleName());
            }
        } catch (Exception e) {
            System.out.println("Error: Oven not operating.");
        }
    }

    public void startCooking() {
        if (!poweredOn) {
            System.out.println("Error: The oven is off.");
            return;
        }
        else if (activeMode == null) {
            System.out.println("Error: Select a mode (Grill, Skewer or Form) before start.");
            return;
        }
        else {
            System.out.println("Initializing heater...");
            activeMode.execute(); 
        }
        
    }
}
