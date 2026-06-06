import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Incidente> incidentes = new ArrayList<>();

        int opcion;
        int contadorIncidentes = 1;

        do {

            System.out.println("\n=== SISTEMA MOLINOSEGURO ===");
            System.out.println("1. Registrar incidente");
            System.out.println("2. Generar alerta");
            System.out.println("3. Listar incidentes");
            System.out.println("4. Buscar incidente por ID");
            System.out.println("5. Mostrar reporte");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("\nRegistro de incidente");

                    try {
                        System.out.print("Ingrese descripción: ");
                        String descripcion = teclado.nextLine();

                        if (descripcion.isEmpty()) {
                            throw new IncidenteException("La descripción no puede estar vacía.");
                        }

                        System.out.print("Ingrese gravedad (Baja/Media/Alta): ");
                        String gravedad = teclado.nextLine();

                        if (gravedad.isEmpty()) {
                            throw new IncidenteException("La gravedad no puede estar vacía.");
                        }

                        Incidente incidente = new Incidente(
                                contadorIncidentes,
                                descripcion,
                                gravedad,
                                "Pendiente"
                        );

                        incidentes.add(incidente);
                        contadorIncidentes++;

                        System.out.println("Incidente registrado correctamente.");
                        incidente.mostrarIncidente();

                    } catch (IncidenteException e) {
                        System.out.println("Error: " + e.getMessage());
                    }

                    break;

                case 2:
                    Alerta alerta = new Alerta(
                            1,
                            "Sector Molienda",
                            "Activa"
                    );

                    alerta.mostrarAlerta();
                    break;

                case 3:
                    System.out.println("\nListado de incidentes");

                    if (incidentes.isEmpty()) {
                        System.out.println("No hay incidentes registrados.");
                    } else {
                        for (Incidente incidente : incidentes) {
                            incidente.mostrarIncidente();
                            System.out.println("----------------------");
                        }
                    }

                    break;

                case 4:
                    System.out.print("\nIngrese ID del incidente a buscar: ");
                    int idBuscado = teclado.nextInt();
                    teclado.nextLine();

                    boolean encontrado = false;

                    for (Incidente incidente : incidentes) {
                        if (incidente.getIdIncidente() == idBuscado) {
                            System.out.println("Incidente encontrado:");
                            incidente.mostrarIncidente();
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No se encontró un incidente con ese ID.");
                    }

                    break;

                case 5:
                    Reporte reporte = new Reporte(
                            1,
                            "Reporte general de incidentes",
                            incidentes.size()
                    );

                    reporte.mostrarReporte();
                    break;

                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 6);

        teclado.close();
    }
}