import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmpresaTest {

    @Test
    void testAdicionaNovaEmpresa() {
        Empresa.adicionaNovaEmpresa();
    }

    @Test
    void testListaEmpresas() {
        Empresa.adicionaEmpresas();
        Assertions.assertFalse(Empresa.getEmpresas().isEmpty());
    }

    @Test
    void testQuantidadeEmpresas() {
        Empresa.adicionaEmpresas();
        Assertions.assertEquals(6, Empresa.getEmpresas().size());
    }
}