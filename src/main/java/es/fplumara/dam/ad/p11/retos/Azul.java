package es.fplumara.dam.ad.p11.retos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Azul {

    public static int actualizarStock(Connection conexion, int id, int stock) throws SQLException {
        String sql = "UPDATE videojuego SET stock = ? WHERE id = ?";
        try (PreparedStatement sentencia = conexion.prepareStatement(sql)){
            sentencia.setInt(1, stock);
            sentencia.setInt(2, id);
            return sentencia.executeUpdate();
        }
    }
}
