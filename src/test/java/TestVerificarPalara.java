import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestVerificarPalara {

	@Test
    public void testColgadasMinusculas() {
        assertEquals("Bien", VerificarPalabra.verificarPalabra("colgadas"));
    }

    @Test
    public void testColgadasMayusculas() {
        assertEquals("Bien", VerificarPalabra.verificarPalabra("COLGADAS"));
    }

    @Test
    public void testColgadasMixto() {
        assertEquals("Bien", VerificarPalabra.verificarPalabra("ColgadaS"));
    }

    @Test
    public void testColgantesMinusculas() {
        assertEquals("Mal", VerificarPalabra.verificarPalabra("colgantes"));
    }

    @Test
    public void testColgantesMayusculas() {
        assertEquals("Mal", VerificarPalabra.verificarPalabra("COLGANTES"));
    }

    @Test
    public void testColgantesMixto() {
        assertEquals("Mal", VerificarPalabra.verificarPalabra("ColgantEs"));
    }

    @Test
    public void testPalabraIncorrecta() {
        assertEquals("Escriba las palabras COlgadas o coLGANTES", VerificarPalabra.verificarPalabra("colgando"));
    }

    @Test
    public void testPalabraVacia() {
        assertEquals("Escriba las palabras COlgadas o coLGANTES", VerificarPalabra.verificarPalabra(""));
    }

    @Test
    public void testEspacios() {
        assertEquals("Escriba las palabras COlgadas o coLGANTES", VerificarPalabra.verificarPalabra(" colgadas "));
    }

}
