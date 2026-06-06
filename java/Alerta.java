public class Alerta {

    private int idAlerta;
    private String ubicacion;
    private String estado;

    public Alerta(int idAlerta, String ubicacion, String estado) {
        this.idAlerta = idAlerta;
        this.ubicacion = ubicacion;
        this.estado = estado;
    }

    public int getIdAlerta() {
        return idAlerta;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void mostrarAlerta() {
        System.out.println("Alerta #" + idAlerta);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Estado: " + estado);
    }
}