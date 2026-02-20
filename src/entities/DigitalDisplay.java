public class DigitalDisplay {
    // Retorna uma lista de strings para o HTML renderizar
    public String[] getModes() {
        return new String[]{"GRILL", "SKEWER", "FORM"};
    }

    public String getStatusMessage() {
        return "Select temperature and timer";
    }
}