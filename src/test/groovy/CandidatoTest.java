import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CandidatoTest {

    @Test // Testa se o candidato foi adicionado
    void testAdicionaNovoCandidato() {
        Candidato.adicionaCandidatos(); // Adiciona 5 candidatos
        Candidato.adicionaNovoCandidato(); // Adiciona 1 novo candidato
        Assertions.assertEquals(6, Candidato.getCandidatos().size());
    }

    @Test // Testa se a lista de candidatos está vazia
    void testListaCandidatos() {
        Candidato.adicionaCandidatos();
        Assertions.assertFalse(Candidato.getCandidatos().isEmpty());
    }
}