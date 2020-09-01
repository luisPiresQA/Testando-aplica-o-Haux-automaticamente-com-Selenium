package org.example.testes;

import org.example.interacao.CadastroNovoClienteInteracao;
import org.example.utils.InstaciaDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
import java.util.List;

public class CadastroNovoClienteTeste extends InstaciaDriver {
    CadastroNovoClienteInteracao cadastro = PageFactory.initElements(driver, CadastroNovoClienteInteracao.class);
    @Test
    public void cadastrarNovoCliente(){
        cadastro.preencherCampoNomeLogin("usuario");
        cadastro.preencherCampoSenha("senha");
        cadastro.clicarBotaoLogar();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions
        .visibilityOf(cadastro.elementoQueDeveEstarVisivel()));
        cadastro.clicarBotaoNovoCliente();
        cadastro.clicarOpcaoCliente();
        cadastro.preencherCampoNomeCliente("LuisTest");
        cadastro.preencherCampoTelefoneCliente("55386727289");
        cadastro.preencherCampoEmailCliente("luisTeste@hotmail.com");
        cadastro.preencherCampoDataNascimentoCliente("02071955");
        cadastro.preencherCampoCPFCliente();
        cadastro.selecionarOpcaoSexoBiologicoMasculino();
        cadastro.clicarParaAbrirOpcaoComoconheceuaHaux();
        cadastro.selecionarOpcaoIndicacaoDeCliente();
        cadastro.clicarParaAbrirOpcoesLocalizacaoDeCliente();
        cadastro.selecionarOpcaoLocalidadeDeClienteATHome();
        cadastro.preencherCampoCEPCliente("90010030");
        cadastro.preencherCampoNumeroEndercoCliente("289");
        wait.until(ExpectedConditions
        .visibilityOf(cadastro.elementoBotaoSalvarClienteDeveEstarVisivel()));
        cadastro.clicarBotaoSalvarNovoCadastroCliente();
        wait.until(ExpectedConditions.visibilityOf(cadastro.mensagemCadastradoComSucesso()));
        String mensagemSucessoAlert = cadastro.mensagemCadastradoComSucesso().getText();
        Assert.assertEquals(mensagemSucessoAlert,"Cliente cadastrado com sucesso.");
    }
    @Test
    public void cadastrarNovoClientesGerarContrato(){
        cadastro.preencherCampoNomeLogin("usuario");
        cadastro.preencherCampoSenha("senha");
        cadastro.clicarBotaoLogar();
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions
                .visibilityOf(cadastro.elementoQueDeveEstarVisivel()));
        cadastro.clicarBotaoNovoCliente();
        cadastro.clicarOpcaoCliente();
        cadastro.preencherCampoNomeCliente("LuisTest");
        cadastro.preencherCampoTelefoneCliente("55386727289");
        cadastro.preencherCampoEmailCliente("luisTeste@hotmail.com");
        cadastro.preencherCampoDataNascimentoCliente("02071955");
        cadastro.preencherCampoCPFCliente();
        cadastro.selecionarOpcaoSexoBiologicoMasculino();
        cadastro.clicarParaAbrirOpcaoComoconheceuaHaux();
        cadastro.selecionarOpcaoIndicacaoDeCliente();
        cadastro.clicarParaAbrirOpcoesLocalizacaoDeCliente();
        cadastro.selecionarOpcaoLocalidadeDeClienteATHome();
        cadastro.preencherCampoCEPCliente("90010030");
        cadastro.preencherCampoNumeroEndercoCliente("289");
        wait.until(ExpectedConditions.visibilityOf(cadastro.elementoBotaoSalvarClienteDeveEstarVisivel()));
        cadastro.clicarBotaoCadastroClienteGerarContrato();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowHandles.get(0));
        wait.until(ExpectedConditions.visibilityOf(cadastro.mensagemCadastradoComSucesso()));
        String mensagemSucessoAlert = cadastro.mensagemCadastradoComSucesso().getText();
        Assert.assertEquals(mensagemSucessoAlert, "Cliente cadastrado com sucesso.");
    }

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
}
