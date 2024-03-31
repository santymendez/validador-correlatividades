package domain.inscripciones;

import java.util.List;

public class Alumno {
    private String legajo;
    private String nombre;
    private List<Materia> materiasAp;

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Alumno(String legajo, String nombre, List<Materia> materiasAp) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.materiasAp = materiasAp;
    }

    public boolean cumpleCorrelativas(Materia materia) {
        return this.materiasAp.containsAll(materia.getCorrelativas());
    }

}