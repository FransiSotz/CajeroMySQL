package Models;

/**
 *
 * @author Fransi
 */
public class Cuenta {
    private String tarjeta;
    private String cliente;
    private String pin;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String tarjeta, String cliente, String pin, double saldo) {
        this.tarjeta = tarjeta;
        this.cliente = cliente;
        this.pin = pin;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "tarjeta=" + tarjeta + ", cliente=" + cliente + ", pin=" + pin + ", saldo=" + saldo + '}';
    }
}
