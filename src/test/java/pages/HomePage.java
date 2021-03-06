package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumUtil;

public class HomePage extends TestBase {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//a[text()='Cars for Sale'])[2]")
    public WebElement Cars_for_Sale;

    @FindBy(id = "shopindex-bodyStyle")
    public WebElement Search_By_Body_Style;

    public void click1(){
        SeleniumUtil.click(Search_By_Body_Style);
    }

    public void click(){
        SeleniumUtil.click(Cars_for_Sale);
    }

}
