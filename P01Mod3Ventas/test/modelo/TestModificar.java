package modelo;

import org.junit.Assert;
import org.junit.Test;

public class TestModificar {

    public TestModificar() {
    }
    
    @Test
    public void testModificar() {
        System.out.println("Modificar");
        Venta venta = new Venta("V01", 1000, 2);
        ColeccionVentas instance = new ColeccionVentas();
        boolean esperado = true;
        instance.Agregar(venta);
        boolean obtenido = instance.Modificar(venta);
        Assert.assertEquals(esperado, obtenido);
    }
}
