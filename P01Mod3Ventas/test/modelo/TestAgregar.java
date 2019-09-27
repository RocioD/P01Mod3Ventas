package modelo;

import org.junit.Assert;
import org.junit.Test;


public class TestAgregar {

    public TestAgregar() {
    }
    
    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        Venta venta = new Venta("V01", 1000, 2);
        ColeccionVentas instance = new ColeccionVentas();
        boolean esperado = true;
        boolean obtenido = instance.Agregar(venta);
        Assert.assertEquals(esperado, obtenido);
    }
}
