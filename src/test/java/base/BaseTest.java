package base;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeSuite;

import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;

public class BaseTest extends ConciseAPI {
  @BeforeSuite
  public void setUp() {
    WebDriverManager.getInstance(CHROME).setup();
    Configuration.browser = "chrome";
    Configuration.baseUrl = "https://booking.uz.gov.ua/en";
  }
}
