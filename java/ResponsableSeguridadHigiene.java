public class ResponsableSeguridadHigiene extends Persona {

    public ResponsableSeguridadHigiene(int id, String nombre, String apellido) {
        super(id, nombre, apellido);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Responsable de Seguridad e Higiene: "
                + getNombre() + " "
                + getApellido());
    }
}