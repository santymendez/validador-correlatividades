package domain;

import domain.inscripciones.Materia;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AlumnoTest extends BaseTest {

    @Test
    public void santiagoCumpleCorrelativasDeParadigmas() {
        super.inicializar();
        Assert.assertTrue(santiago.cumpleCorrelativas(paradigmas));
    }

    @Test
    public void santiagoNoCumpleCorrelativasDeOperativos() {
        super.inicializar();
        Assert.assertFalse(santiago.cumpleCorrelativas(operativos));
    }
}
