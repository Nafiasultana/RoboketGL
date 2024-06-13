package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Login extends BaseRoboket{
        public WebDriver driver;
        @FindBy(id="username")
        WebElement userEmail;
        @FindBy(id="password")
        WebElement pass;
        @FindBy(id = "kc-login")
        WebElement loginButton;
        public Login(WebDriver driver)
        {
            this.driver=driver;
            PageFactory.initElements(driver,this);
        }
        public void doLogin(String email, String password)
        {
            userEmail.sendKeys(email);
            pass.sendKeys(password);
            loginButton.click();
        }
    }

