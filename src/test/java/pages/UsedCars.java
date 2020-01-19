package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumUtil;

public class UsedCars extends TestBase {
    public UsedCars() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "shopindex-bodyStyle")
    public WebElement Search_By_Body_Style;

    public void click() {
        SeleniumUtil.click(Search_By_Body_Style);
    }
}