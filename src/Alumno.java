public class Alumno {

    private int id;
    private String nombre;
    private String tituloFP;
    int edad;

    public Alumno(int id, String nombre, String tituloFP, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.tituloFP = tituloFP;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTituloFP() {
        return tituloFP;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        StringBuilder  sb = new StringBuilder("Alumno: {");

        sb.append("id: ").append(id);
        sb.append(", nombre: ").append(nombre);
        sb.append(", tituloFP: ").append(tituloFP);
        sb.append(", edad: ").append(edad);

        sb.append("}");

        return sb.toString();
    }
}
