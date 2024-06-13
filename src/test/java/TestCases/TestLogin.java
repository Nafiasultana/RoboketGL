package TestCases;

import Pages.BaseRoboket;
import Pages.Login;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
    public class TestLogin extends BaseRoboket {

        public TestLogin() {
            super();
        }
        @Test
        public void userLogin() {
            Login login = new Login(driver);
//            driver.get("https://dev.roboket.com/");
            login.doLogin("mdsadikurrahman26@gmail.com", "123456");
        }
    }

