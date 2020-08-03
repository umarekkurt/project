package testNG;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseDriver;
import utils.ReusableMethod;

public class Test2 extends BaseDriver {
    WebDriverWait wait;
        /*
Navigate to:  http://automationpractice.com/index.php
Click on sign in button
Enter the Email Address and Password (Create your own account from left side)
Click on sign in button

Click on dresses  +
Click on any item  +
Click on the add to wishlist +

Click on the user name on the top right  (Next to sign out button ) +

Click on "My WISHLIST" button +

Verify Item is in the wishlist +

Click on X button under the Item picture +

Verify item is not in the wishlist anymore +

Click on the X button under the Delete column

Click on the OK button





     */
@Test
    public void Test2() throws InterruptedException {
    Test2Elements elements=new Test2Elements(driver);
    ReusableMethod method=new ReusableMethod();


    elements.Dresses.click();

    elements.anyItems.get(method.RandomMethod(elements.anyItems.size())).click();

    Thread.sleep(5000);
   elements.addWishList.click();

    elements.closeButton.click();

    Thread.sleep(3000);
   elements.userName.click();


    elements.myWihList.click();

    elements.wishListButton.click();

    Assert.assertNotNull(elements.verifyTitle.getText());

    elements.Xbutton.click();

    elements.myWishListTable.click();


     Thread.sleep(3000);
    Assert.assertEquals(elements.noProducts.getText(),"No products");



    elements.xButtonUnderTheDelete.click();

    driver.switchTo().alert().accept();
}

}
