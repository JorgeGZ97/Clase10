
package com.mycompany.tareaclase4;


import java.sql.*;

public class Conexion {

    Connection con;

    public Conexion() {
        try {
            //1. Crear conexion
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/loginusuarios1", "root", "");

            System.out.println("Conexión correcta");
        } catch (Exception e) {
            System.out.println("No se pudo conectar a la base de datos " + e);
        }
    }

    public Connection getConnection() {
        return con;
    }
}
