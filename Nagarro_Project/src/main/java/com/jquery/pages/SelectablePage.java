package com.jquery.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jquery.base.TestBase;

public class SelectablePage extends TestBase {

	public void selectablePage() {
		driver.findElement(By.xpath("//div[@id='sidebar']//a[text()='Selectable']")).click();
		System.out.println("link got selected");

	}

	public void selectItem1() {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement element1 = driver.findElement(By.xpath("//ol[@id='selectable']/li[text()='Item 1']"));
		element1.click();
		Boolean selected = element1.isEnabled();
		System.out.println("Item One is selected: " + selected);

	}

	public void selectItem5() {
		WebElement element1 = driver.findElement(By.xpath("//ol[@id='selectable']/li[text()='Item 5']"));
		element1.click();
		Boolean selected = element1.isEnabled();
		System.out.println("Item Five is selected: " + selected);

	}

	public void selectItem7() {
		WebElement element1 = driver.findElement(By.xpath("//ol[@id='selectable']/li[text()='Item 7']"));
		element1.click();
		Boolean selected = element1.isEnabled();
		System.out.println("Item Seven is selected: " + selected);

	}

}
