package domain;

import org.junit.Assert;
import org.junit.Test;

public class InscripcionTest extends BaseTest{

    @Test
    public void santiagoNoPuedeInscribirseAParadigmasYOperativos() {
        super.inicializar();
        Assert.assertFalse(inscripcion1.aprobada());
    }

    @Test
    public void santiagoPuedeInscribirseAParadigmas() {
        super.inicializar();
        Assert.assertTrue(inscripcion2.aprobada());
    }
}
