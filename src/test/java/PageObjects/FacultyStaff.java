package PageObjects;

import NauWebProject.Base;
import NauWebProject.Driver;
import NauWebProject.SeleniumUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FacultyStaff extends Base {

    By fsDropdown = By.xpath("//span[text()='Faculty & Staff']");
    WebElement facultyLink = seleniumUtil.findElement(fsDropdown);
    WebElement dropdownMenu = seleniumUtil.findElement(By.cssSelector("ul.ubermenu-submenu.ubermenu-submenu-id-896.ubermenu-submenu-type-auto.ubermenu-submenu-type-mega.ubermenu-submenu-drop.ubermenu-submenu-align-full_width"));

    public void hoverOver(){
        seleniumUtil.getActions().moveToElement(facultyLink).build().perform();
    }
    public void verifyColorChange() throws InterruptedException {

        System.out.println("Color before hover: " + facultyLink.getCssValue("color"));
        String beforeHover = facultyLink.getCssValue("color");
        hoverOver();
        Thread.sleep(2000);
        System.out.println("Color after hover: " + facultyLink.getCssValue("color"));
        String afterHover = facultyLink.getCssValue("color");
        Assert.assertFalse(afterHover.equals(beforeHover));

    }
    public boolean isButtonClickable(){

       try
       {
           WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
           wait.until(ExpectedConditions.elementToBeClickable(fsDropdown));
           return true;
       }
       catch (Exception e)
       {
           return false;
       }

   }

   public void isDropdownVisible(){
        hoverOver();
        Assert.assertTrue(dropdownMenu.isDisplayed());
   }



}
