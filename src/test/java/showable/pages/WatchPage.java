package showable.pages;

import configuration.WebOperations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WatchPage extends WebOperations {

    public WatchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".BucketsContainer > div")
    private List<WebElement> carouselContainer;

    @FindBy(css = "#fittPageContainer > section > div:nth-child(1) > section > div.Carousel__Wrapper.relative.Carousel__Wrapper--canScrollRight > div > div > ul > li:nth-child(2) > a > div.MediaPlaceholder.relative.MediaPlaceholder--16x9.cursor-pointer.MediaPlaceholder--button-hover.WatchTile__Image.WatchTile__Image--16x9 > figure > div.Image__Wrapper.aspect-ratio--child > picture > img")
    private WebElement card;

    @FindBy(css = "#fittPortal_0 > div > div > section > header > button > div > svg")
    private WebElement XBtn;

    public boolean isACarouselDisplayed(){
        for (int i = 0; i < carouselContainer.size(); i++) {
            if(i > 0){
                return true;
            }
        }
        return false;
    }

    public void clickOnCard(){
        super.waitForClickeable(card);
        super.clickElement(card);
    }

    public boolean isXBtnDisplayed(){
        super.waitForVisibility(XBtn);
        return XBtn.isDisplayed();
    }

    public void clickOnXBtn(){
        super.waitForClickeable(XBtn);
        super.clickElement(XBtn);
    }

    public void clickOnLandingPage(){
        super.getDriver().navigate().back();
    }
}
