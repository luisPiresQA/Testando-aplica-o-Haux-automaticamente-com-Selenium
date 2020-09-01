package org.example.paginas;


import org.example.utils.InstaciaDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagina extends InstaciaDriver {
    private WebDriver driver;
    public LoginPagina(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(xpath = "//label[text()='Nome de usuário']/following::input")
    protected WebElement campoNome;

    @FindBy(xpath = "//input[@type='password']")
    protected WebElement campoSenha;

    @FindBy(xpath = "//span[text()='Entrar']")
    protected WebElement botaoLogar;

    @FindBy(xpath = "//span[@class=\"userProfession\" and text()=\"Admin\"]")
    protected WebElement usuarioPresenteDepoisDeLogar;

    @FindBy(xpath = "//div[@class=\"MuiAlert-message\"]")
    protected WebElement dadosIncorretos;
}
