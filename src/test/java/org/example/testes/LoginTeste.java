package org.example.testes;

import org.example.interacao.LoginInteracao;
import org.example.utils.InstaciaDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTeste extends InstaciaDriver {

    LoginInteracao login = PageFactory.initElements(driver, LoginInteracao.class);
    WebDriverWait wait = new WebDriverWait(driver, 30);

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

    @Test
    public void loginDadosIncorreto(){
        login.preencherCampoNome("teste@gmail.com");
        login.preencherCampoSenha("1234");
        login.clicarBotaoLogar();
        wait.until(ExpectedConditions
                .visibilityOf(login.mensagemDadosIncorretos()));
        String texto = login.mensagemDadosIncorretos().getText();
        Assert.assertEquals(texto,"Usuário ou senha incorretos. Tente novamente.");
    }
}
