package src.entities;

public class Thermometer {
    public static String getMeatPoint(double temp) {
        if (temp < 50) return "AQUECENDO";
        if (temp < 55) return "SELADA (Rare)";
        if (temp < 65) return "AO PONTO (Medium)";
        if (temp >= 75) return "BEM PASSADA (Well Done)";
        return "COZINHANDO";
    }
}