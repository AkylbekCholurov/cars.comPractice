package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumUtil;

public class CarsShopping extends TestBase {
    public CarsShopping(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//a[text()='Research'])[2]")
    public WebElement Research;

    public void click(){
        SeleniumUtil.click(Research);
    }
}
