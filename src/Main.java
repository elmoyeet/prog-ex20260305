public class Main  {
    public static void main(String[] args) {

        CentroFP centroFP = new CentroFP(10);

        Alumno alumno1 = new Alumno(1, "Mario", "DAM", 19);
        Alumno alumno2 = new Alumno(2, "Papu", "DAM", 18);
        Alumno alumno3 = new Alumno(3, "Victor", "DAM", 19);

        System.out.println(centroFP.registrarAlumno(alumno1));
        System.out.println(centroFP.registrarAlumno(alumno2));
        System.out.println(centroFP.registrarAlumno(alumno3));

        System.out.println(centroFP.mostrarAlumnos());

        System.out.println(centroFP.contarAlumnos());

        System.out.println(centroFP.buscarAlumno(1));
        System.out.println(centroFP.buscarAlumno(4));
    }
}