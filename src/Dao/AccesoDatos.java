package Dao;

import Conexion.Conexion;
import Models.Cuenta;
import Models.Movimiento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author fransi.sotz
 */
public class AccesoDatos {

    String respuestaExitosa;

    public Cuenta ValidaCuenta(String Tarjeta, String Pin) {
        Cuenta cuenta = new Cuenta();
        try {
            Conexion conectar = new Conexion();
            Connection miConexion = conectar.conexion();
            String instruccionSql = "select idTarjeta,Cliente, pin from cuenta where idTarjeta = ? and pin = ?";
            PreparedStatement ps = miConexion.prepareStatement(instruccionSql);
            ps.setString(1, Tarjeta); // cuando la consulta lleva parametros
            ps.setString(2, Pin);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cuenta.setTarjeta(rs.getString("idTarjeta"));
                cuenta.setCliente(rs.getString("Cliente"));
                cuenta.setPin(rs.getString("pin"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + " Error en Lectura Cuenta Login");
        }
        return cuenta;
    }

    public Cuenta buscaCuenta(String tarjeta) {
        Cuenta cuenta = new Cuenta();
        try {
            Conexion conectar = new Conexion();
            Connection miConexion = conectar.conexion();
            String instruccionSql = "select idTarjeta, Cliente, Pin, Saldo from cuenta where idTarjeta = ?";
            PreparedStatement ps = miConexion.prepareStatement(instruccionSql);
            ps.setString(1, tarjeta); // cuando la consulta lleva parametros
            ResultSet miResultSet = ps.executeQuery();
            while (miResultSet.next()) {
                cuenta.setTarjeta(miResultSet.getString("idTarjeta"));
                cuenta.setCliente(miResultSet.getString("Cliente"));
                cuenta.setPin(miResultSet.getString("Pin"));
                cuenta.setSaldo(miResultSet.getDouble("Saldo"));
            }
        } catch (Exception e) {
            System.out.println("Fallo en el Try");
        }
        return cuenta;
    }

    public ArrayList<Movimiento> Movimientos(String tarjeta) {
        ArrayList listaCuentas = new ArrayList();
        Movimiento movimiento;
        try {
            Conexion conectar = new Conexion();
            Connection miConexion = conectar.conexion();
            String instruccionSql = "select idTarjeta, fecha, Concepto, Cantidad from Movimiento where idTarjeta = ?";
            PreparedStatement ps = miConexion.prepareStatement(instruccionSql);
            ps.setString(1, tarjeta); // cuando la consulta lleva parametros
            ResultSet miResultSet = ps.executeQuery();
            while (miResultSet.next()) {
                movimiento = new Movimiento();
                movimiento.setIdTarjeta(miResultSet.getString("idTarjeta"));
                movimiento.setFecha(miResultSet.getDate("fecha"));
                movimiento.setConcepto(miResultSet.getString("Concepto"));
                movimiento.setCantidad(miResultSet.getDouble("Cantidad"));
                listaCuentas.add(movimiento);
            }
        } catch (Exception e) {
            System.out.println("Fallo en el Try");
        }
        return listaCuentas;
    }

    public String registrarMovimiento(Movimiento movimiento) {
        try {
            Conexion conectar = new Conexion();
            Connection miConexion = conectar.conexion();
            String instruccionSql = "insert into Movimiento (idTarjeta, Concepto, Cantidad) values (?,?,?)";
            PreparedStatement ps = miConexion.prepareStatement(instruccionSql);
            ps.setString(1, movimiento.getIdTarjeta());
            ps.setString(2, movimiento.getConcepto());
            ps.setDouble(3, movimiento.getCantidad());
            ps.executeUpdate();
            respuestaExitosa = "Transacción Realizada correctamente..!!";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            respuestaExitosa = "Error en la Transacción!!";
        }
        return respuestaExitosa;
    }
}
