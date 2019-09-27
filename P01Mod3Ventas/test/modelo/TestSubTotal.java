package modelo;

import org.junit.Assert;
import org.junit.Test;

public class TestSubTotal {

    public TestSubTotal() {
    }
    
    @Test
    public void testSubTotal() {
        System.out.println("subTotal");
        Venta venta = new Venta("V01", 1000, 2);
        ColeccionVentas instance = new ColeccionVentas();
        int esperado = 2000;
        instance.Agregar(venta);
        int obtenido = instance.subTotal(venta);
        Assert.assertTrue(esperado == obtenido);
    }
}
