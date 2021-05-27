package com.jquery.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.jquery.base.TestBase;

public class ControlgroupPage extends TestBase{


public void controlgroupPage(){
	driver.findElement(By.xpath("//div[@id='sidebar']//a[text()='Controlgroup']")).click();
	System.out.println("Selected control Group link");

}


public void selectAutomaticRadioButton() {
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	WebElement element1 = driver.findElement(By.xpath("//label[@for='transmission-automatic']/span[@class='ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank']"));
	element1.click();
	Boolean selected = element1.isEnabled();
	System.out.println("Automatic is selected: " +selected);
}

public void selectInsuranceRadioButton() {
	WebElement element1 = driver.findElement(By.xpath("//label[@for='insurance']/span[@class='ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank']"));
	element1.click();
	Boolean selected = element1.isEnabled();
	System.out.println("Insurance is selected: " +selected);
	
}

public void selectStandardRadioButton() {
	WebElement element1 = driver.findElement(By.xpath("//label[@for='transmission-standard-v']/span[@class='ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank']"));
	element1.click();
	Boolean selected = element1.isEnabled();
	System.out.println("Standard is selected: " +selected);
}


public void selectInsuranceCheckBox() {
	WebElement element1 = driver.findElement(By.xpath("//label[@for='insurance-v']/span[@class='ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank']"));
	element1.click();
	Boolean selected = element1.isEnabled();
	System.out.println("Insurance check box is selected: " +selected);
	
}

public void clickBookNowButton() {
	driver.findElement(By.xpath("//button[@id='book']")).click();
	
	
}
	

}
