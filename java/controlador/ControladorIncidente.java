package controlador;

import modelo.IncidenteDAO;

public class ControladorIncidente {

    private IncidenteDAO incidenteDAO;

    public ControladorIncidente() {

        incidenteDAO =
                new IncidenteDAO();
    }

    public void registrarIncidente(
            String descripcion,
            String gravedad,
            String estado) {

        incidenteDAO.insertarIncidente(
                descripcion,
                gravedad,
                estado);
    }

    public void mostrarIncidentes() {

        incidenteDAO.listarIncidentes();
    }

    public void cambiarEstadoIncidente(
            int id,
            String estado) {

        incidenteDAO.actualizarEstado(
                id,
                estado);
    }
}