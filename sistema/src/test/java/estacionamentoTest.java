import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class estacionamentoTest {
    @BeforeEach
    public void selecionandoVagaComBeforeEach(){
        Estacionamento esta = new Estacionamento();
        esta.cadastrarCarro("Gol", "ers4321");
        esta.selecionarVaga("89");

    }
    // cadastrando veiculo em estacionamento
    @Test
    public void cadastrarCarro(){
    Estacionamento esta = new Estacionamento();
    esta.cadastrarCarro("Celta", "kh4532");
    }
    // caso carro passe do tempo limite, é pago um valor adicional
    @Test
    public void valorParaSerPagoPeloTempoAcimaDe4Horas(){
        Estacionamento esta = new Estacionamento();
        esta.cadastrarCarro("Civic", "yht7890");
        esta.setValorPara4Horas(8.5);
        Assertions.assertEquals(25.50, esta.getValorPara4Horas());
    }
    // selecionando vaga em estacionamento
    @Test
    public void selecionandoVaga(){
        Estacionamento esta = new Estacionamento();
        esta.cadastrarCarro("Gol", "ers4321");
        esta.selecionarVaga("89");

    }
    @Test
    public void verificandoSeVagaEstaDesocupada(){
        Estacionamento esta = new Estacionamento();
        esta.selecionarVaga("56");
        esta.setAnalisarVaga("78");
        Assertions.assertTrue(esta.getAnalisarVaga());
    }
    @Test
    public void casoDeVagaOcupada(){
        Estacionamento esta = new Estacionamento();
        esta.selecionarVaga("89");
        esta.setAnalisarVaga("89");
        Assertions.assertFalse(esta.getAnalisarVaga());
    }
    @AfterEach
    public void casoDeVagaOcupadaAfterEach(){
        Estacionamento esta = new Estacionamento();
        esta.selecionarVaga("899");
        esta.setAnalisarVaga("899");
        Assertions.assertFalse(esta.getAnalisarVaga());
    }
}
