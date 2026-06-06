public class Reporte {

    private int idReporte;
    private String tipoReporte;
    private int cantidadIncidentes;

    public Reporte(int idReporte, String tipoReporte, int cantidadIncidentes) {
        this.idReporte = idReporte;
        this.tipoReporte = tipoReporte;
        this.cantidadIncidentes = cantidadIncidentes;
    }

    public void mostrarReporte() {
        System.out.println("Reporte #" + idReporte);
        System.out.println("Tipo de reporte: " + tipoReporte);
        System.out.println("Cantidad de incidentes registrados: " + cantidadIncidentes);
    }
}