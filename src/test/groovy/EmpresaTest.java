import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmpresaTest {

    @Test // Testa se a empresa foi adicionada
    void testAdicionaNovaEmpresa() {
        Empresa.adicionaEmpresas(); // Adiciona 5 empresas
        Empresa.adicionaNovaEmpresa(); // Adiciona 1 nova empresa
        Assertions.assertEquals(6, Empresa.getEmpresas().size());
    }

    @Test // Testa se a lista de empresas está vazia
    void testListaEmpresas() {
        Empresa.adicionaEmpresas();
        Assertions.assertFalse(Empresa.getEmpresas().isEmpty());
    }
}