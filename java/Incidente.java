public class Incidente {

    private int idIncidente;
    private String descripcion;
    private String gravedad;
    private String estado;

    public Incidente(int idIncidente, String descripcion, String gravedad, String estado) {
        this.idIncidente = idIncidente;
        this.descripcion = descripcion;
        this.gravedad = gravedad;
        this.estado = estado;
    }

    public int getIdIncidente() {
        return idIncidente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getGravedad() {
        return gravedad;
    }

    public String getEstado() {
        return estado;
    }

    public void mostrarIncidente() {
        System.out.println("Incidente #" + idIncidente);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Gravedad: " + gravedad);
        System.out.println("Estado: " + estado);
    }
}