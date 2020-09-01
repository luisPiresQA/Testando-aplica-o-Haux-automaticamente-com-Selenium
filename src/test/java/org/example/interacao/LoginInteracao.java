package org.example.interacao;

import org.example.paginas.LoginPagina;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginInteracao extends LoginPagina {

    private WebDriver driver;

    public LoginInteracao(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void preencherCampoNome(String usuario) {
        campoNome.sendKeys(usuario);
    }
    public void preencherCampoSenha(String senha) {
        campoSenha.sendKeys(senha);
    }

    public void clicarBotaoLogar() {
        botaoLogar.click();
    }
    public WebElement usuarioPresenteAposLogar() {
        return usuarioPresenteDepoisDeLogar;
    }
    public WebElement mensagemDadosIncorretos() {
        return dadosIncorretos;
    }
}


