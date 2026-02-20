package src.entities;
import services.OperationMode;

public class Oven {
    private boolean poweredOn;
    private double currentTemp;
    private int timerSeconds;
    private OperationMode activeMode;
    
    // Componentes de Hardware simulados
    private boolean fanActive = false;
    private boolean ssrRelayActive = false;

    public void startCooking(double targetTemp, int minutes) {
        if (!poweredOn) return;

        // 1. Sequência de Segurança: Ligar Ventoinha primeiro
        this.fanActive = true; 
        System.out.println("[ESP32] Acionando Motor de Pólo Sombreado (3000 RPM)...");
        
        // 2. Ativar modo mecânico (Grill/Skewer)
        if (activeMode != null) activeMode.execute();

        // 3. Loop de Aquecimento (Simulação do Sensor NTC + SSR)
        this.timerSeconds = minutes * 60;
        System.out.println("[ESP32] SSR-25DA Controlando Resistência NiCr...");
        
        while (currentTemp < targetTemp) {
            currentTemp += 5.5; // Simulação de aquecimento rápido
            checkSafety();
            System.out.printf("Sensor NTC: %.1f°C | Timer: %ds%n", currentTemp, timerSeconds);
        }
    }

    private void checkSafety() {
        if (currentTemp > 240) {
            System.out.println("!!! FUSÍVEL TÉRMICO ROMPIDO - SUPERAQUECIMENTO !!!");
            this.poweredOn = false;
        }
    }
    
    // Getters e Setters para o Main usar
    public void setPoweredOn(boolean status) { this.poweredOn = status; }
    public void setMode(OperationMode mode) { this.activeMode = mode; }
}