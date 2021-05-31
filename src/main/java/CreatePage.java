import org.openqa.selenium.By;

public class CreatePage extends BasePage {
    private By uploadButtonLocation = By.cssSelector("[class*='uploadButton'] input");

    @Override
    public String getUrl() {
        return BASE_URL + "/create";
    }

    public void open() {
        open(getUrl());
    }

    public void uploadPhoto() {
//        WaitHelper.getInstance().waitForElementToBeDisplayed(uploadButtonLocation);
        type(uploadButtonLocation, "/Users/varshovhannisyan/AutomationTraining/src/main/resources/photo.png");
    }
}