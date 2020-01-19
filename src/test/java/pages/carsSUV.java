package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumUtil;

public class carsSUV extends TestBase {

    public carsSUV(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//span[text()='SUV']")
    public WebElement SUV;

    public void click(){
        SeleniumUtil.click(SUV);
    }
}
