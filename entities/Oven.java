package entities;

import services.OperationMode;

public class Oven {
    private Double actualTemperature;
    private OperationMode activeMode;
    private boolean poweredOn;

    public Oven(boolean poweredOn, Double actualTemperature) {
        this.poweredOn = false;
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
                System.out.printf("Mode changed to: " + mode.getClass().getName());
            }
        } catch (Exception e) {
            System.out.println("Error: Oven not operating.");
        }
    }

    public void powerOn(){
        this.poweredOn = true;
    } 
}
