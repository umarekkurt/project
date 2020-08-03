package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseDriver;
import utils.ReusableMethod;

public class Test1 extends BaseDriver {

    ReusableMethod reusableMethod=new ReusableMethod();
    /*
     Navigate to:  http://automationpractice.com/index.php

Click on sign in button +

Click on the my addresses +

Click on the add a new address +

Enter all the fields (Choose random items from the dropdown) +

Click on save button +

Verify your address is displayed in the website +

Click on the update button +

Change the first name and last name +

Click on the save button +

Verify first name and last name is updated +

Click on the delete button +

Click on the okay +

Verify address is removed from the website
     */

@Test
    public void Test1() throws InterruptedException {
    Test1Elements element=new Test1Elements(driver);
    ReusableMethod method=new ReusableMethod();
element.myAddressButton.click();

element.addNewAdress.click();

element.NewAdressFirstNAme.clear();
element.NewAdressFirstNAme.sendKeys("yusuf");

element.NewAdressLastNAme.clear();
element.NewAdressLastNAme.sendKeys("turkgenc");

element.NewAdressCompany.clear();
element.NewAdressCompany.sendKeys("techno");

element.NewAdressAdress1.sendKeys("izmir ");

element.NewAdressAdress2.sendKeys("izmir");

element.NewAdressCity.sendKeys("alsancak");

method.selectMethod(element.NewAdressState);

element.NewAdressPostaCode.sendKeys("12345");



element.NewAdressPhone.sendKeys("5706574433");

element.NewAdressMobilePhone.sendKeys("46785434422");

element.NewAdressInformation.sendKeys("nothing");

element.NewAdressReference.clear();
element.NewAdressReference.sendKeys("blabla");

element.NewAdressSave.click();

Assert.assertEquals(element.verify.getText(),"BLABLA");

element.UpdateButton.click();

element.NewFirstNAme.clear();
element.NewFirstNAme.sendKeys("aysenur");

element.NewLastNAme.clear();
element.NewLastNAme.sendKeys("kocakurt");

element.SaveButton.click();

method.updateName(driver,"aysenur","kocakurt");

element.DeleteButton.click();


driver.switchTo().alert().accept();


}

}
