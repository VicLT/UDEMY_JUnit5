package org.victorlt.junit5.ejemplos.models;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    void testNombreCuenta() {
        Cuenta cuenta = new Cuenta("Andrés", new BigDecimal("1000.12345"));
//        cuenta.setPersona("Andrés");
        String esperado = "Andrés";
        String real = cuenta.getPersona();
        assertEquals(esperado, real);
        assertTrue(real.equals("Andrés"));
    }

}