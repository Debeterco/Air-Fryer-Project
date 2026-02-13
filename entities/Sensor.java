package entities;

public class Sensor {
    private Double sensorTemperature;

    public Sensor(Double sensorTemperature) {
        this.sensorTemperature = sensorTemperature;
    }

    public Double getSensorTemperature() {
        return sensorTemperature;
    }
    public void setSensorTemperature(Double sensorTemperature) {
        this.sensorTemperature = sensorTemperature;
    }
    
    public static void dataRead() {
        Double sensorRead = sensorTemperature;
    }
}
