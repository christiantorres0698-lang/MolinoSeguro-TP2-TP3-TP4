package vista;

import controlador.ControladorIncidente;

public class VistaConsola {

    private ControladorIncidente controlador;

    public VistaConsola() {

        controlador =
                new ControladorIncidente();
    }

    public void ejecutarDemo() {

        System.out.println(
                "=== SISTEMA MOLINOSEGURO ===\n");

        // ARREGLO
        String[] nivelesGravedad = {
                "Baja",
                "Media",
                "Alta",
                "Crítica"
        };

        System.out.println(
                "Niveles de gravedad:");

        for (String nivel : nivelesGravedad) {

            System.out.println(
                    "- " + nivel);
        }

        System.out.println();

        controlador.registrarIncidente(
                "Temperatura elevada en molino",
                "Media",
                "Pendiente"
        );

        System.out.println();

        controlador.cambiarEstadoIncidente(
                1,
                "Resuelto"
        );

        System.out.println();

        controlador.mostrarIncidentes();
    }
}