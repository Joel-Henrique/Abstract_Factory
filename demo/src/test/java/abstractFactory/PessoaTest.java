package abstractFactory;

import org.junit.jupiter.api.Test;

import com.example.FabricaAbstrata;
import com.example.FabricaPessoaFisica;
import com.example.FabricaPessoaJuridica;
import com.example.Pessoa;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {
    @Test
    void deveEmitirContratoPessoaFisica() {
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Contrato de pessoa fisica", pessoa.emitirContrato());
    }

    @Test
    void deveEmitirContratoPessoaJuridica() {
        FabricaAbstrata fabrica = new FabricaPessoaJuridica();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Contrato de pessoa juridica", pessoa.emitirContrato());
    }

    @Test
    void deveEmitirReciboPessoaFisica() {
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Recibo de pessoa fisica", pessoa.emitirRecibo());
    }
    
    @Test
    void deveEmitirReciboPessoaJuridica() {
        FabricaAbstrata fabrica = new FabricaPessoaJuridica();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Recibo de pessoa juridica", pessoa.emitirRecibo());
    }
}
