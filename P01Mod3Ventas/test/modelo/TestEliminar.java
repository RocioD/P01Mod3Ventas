package modelo;

import org.junit.Assert;
import org.junit.Test;

public class TestEliminar {

    public TestEliminar() {
    }
    
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        String codigo = "V01";
        Venta venta = new Venta("V01", 1000, 2);
        ColeccionVentas instance = new ColeccionVentas();
        boolean esperado = true;
        instance.Agregar(venta);
        boolean obtenido = instance.Eliminar(codigo);
        Assert.assertEquals(esperado, obtenido);

    }
}
