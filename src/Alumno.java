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

    /**
     * Getter de ID
     * @return devuelve la id del alumno
     */
    public int getId() {
        return id;
    }

    /**
     * Getter de nombre
     * @return devuelve el nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getter de titulo
     * @return devuelve el titulo del alumno
     */
    public String getTituloFP() {
        return tituloFP;
    }

    /**
     * Getter de edad
     * @return devuelve la edad del alumno
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Ayuda a generar toda la información del alumno en un mismo string
     * @return devuelve un string con los datos del alumno
     */
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
