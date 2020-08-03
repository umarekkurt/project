package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ReusableMethod {
    WebElement driver;
   public void selectMethod(WebElement element){

       Select select=new Select(element);
       select.selectByIndex(RandomMethod(select.getOptions().size()));
}

public int RandomMethod(int num){
    Random rnd=new Random();
   int randomNumber =rnd.nextInt(num-1)+1;

   return randomNumber;
}
    public void updateName(WebDriver driver, String firstName, String lastName){

        WebElement firstN = driver.findElement(By.cssSelector("ul.last_item>:nth-child(2)>:first-child"));
        WebElement lastN = driver.findElement(By.cssSelector("ul.last_item>:nth-child(2)>:last-child"));

        Assert.assertTrue(firstN.getText().equalsIgnoreCase(firstName));
        Assert.assertTrue(lastN.getText().equalsIgnoreCase(lastName));

    }
      public void listMethod(List<WebElement> elements ){
         String productName= elements.get(RandomMethod(elements.size())).getText();


          }



    public static List<String> WebElmentToString(List<WebElement> myElements){

        List<String> actualResultString = new ArrayList<>();

        for(WebElement eachElement:myElements){

            actualResultString.add(eachElement.getText());

        }

        return actualResultString;
    }

}
