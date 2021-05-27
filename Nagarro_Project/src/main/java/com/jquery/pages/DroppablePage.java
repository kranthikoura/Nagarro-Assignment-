package com.jquery.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jquery.base.TestBase;

public class DroppablePage extends TestBase {

	@FindBy(id = "draggable")
	WebElement from;

	@FindBy(id = "droppable")
	WebElement to;

	public void selectDroppableButton() {
		driver.findElement(By.xpath("//div[@id='sidebar']//a[text()='Droppable']")).click();
		System.out.println("Droppable button is clicked");
		String text = driver.findElement(By.xpath("//div[@id='content']//h1[text()='Droppable']")).getText().trim();
		System.out.println("Droppable Page Title: " + text);
	}

	public void dragAndDrop() {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement from = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement to = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(from, to).build().perform();
		System.out.println("Element is successfully dropped!!!");

	}

}
