package entities;

public class Form extends Sensor {
    private String formName;

    public Form(String formName, Double sensorTemperature) {
        super(sensorTemperature);
        this.formName = formName;
    }

    public String getFormName() {
        return formName;
    }
    public void setFormName(String formName) {
        this.formName = formName;
    }

    public static void formReader() {
        Sensor.dataRead();
    }
}
