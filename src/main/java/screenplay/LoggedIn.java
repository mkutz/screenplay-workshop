package screenplay;

import org.openqa.selenium.By;

public class LoggedIn implements Question<Boolean> {

  public static LoggedIn areYouLoggedIn() {
    return new LoggedIn();
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    final var webDriver = actor.uses(BrowseTheWeb.class)
        .getWebDriver();

    return webDriver
        .findElement(By.linkText("Log Out"))
        .isDisplayed();
  }

  @Override
  public String toString() {
    return "are you logged in";
  }
}
