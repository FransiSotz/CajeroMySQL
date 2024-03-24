package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection conectar = null;
    public Connection conexion(){
        try {
            conectar = (Connection)
        DriverManager.getConnection("jdbc:mysql://localhost:3306/Cajero?zeroDateTimeBehavior=convertToNull&useTimezone=true&serverTimezone=UTC", "root", "M@n@g3rMySQLDB");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conectar;
    }
}
