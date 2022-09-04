import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CandidatoTest {

    @Test
    void testAdicionaNovoCandidato() {
        Candidato.adicionaNovoCandidato();

    }

    @Test
    void testListaCandidatos() {
        Candidato.adicionaCandidatos();
        Assertions.assertFalse(Candidato.getCandidatos().isEmpty());
    }

    @Test
    void testQuantidadeCandidatos() {
        Candidato.adicionaCandidatos();
        Assertions.assertEquals(5, Candidato.getCandidatos().size());
    }
}