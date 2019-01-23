package base;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ConciseAPI {
  public void jsHoverAndClick(SelenideElement elemToHover, SelenideElement elemToClick) {
    Actions actions = new Actions(getWebDriver());
    actions.moveToElement(elemToHover);

    actions.moveToElement(elemToClick);
    actions.click().build().perform();
  }
}
