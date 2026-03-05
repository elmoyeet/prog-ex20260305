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
        int primerHuecoLibre = 0;

        for (int i = 0; i < MAX_ALUMNOS && seguirBuscando; i++) {
            if  (alumnos[i] == null) {
                seguirBuscando = false;
                primerHuecoLibre = i;
            }


        }
        return primerHuecoLibre;
    }




}
