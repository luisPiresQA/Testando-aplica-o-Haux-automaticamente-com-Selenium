package org.example.interacao;

import org.example.paginas.CadastroNovoClientePagina;
import org.example.utils.MetodosGenericos;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroNovoClienteInteracao extends CadastroNovoClientePagina {

    private WebDriver driver;

    public CadastroNovoClienteInteracao(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    MetodosGenericos mtdoGen = new MetodosGenericos();
    String cpf = mtdoGen.geradorCPF();

    public void preencherCampoNomeLogin(String usuario) {
        campoNome.sendKeys(usuario);
    }
    public void preencherCampoCEPCliente(String cep) {
        campoCEP.sendKeys(cep);
    }
    public void preencherCampoNumeroEndercoCliente(String numero) {
        campoNúmero.sendKeys(numero);
    }
    public void preencherCampoSenha(String senha) {
        campoSenha.sendKeys(senha);
    }
    public void preencherCampoNomeCliente(String nomeCliente) {
        campoNomeCliente.sendKeys(nomeCliente);
    }
    public void preencherCampoTelefoneCliente(String telefoneCliente) {
        campoTelefoneCliente.sendKeys(telefoneCliente);
    }

    public void preencherCampoEmailCliente(String EmailCliente) {
        campoEmailCliente.sendKeys(EmailCliente);
    }
    public void preencherCampoDataNascimentoCliente(String DataNascimentoCliente) {
        campoDataNascimentoCliente.sendKeys(DataNascimentoCliente);
    }

    public void preencherCampoCPFCliente() {
        cpf = mtdoGen.geradorCPF();
        campoCPFCliente.sendKeys(cpf);
    }

    public void clicarParaAbrirOpcaoComoconheceuaHaux() {
        abrirOpcoesDecomoConheceuAHaux.click();
    }

    public void clicarOpcaoCliente() {
        opcaoCliente.click();
    }

    public void clicarParaAbrirOpcoesLocalizacaoDeCliente() {
        localCliente.click();
    }

    public void clicarOpcaoClienteProspect() {
        opcaoClienteProspect.click();
    }

    public void selecionarOpcaoSexoBiologicoMasculino() {
        opcaoSexoBiologicoMasculino.click();
    }

    public void selecionarOpcaoSexoBiologicoFeminino() {
        opcaoSexoBiologicoFeminino.click();
    }

    public void selecionarOpcaoIndicacaoDeCliente() {
        opcaoIndicacaoDeCliente.click();
    }


    public void selecionarOpcaoLocalidadeDeClienteATHome() {
        clienteDeATHome.click();
    }

    public void selecionarOpcaoLocalidadeDeClienteCaziasDoSul() {
        clienteDeCaxiasDoSul.click();
    }

    public void clicarBotaoSalvarNovoCadastroProspect() {
        botaoSalvarProspect.click();
    }

    public void clicarBotaoLogar() {
        botaoLogar.click();
    }

    public void clicarBotaoNovoCliente() {
        botaoNovoCadastrar.click();
    }

    public void clicarBotaoSalvarNovoCadastroCliente() {
        botaoSalvarCliente.click();
    }

    public void clicarBotaoCadastroClienteGerarContrato() {
        botaoSalvarClienteGeraContrato.click();
    }

    public WebElement elementoQueDeveEstarVisivel() {return elementoBotaoNovo; }

    public WebElement elementoBotaoSalvarClienteDeveEstarVisivel() { return elementoBotaoSalvarCliente; }

    public WebElement mensagemCadastradoComSucesso() {
        return mensagemCadastroSucesso;
    }
}
