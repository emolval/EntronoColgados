import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestParametrizadoVerificaPalabra {

	@ParameterizedTest
    @CsvSource({
        "colgadas, Bien",
        "COLGADAS, Bien",
        "ColgadaS, Bien",
        "cOlGaDaS, Bien",

        "colgantes, Mal",
        "COLGANTES, Mal",
        "ColgantEs, Mal",

        "colgando, Escriba las palabras COlgadas o coLGANTES",
        "'', Escriba las palabras COlgadas o coLGANTES",
        "' colgadas ', Escriba las palabras COlgadas o coLGANTES"
    })
    void testVerificarPalabra(String entrada, String salidaEsperada) {
        assertEquals(salidaEsperada, VerificarPalabra.verificarPalabra(entrada));
    }

}
