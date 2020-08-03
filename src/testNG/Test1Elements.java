package testNG;

import net.bytebuddy.implementation.bind.annotation.BindingPriority;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;

import java.util.List;

public class Test1Elements {

    public Test1Elements(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".myaccount-link-list>li:nth-child(3)>a>span")
    public WebElement myAddressButton;


    @FindBy(xpath= "//span[text()='Add a new address']")
    public WebElement addNewAdress;

    @FindBy(css = "#firstname")
    public WebElement NewAdressFirstNAme;

    @FindBy(css = "#lastname")
    public WebElement NewAdressLastNAme;

    @FindBy(css = "#company")
    public WebElement NewAdressCompany;

    @FindBy(css = "#address1")
    public WebElement NewAdressAdress1;

    @FindBy(css = "#address2")
    public WebElement NewAdressAdress2;

    @FindBy(css = "#city")
    public WebElement NewAdressCity;

    @FindBy(css="#id_state")
    public WebElement NewAdressState;





    @FindBy(css="#postcode")
    public WebElement NewAdressPostaCode;




    @FindBy(css="#phone")
    public WebElement NewAdressPhone;

    @FindBy(css="#phone_mobile")
    public WebElement NewAdressMobilePhone;

    @FindBy(css="#other")
    public  WebElement NewAdressInformation;

    @FindBy(css="#alias")
    public  WebElement NewAdressReference;

    @FindBy(css="#submitAddress>span")
    public  WebElement NewAdressSave;

    @FindBy(xpath = "//h3[text()='blabla']")
    public WebElement verify;

    @FindBy(css="ul.last_item>:last-child>:first-child")
    public WebElement UpdateButton;

    @FindBy(css = "#firstname")
    public WebElement NewFirstNAme;

    @FindBy(css = "#lastname")
    public WebElement NewLastNAme;

    @FindBy(css="#submitAddress>span")
    public  WebElement SaveButton;

    @FindBy(css = "ul.last_item>:last-child>:last-child>span")
    public WebElement DeleteButton;

    @FindAll({
            @FindBy(css=".page-subheading")

    })
     public List<WebElement> adressName;
}
