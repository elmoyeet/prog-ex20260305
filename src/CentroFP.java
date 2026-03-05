public class CentroFP {

    private Alumno[] alumnos;
    private final int MAX_ALUMNOS;

    public CentroFP(int max_alumnos) {
        MAX_ALUMNOS = max_alumnos;
        alumnos = new Alumno[MAX_ALUMNOS];
    }

    /**
     * Busca un alumno con el identificador recibido
     * @param id Recibe el id del alumno
     * @return devuelve el alumno
     */
    public Alumno buscarAlumno(int id) {

        for (int i = 0; i < MAX_ALUMNOS; i++) {
            if (alumnos[i] != null) {
                if (alumnos[i].getId() == id) {
                    return alumnos[i];
                }
            }
        }
        return null;
    }

    /**
     * Busca la primera posición libre dentro del array
     * @return devuelve el indice de la primera posición libre
     */
    private int buscarPrimerHuecoLibre() {
        boolean seguirBuscando = true;
        int primerHuecoLibre = -1;

        for (int i = 0; i < MAX_ALUMNOS && seguirBuscando; i++) {
            if  (alumnos[i] == null) {
                seguirBuscando = false;
                primerHuecoLibre = i;
            }

        }
        return primerHuecoLibre;
    }

    /**
     * Comprueba si el array esta completo
     * @return devuelve false si no esta completo y true si lo está
     */
    private boolean arrayCompleto() {

        for (int i = 0; i < MAX_ALUMNOS; i++) {
            if  (alumnos[i] == null) {
                return false;
            }


        }
        return true;
    }

    /**
     * Comprueba que no existe ningun alumno con la id recibida
     * @param id Recibe la id del alumno
     * @return devuelve false si la id del alumno ya existe y true si no existe
     */
    private boolean comprobarIdUnica(int id) {

        for (int i = 0; i < MAX_ALUMNOS; i++) {
            if (alumnos[i] != null && alumnos[i].getId() == id) {
                return false;
            }
        }
        return true;
    }

    /**
     * Añade un alumno al array
     * @param alumno Recibe el alumno
     * @return devuelve true si lo ha añadido correctamente y false si no se ha podido agregar
     */
    public boolean registrarAlumno(Alumno alumno) {

        if (comprobarIdUnica(alumno.getId()) && !arrayCompleto()) {
            alumnos[buscarPrimerHuecoLibre()] = alumno;
            return true;
        } else {
            return false;
        }

    }

    /**
     * Recorre el array y muestra por pantalla todos los alumnos almacenados
     * @return devuelve la lista de alumnos completa
     */
    public String mostrarAlumnos() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < MAX_ALUMNOS; i++) {
            if (alumnos[i] != null) {
                sb.append(alumnos[i].toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    /**
     * Cuenta el numero total de alumnos que hay en el array
     * @return devuelve el numero de alumnos total como número entero
     */
    public int contarAlumnos() {
        int contador = 0;

        for (int i = 0; i < MAX_ALUMNOS; i++) {
            if (alumnos[i] != null) {
                contador++;
            }
        }
        return contador;
    }

}
