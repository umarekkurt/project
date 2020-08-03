package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Test2Elements  {

    public Test2Elements(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


  @FindBy(css="#block_top_menu>ul>li:nth-child(2)>a")
    public WebElement Dresses;


   @FindAll({
           @FindBy(css = "div.right-block > h5 > a")
   })
   public List<WebElement>  anyItems;

   @FindBy(id="wishlist_button")
    public WebElement addWishList;

   @FindBy(css = "a[title='Close']")
   public WebElement closeButton;

   @FindBy(css=".account>span")
    public WebElement userName;

   @FindBy(xpath ="//span[text()='My wishlists']")
    public WebElement myWihList;

    @FindBy (css ="td:nth-child(1) > a")
    public WebElement wishListButton;

    @FindBy(css = "#s_title")
    public WebElement verifyTitle;

    @FindBy(css = "i[class='icon-remove-sign']")
    public WebElement Xbutton;

    @FindBy(css = "td:nth-child(1) > a")
    public WebElement myWishListTable;

    @FindBy(css = "p.alert")
    public WebElement noProducts;

    @FindBy(css = "i[class='icon-remove']")
    public WebElement xButtonUnderTheDelete;
}

