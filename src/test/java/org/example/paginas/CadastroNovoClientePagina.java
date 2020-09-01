package org.example.paginas;


import org.example.utils.InstaciaDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastroNovoClientePagina extends InstaciaDriver {
    private WebDriver driver;

    public CadastroNovoClientePagina(WebDriver driver) {

        this.driver = driver;
    }

    @FindBy(xpath = "//span[text()=\"Novo cadastro\"]")
    protected WebElement elementoBotaoNovo;

    @FindBy(xpath = "//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained CTATertiaryButton\"]")
    protected WebElement elementoBotaoSalvarCliente;

    @FindBy(xpath = "//label[text()='Nome de usuário']/following::input")
    protected WebElement campoNome;

    @FindBy(xpath = "//input[@type='password']")
    protected WebElement campoSenha;

    @FindBy(xpath = "//span[text()='Entrar']")
    protected WebElement botaoLogar;

    @FindBy(xpath = "//span[text()=\"Novo cadastro\"]")
    protected WebElement botaoNovoCadastrar;

    @FindBy(xpath = "//span[@class=\"paragraph\" and text()=\"Cliente\"]")
    protected WebElement opcaoCliente;

    @FindBy(xpath = "//span[@class=\"paragraph\" and text()=\"Prospect\"]")
    protected WebElement opcaoClienteProspect;

    @FindBy(xpath = "//label[text()=\"Nome\"]/../div/input")
    protected WebElement campoNomeCliente;

    @FindBy(xpath = "//label[text()=\"Telefone\"]/../div/input")
    protected WebElement campoTelefoneCliente;

    @FindBy(xpath = "//label[text()=\"E-mail\"]/../div/input")
    protected WebElement campoEmailCliente;

    @FindBy(xpath = "//label[text()=\"Data de Nascimento\"]/../div/input")
    protected WebElement campoDataNascimentoCliente;

    @FindBy(xpath = "//label[text()=\"CPF\"]/../div/input")
    protected WebElement campoCPFCliente;

    @FindBy(xpath = "//span[text()=\"M\"]/../..")
    protected WebElement opcaoSexoBiologicoMasculino;

    @FindBy(xpath = "//span[text()=\"F\"]/../..")
    protected WebElement opcaoSexoBiologicoFeminino;

    @FindBy(xpath = "//*[@id=\"Como conheceu a Haux-option-5\"]")
    protected WebElement opcaoOutboundComercial;

    @FindBy(xpath = "//*[@id=\"Como conheceu a Haux-option-4\"]")
    protected WebElement opcaoPresencial;

    @FindBy(xpath = "//*[@id=\"Como conheceu a Haux-option-3\"]")
    protected WebElement opcaoIndicacaoDeCliente;

    @FindBy(xpath = "//*[@id=\"Como conheceu a Haux-option-2\"]")
    protected WebElement opcaoTelefone;

    @FindBy(xpath = "//*[@id=\"Como conheceu a Haux-option-1\"]")
    protected WebElement opcaoMidiasSociais;

    @FindBy(id = "Como conheceu a Haux")
    protected WebElement abrirOpcoesDecomoConheceuAHaux;

    @FindBy(id = "demo-simple-select")
    protected WebElement localCliente;

    @FindBy(xpath = "//ul/li[@data-value=\"At Home\"]")
    protected WebElement clienteDeATHome;

    @FindBy(xpath = "//ul/li[@data-value=\"Caxias do Sul\"]")
    protected WebElement clienteDeCaxiasDoSul;

    @FindBy(xpath = "//span[text()=\"Salvar\"]")
    protected WebElement botaoSalvarProspect;

    @FindBy(xpath = "//label[text()=\"CEP\"]/../div/input")
    protected WebElement campoCEP;

    @FindBy(xpath = "//label[text()=\"Número\"]/../div/input")
    protected WebElement campoNúmero;

    @FindBy(xpath = "//span[text()=\"salvar\"]")
    protected WebElement botaoSalvarCliente;

    @FindBy(xpath = "//span[text()=\"Salvar e Gerar Contrato\"]")
    protected WebElement botaoSalvarClienteGeraContrato;

    //mensagem alerta para os três perfis cliente/cliente prospect e gerando contrato
    @FindBy(xpath = "//div[@class=\"MuiAlert-message\"]")
    protected WebElement mensagemCadastroSucesso;
}
