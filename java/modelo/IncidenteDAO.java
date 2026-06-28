package modelo;

import conexion.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class IncidenteDAO {

    public void insertarIncidente(
            String descripcion,
            String gravedad,
            String estado) {

        String sql =
                "INSERT INTO incidentes_ap4(descripcion, gravedad, estado) VALUES (?, ?, ?)";

        try (
                Connection conexion = ConexionBD.conectar();
                PreparedStatement ps = conexion.prepareStatement(sql)
        ) {

            ps.setString(1, descripcion);
            ps.setString(2, gravedad);
            ps.setString(3, estado);

            ps.executeUpdate();

            System.out.println("Incidente guardado correctamente");

        } catch (Exception e) {

            System.out.println("Error al guardar incidente: " + e.getMessage());
        }
    }

    public void listarIncidentes() {

        String sql = "SELECT * FROM incidentes_ap4";

        ArrayList<String> listaIncidentes = new ArrayList<>();

        try (
                Connection conexion = ConexionBD.conectar();
                Statement st = conexion.createStatement();
                ResultSet rs = st.executeQuery(sql)
        ) {

            while (rs.next()) {

                String incidente =
                        rs.getInt("id") + " - "
                                + rs.getString("descripcion") + " - "
                                + rs.getString("gravedad") + " - "
                                + rs.getString("estado");

                listaIncidentes.add(incidente);
            }

            System.out.println("\n===== LISTADO DE INCIDENTES =====");

            for (String incidente : listaIncidentes) {
                System.out.println(incidente);
            }

        } catch (Exception e) {

            System.out.println("Error al consultar: " + e.getMessage());
        }
    }

    public void actualizarEstado(
            int id,
            String estado) {

        String sql =
                "UPDATE incidentes_ap4 SET estado=? WHERE id=?";

        try (
                Connection conexion = ConexionBD.conectar();
                PreparedStatement ps = conexion.prepareStatement(sql)
        ) {

            ps.setString(1, estado);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Estado actualizado correctamente.");

        } catch (Exception e) {

            System.out.println("Error al actualizar: " + e.getMessage());
        }
    }
}