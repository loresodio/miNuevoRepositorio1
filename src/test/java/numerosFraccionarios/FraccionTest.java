package numerosFraccionarios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraccionTest {

    @Test
    public void sumaFraccion() {
        Fraccion frac1=new Fraccion(3,2);
        Fraccion frac2=new Fraccion(3,2);
        assertTrue(frac1.sumaFraccion(frac2));
    }

    @Test
    void restaFraccion() {
        Fraccion frac1=new Fraccion(3,2);
        Fraccion frac2=new Fraccion(3,5);
        assertTrue(frac1.restaFraccion(frac2));
    }

    @Test
    void devuelveResultado() {
        Fraccion fr1=new Fraccion(3,0);
        assertNotEquals(fr1.devuelveResultado(),Float.
                POSITIVE_INFINITY);
    }
}