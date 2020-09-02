## Projeto testes automatizados com Selenium 

## Qual é a aplicação a ser testada
Matéria criada por 
<p align="left">
  <img src="https://pbs.twimg.com/profile_images/1057238424195923968/sPBdJODR_400x400.jpg" width="50" alt="accessibility text">
</p>
Babiana Mugnol, babiana.mugnol@rdgaucha.com.br

Após vender a rede Croasonho em 2017, quando o negócio se tornou uma cadeia com 80 lojas em 17 Estados, os idealizadores voltam a campo com projeto inovador de franquia na área de saúde.
Eduardo Silva e Gustavo Susin inauguram, na próxima terça-feira, a Haux, um projeto de R$ 5 milhões com a primeira clínica-modelo em Caxias. A parceria é com o médico Clayton Macedo, doutor em endocrinologia clínica, e outros sócios. O potencial mapeado para expansão é de mais de 200 unidades em cidades acima de 60 mil habitantes no Brasil.
O novo modelo de franquia é focado em mudança intensiva de estilo de vida. A Haux abrirá na Rua Moreira César, 2.229, para trabalhar  a prevenção e o tratamento do excesso de peso, do diabetes e de doenças cardiovasculares. A estrutura também conta com academia. A nova marca será apresentada de forma online no dia 1º de setembro, às 19h,  com mediação da jornalista Laura Medina, especializada em saúde e bem-estar.

## Tecnicas para testa a aplicação
Para validar um sistema com muitos cenários de teste como esse é preciso ganhar velocidade, mas sem abrir ão da qualidade
nos testes vou apresentar apenas dois cenários para demostrar como tirar proveito das técnicas de BDD e posteriormente apresentarei mais com o selenium



## BDD
Cenário 1: Cadastrar novo cliente
DADO que tenho perfil de usuário 
QUANDO preencho os campos para logar E clico en logar
ENTÃO acesso a área interna do sitema

## Atomatizando cenário 1

<h1 align="center">
    <a href="https://pt-br.reactjs.org/">🔗 React</a>
</h1>
<p align="center">🚀  @Test
    public void loginSucesso() throws InterruptedException {
        login.preencherCampoNome("usuario");
        login.preencherCampoSenha("senha");
        login.clicarBotaoLogar();
        wait.until(ExpectedConditions
                .visibilityOf(login.usuarioPresenteAposLogar()));
        String texto = login.usuarioPresenteAposLogar().getText();
        Assert.assertEquals("aristoteles", texto);
    }
	
	
 <p> <img src="123.pnj" width="350" title="hover text">
 
</p>
  @Test
    public void loginSucesso() throws InterruptedException {
        login.preencherCampoNome("usuario");
        login.preencherCampoSenha("senha");
        login.clicarBotaoLogar();
        wait.until(ExpectedConditions
                .visibilityOf(login.usuarioPresenteAposLogar()));
        String texto = login.usuarioPresenteAposLogar().getText();
        Assert.assertEquals("aristoteles", texto);
    }


## BDD
Cenário 2: Cadastrar novo cliente
DADO que tenho perfil de administrador na aplicação 
QUANDO quando preencho os campos obligatórios para um cadastro e clico em salvar
ENTÃO esse novo cliente fica registrado no sistema

## Atomatizando cenário 2
  @Test
    public void cadastrarNovoClienteProspect() {
        cadastro.preencherCampoNomeLogin("usuario");
        cadastro.preencherCampoSenha("senha");
        cadastro.clicarBotaoLogar();
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOf(cadastro.elementoQueDeveEstarVisivel()));
            cadastro.clicarBotaoNovoCliente();
            cadastro.clicarOpcaoClienteProspect();
            cadastro.preencherCampoNomeCliente("LuisTest");
            cadastro.preencherCampoTelefoneCliente("55386727289");
            cadastro.preencherCampoEmailCliente("luisTeste@hotmail.com");
            cadastro.preencherCampoDataNascimentoCliente("02071955");
            cadastro.preencherCampoCPFCliente();
            cadastro.selecionarOpcaoSexoBiologicoMasculino();
            cadastro.clicarParaAbrirOpcaoComoconheceuaHaux();
            cadastro.selecionarOpcaoIndicacaoDeCliente();
            cadastro.clicarBotaoSalvarNovoCadastroProspect();
        wait.until(ExpectedConditions.visibilityOf(cadastro.mensagemCadastradoComSucesso()));
        String mensagemSucessoAlert = cadastro.mensagemCadastradoComSucesso().getText();
        Assert.assertEquals(mensagemSucessoAlert,"Prospect cadastrado com sucesso.");
    }
    
## Ferramenta usada para os testes
![selenium-logo text-320x132](https://miro.medium.com/max/327/1*pdmSfsPk9iQmSyDFwFfzxQ.png)

## Intalações necessarias para esse projeto
Java versão 8 Update 261r ___
IntelliJ IDEA Community Edition 2020.14 ___
ChromeDriver

## Características Selenium WebDriver:

A API Selenium WebDriver tem como principal objetivo automatizar ações do navegador, tais como submits de formulários, seleções em menus dropdown, digitação em campos texto, varredura de dados em elementos, HTML etc. Para entender melhor seus conceitos, a seguir, detalharemos algumas interfaces e outras classes principais que compõem o Selenium WebDriver.

## Características JUnit: 
Origem: Wikipédia, a enciclopédia livre.

Saltar para a navegaçãoSaltar para a pesquisa
O JUnit é um framework open-source, que se assemelha ao raio de testes software java, criado por Erich Gamma e Kent Beck, com suporte à criação de testes automatizados na linguagem de programação Java.

Esse framework facilita a criação e manutenção do código para a automação de testes com apresentação dos resultados. Com ele, pode ser verificado se cada método de uma classe funciona da forma esperada, exibindo possíveis erros ou falhas podendo ser utilizado tanto para a execução de baterias de testes como para extensão.

Com JUnit, o programador tem a possibilidade de usar esta ferramenta para criar um modelo padrão de testes, muitas vezes de forma automatizada.

O teste de unidade testa o menor dos componentes de um sistema de maneira isolada. Cada uma dessas unidades define um conjunto de estímulos (chamada de métodos), e de dados de entrada e saída associados a cada estímulo. As entradas são parâmetros e as saídas são o valor de retorno, exceções ou o estado do objeto. Tipicamente um teste unitário executa um método individualmente e compara uma saída conhecida após o processamento da mesma. Por exemplo:

Assert.assertEquals(2, algumMetodo(1));

## Exemplo de Primeiro Teste Usando Junit: 
import static org.junit.jupiter.api.Assertions.assertEquals;
import example.util.Calculator;
import org.junit.jupiter.api.Test;

class PrimeiroTestUsandoJunit{
//fazendo um teste utilizando os poderes do JUnit
int a=2;
int b=3;
int soma = a + b ;

//anotação "@" junto com a palavra Test me permite executar o teste que verifica se a 5 é igual a soma
@Test
public void addition() {
assertEquals(5, soma);
    }
}

## Comandos Selenium WebDriver

	// Fecha a janela corrente.
	driver.close();

	// Encontra o primeiro elemento de uma tela HTML através de um dado argumento.
	driver.findElement(By by);

	// Encontra todos os elementos de uma tela HTML através de um dado argumento.
	driver.findElements(By by);

	// Abre uma nova URL no navegador.
	driver.get();

	// Retorna uma string que contém a URL aberta pelo navegador.
	driver.getCurrentUrl();

	// Retorna o código fonte da última página aberta pelo navegador.
	driver.getPageSource();

	// Retorna o título da página aberta pelo navegador.
	driver.getTitle();

	// Retorna um identificador da janela em questão.
	driver.getWindowHandle();

	// Retorna identificadores que podem ser utilizados para movimentação entre janelas.
	driver.getWindowHandles();

	// Envia comandos futuros para uma janela (ou frame) diferente.
	driver.switchTo();

	// Permite gerenciar cookies do navegador, logs, timeouts etc.
	driver.manage();

	// Abstração que permite acessar o histórico e navegar para uma determinada URL.
	driver.navigate();

	// Fecha a instância do Selenium WebDriver e todas os navegadores associados.
	driver.quit();

## Instalação através do gerenciador de dependências Maven: 

Utilizei o Maven para facilitar a vida, ele vai cuidar da parte de gerenciamento de dependências. 

Incluir as dependências do WebDriver, do JUnit e do AssertJ no pom.xml como mostro abaixo:

<!-- Selenium WebDriver -->
<dependency>
	<groupId>org.seleniumhq.selenium</groupId>
	<artifactId>selenium-java</artifactId>
	<version>3.13.0</version>
	<scope>test</scope>
</dependency>
<!-- JUnit -->
<dependency>
	<groupId>org.junit.jupiter</groupId>
	<artifactId>junit-jupiter-api</artifactId>
	<version>5.2.0</version>
	<scope>test</scope>
</dependency>
<dependency>
	<groupId>org.junit.jupiter</groupId>
	<artifactId>junit-jupiter-engine</artifactId>
	<version>5.2.0</version>
	<scope>test</scope>
</dependency>
<!-- AssertJ -->
<dependency>
	<groupId>org.assertj</groupId>
	<artifactId>assertj-core</artifactId>
	<version>3.10.0</version>
	<scope>test</scope>
</dependency>

## Algumas vantagens de se utilizar JUnit:
Permite a criação rápida de código de teste enquanto possibilita um aumento na qualidade do sistema sendo desenvolvido e testado;
Não é necessário escrever o próprio framework;
Amplamente utilizado pelos desenvolvedores da comunidade código-aberto, possuindo um grande número de exemplos;
Uma vez escritos, os testes são executados rapidamente sem que, para isso, seja interrompido o processo de desenvolvimento;
JUnit checa os resultados dos testes e fornece uma resposta imediata;
Pode-se criar uma hierarquia de testes que permitirá testar apenas uma parte do sistema ou todo ele;
Escrever testes com JUnit permite que o programador perca menos tempo depurando seu código;
JUnit é LIVRE.


## Links 

	devmedia.com.br   https://www.devmedia.com.br/introducao-aos-testes-funcionais-automatizados-com-junit-e-selenium-webdriver/28037
	junit.org         https://junit.org/junit5/docs/current/user-guide/
	wikipedia.org     https://pt.wikipedia.org/wiki/JUnit
        Lucas G. Carvalho https://medium.com/editora-globo/introdu%C3%A7%C3%A3o-ao-selenium-webdriver-8ac2f9a8d9d0
        Babiana Mugnol    pioneiro.clicrbs.com.br/rs/economia/caixa-forte/noticia/2020/08/idealizadores-de-franquia-nacional-com-novo-sonho-13001085.html

	
	
 
