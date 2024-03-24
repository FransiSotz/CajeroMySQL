package Models;

/**
 *
 * @author Fransi
 */
public class Servicios {
    private String servicio;
    private double valor;

    public Servicios() {
    }

    public Servicios(String servicio, double valor) {
        this.servicio = servicio;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
}
