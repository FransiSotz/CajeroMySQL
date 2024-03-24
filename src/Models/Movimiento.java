package Models;

import java.util.Date;

/**
 *
 * @author fransi.sotz
 */
public class Movimiento {
    private String idTarjeta;
    private Date fecha;
    private String Concepto;
    private Double Cantidad;

    public Movimiento() {
    }

    public Movimiento(String idTarjeta, Date fecha, String Concepto, Double Cantidad) {
        this.idTarjeta = idTarjeta;
        this.fecha = fecha;
        this.Concepto = Concepto;
        this.Cantidad = Cantidad;
    }

    public Double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Double Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(String idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return Concepto;
    }

    public void setConcepto(String Concepto) {
        this.Concepto = Concepto;
    }
}
