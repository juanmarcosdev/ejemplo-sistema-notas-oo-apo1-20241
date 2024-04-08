package model;
import model.*;

public class Controladora {
    private Estudiante[] estudiantes;

    public Controladora() {
        this.estudiantes = new Estudiante[29];
    }

    public Profesor crearProfesor(String nombre, int edad, String cedula) {
    	Profesor profesor = new Profesor(nombre, edad, cedula);
    	return profesor;
    }

    public Curso crearCurso(String nombreCurso, int creditos, String facultad, Profesor profesor) {
    	Curso curso = new Curso(nombreCurso, creditos, facultad, profesor);
    	return curso;
    }

    public Semestre crearSemestre(String nombrePeriodo) {
    	Semestre semestre = new Semestre(nombrePeriodo);
    	return semestre;
    }

    public void asociarCursoConSemestre(Curso curso, Semestre semestre) {
    	semestre.agregarCurso(curso);
    }

    public Estudiante crearEstudiante(String nombre, int edad, String codigoEstudiante) {
    	Estudiante estudiante = new Estudiante(nombre, edad, codigoEstudiante);
    	return estudiante;
    }

    public void asociarSemestreConEstudiante(Estudiante estudiante, Semestre semestre) {
    	estudiante.agregarSemestre(semestre);
    }

}