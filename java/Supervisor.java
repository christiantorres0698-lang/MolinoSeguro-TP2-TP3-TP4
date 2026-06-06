public class Supervisor extends Persona {

    public Supervisor(int id, String nombre, String apellido) {
        super(id, nombre, apellido);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Supervisor: "
                + getNombre() + " "
                + getApellido());
    }
}