package domain;

import domain.inscripciones.Alumno;
import domain.inscripciones.Inscripcion;
import domain.inscripciones.Materia;
import org.junit.Before;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class BaseTest {
    protected List<Materia> materiasInscripcion1;
    protected List<Materia> materiasInscripcion2;
    protected List<Materia> materiasApAlumno;
    protected List<Materia> correlativasOperativos;
    protected List<Materia> correlativasParadigmas;
    protected List<Materia> listaVacia;
    protected Alumno santiago;
    protected Materia paradigmas;
    protected Materia operativos;
    protected Inscripcion inscripcion1;
    protected Inscripcion inscripcion2;

    protected BaseTest() {
        this.materiasInscripcion1 = new ArrayList<>();
        this.materiasInscripcion2 = new ArrayList<>();
        this.materiasApAlumno = new ArrayList<>();
        this.correlativasOperativos = new ArrayList<>();
        this.correlativasParadigmas = new ArrayList<>();
        this.listaVacia = new ArrayList<>();
    }

    @Before
    public void inicializar() {
        this.inicializarCorrelativasOperativos();
        this.inicializarCorrelativasParadigmas();
        this.inicializarMateriasInscripcion1();
        this.inicializarMateriasInscripcion2();
        this.materiasApAlumno = correlativasParadigmas;
        this.santiago =  new Alumno("2090818", "Santiago", materiasApAlumno);
        this.paradigmas = new Materia("Paradigmas De Programacion", correlativasParadigmas);
        this.operativos = new Materia("Sistemas Operativos", correlativasOperativos);
        this.inscripcion1 = new Inscripcion(santiago, materiasInscripcion1);
        this.inscripcion2 = new Inscripcion(santiago, materiasInscripcion2);
    }

    private void inicializarCorrelativasOperativos(){
        Materia[] correlativasOperativos = {
                new Materia("Arquitectura de Computadores", listaVacia)
        };
        Collections.addAll(this.correlativasOperativos, correlativasOperativos);
    }

    private void inicializarCorrelativasParadigmas(){
        Materia[] correlativasParadigmas = {
                new Materia("Algoritmos y Estructuras de Datos", listaVacia),
                new Materia("Matematica Discreta", listaVacia)
        };
        Collections.addAll(this.correlativasParadigmas, correlativasParadigmas);
    }

    private void inicializarMateriasInscripcion1() {
        Materia[] materiasInscripcion1 = {
                new Materia("Sistemas Operativos", correlativasOperativos),
                new Materia("Paradigmas", correlativasParadigmas)
        };
        Collections.addAll(this.materiasInscripcion1, materiasInscripcion1);
    }

    private void inicializarMateriasInscripcion2() {
        Materia[] materiasInscripcion2 = {
                new Materia("Paradigmas", correlativasParadigmas)
        };
        Collections.addAll(this.materiasInscripcion2, materiasInscripcion2);
    }
}
