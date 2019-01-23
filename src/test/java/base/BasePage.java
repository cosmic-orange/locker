package base;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class BasePage {
  public void open(String from, String to, String date) {
    Selenide.open("/?from="+ from +"&to="+ to +"&date="+ date +"&time=00%3A00&url=train-list");
  }

  public SelenideElement popupOverlay =
      $(xpath("//div[@class='popup-overlay']"));

  public SelenideElement submitSearchBtn =
      $(xpath("//div[@class='search-block']/following-sibling::div[@class='button']"));

  public SelenideElement trainsTable =
      $(xpath("//table[@class='train-table']"));

  public SelenideElement orderTicketsBtn =
      $(xpath("//input[@value='Order tickets']"));

  public SelenideElement lastnameFld =
      $(xpath("//input[@name='lastname']"));

  public SelenideElement firstnameFld =
      $(xpath("//input[@name='firstname']"));

  public SelenideElement addToCartBtn =
      $(xpath("//input[@value='Add to Cart']"));

  public void chooseSit(String sitNum) {
    $(xpath("//div[@original-place='"+ sitNum +"']")).click();
  }

  public void chooseWagon(String routeCode, String wagonType) {
    $(xpath("//div[@id='train-list']//div[text()='"+ routeCode +"']/../following-sibling::*//input[@data-wagon-id='"+ wagonType +"']"))
        .click();
  }
}
