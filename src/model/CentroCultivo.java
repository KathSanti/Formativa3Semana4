package model;

public class CentroCultivo {

    private String centroCultivo;
    private String comuna;
    private double tonelada;

    public CentroCultivo() {

    }

    public CentroCultivo (String centroCultivo, String comuna, double tonelada) {
        this.centroCultivo = centroCultivo;
        this.comuna = comuna;
        this.tonelada = tonelada;
    }

    public String getCentroCultivo() {
        return centroCultivo;
    }

    public void setCentroCultivo(String centroCultivo) {
        this.centroCultivo = centroCultivo;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public double getTonelada() {
        return tonelada;
    }

    public void setTonelada(double tonelada) {
        this.tonelada = tonelada;
    }

    @Override
    public String toString() {
        return String.format("Centro: %-20s | Comuna: %-15s | Toneladas: %.1f",
                centroCultivo, comuna, tonelada);
    }
}
