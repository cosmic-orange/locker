package tests;

import base.BaseTest;
import datacontroller.DataController;
import models.Passenger;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import base.BasePage;
import pages.CartPage;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.sleep;

public class MainTest extends BaseTest {
  private DataController data;

  @BeforeClass
  public void setupData() throws IOException, ParseException {
    data = new DataController("src/main/resources/names.json");
  }

  @Test
  public void ticketsLocker() {
    BasePage p = new BasePage();
    CartPage cart = new CartPage();

    for(int i = 0; i < 3; i++) {
      Passenger passenger = new Passenger(data.getFirstName(i), data.getLastName(i));

      p.open("2200001", "2210700", "2019-01-18");
      sleep(1000);
      p.chooseWagon("084 О", "П");
      sleep(1000);
      p.chooseSit("051");
      sleep(1000);
      p.orderTicketsBtn.click();
      sleep(1000);
      p.firstnameFld.val(passenger.getFirstName());
      sleep(1000);
      p.lastnameFld.val(passenger.getLastName());
      sleep(1000);
      p.addToCartBtn.click();

      sleep(180000);
      jsHoverAndClick(cart.cartPassengerBlock, cart.cancelTicketBtn);
      cart.confirmCancellationBtn.click();
      sleep(1000);
    }
  }
}
