package pages;

import base.BasePage;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class CartPage extends BasePage {
  public void open() {
    Selenide.open("/cart");
  }

  public SelenideElement cartPassengerBlock =
      $(xpath("//div[@class='time']/a"));

  public SelenideElement cancelTicketBtn =
      $(xpath("//a[@class='overlay-cancel-ticket']"));

  public SelenideElement confirmCancellationBtn =
      $(xpath("//a[@class='ok']"));
}
