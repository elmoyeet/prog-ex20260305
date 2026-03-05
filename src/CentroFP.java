public class CentroFP {

    private Alumno[] alumnos;
    private final int MAX_ALUMNOS;

    public CentroFP(int max_alumnos) {
        MAX_ALUMNOS = max_alumnos;
        alumnos = new Alumno[MAX_ALUMNOS];
    }

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

    private boolean arrayCompleto() {

        for (int i = 0; i < MAX_ALUMNOS; i++) {
            if  (alumnos[i] == null) {
                return false;
            }


        }
        return true;
    }

    private boolean comprobarIdUnica(int id) {

        for (int i = 0; i < MAX_ALUMNOS; i++) {
            if (alumnos[i] != null && alumnos[i].getId() == id) {
                return false;
            }
        }
        return true;
    }

    public boolean registrarAlumno(Alumno alumno) {

        if (comprobarIdUnica(alumno.getId()) && !arrayCompleto()) {
            alumnos[buscarPrimerHuecoLibre()] = alumno;
            return true;
        } else {
            return false;
        }

    }

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
