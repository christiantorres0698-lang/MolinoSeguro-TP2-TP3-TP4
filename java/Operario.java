public class Operario extends Persona {

    private String legajo;

    public Operario(int id, String nombre, String apellido, String legajo) {
        super(id, nombre, apellido);
        this.legajo = legajo;
    }

    public String getLegajo() {
        return legajo;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Operario: " + getNombre() + " " + getApellido()
                + " - Legajo: " + legajo);
    }
}