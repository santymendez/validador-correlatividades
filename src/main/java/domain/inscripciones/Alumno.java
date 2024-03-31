package domain.inscripciones;

import java.util.List;

public class Alumno {
    private String legajo;
    private String nombre;
    private List<Materia> materiasAp;

    public Alumno(String legajo, String nombre, List<Materia> materiasAp) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.materiasAp = materiasAp;
    }

    public boolean cumpleCorrelativas(Materia materia) {
        return this.materiasAp.containsAll(materia.getCorrelativas());
    }

}