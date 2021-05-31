import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditorPage extends BasePage {

    private static By instagramStoryLocation = By.cssSelector("[aria-label='Instagram Story 1080 x 1920 px']");
    private static By editorItemLocation = By.cssSelector("[class*='customSizeContainer']");
    private static By fitIconLocation = By.cssSelector("#background-category");


    public EditorPage() {
        open(getUrl());
    }

    @Override
    public String getUrl() {
        return BASE_URL + "/create/editor";
    }

    public int getItemsCount() {
        WaitHelper.getInstance().waitForElementToBeDisplayed(editorItemLocation);
        return findAll(editorItemLocation).size();

    }

    public void clickInstagramStory() {
        WaitHelper.getInstance().waitForElementToBeDisplayed(instagramStoryLocation);
        Actions actions = new Actions(driver);
        actions.moveToElement(find(instagramStoryLocation)).click().build().perform();
    }
    public void clickFitIcon() {
        WaitHelper.getInstance().waitForElementToBeDisplayed(fitIconLocation);
        click(fitIconLocation);
    }
}
