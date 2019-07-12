package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Flip {
	static WebDriver driver;

	@Given("i want to write a url")
	public void i_want_to_write_a_url() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\\\\\\\\\\\\\\\Selenium\\\\\\\\\\\\\\\\Company\\\\\\\\\\\\\\\\driver\\\\\\\\\\\\\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}

	@When("i want to login flipkart page")
	public void i_want_to_login_flipkart_page() {
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("9677700348");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("jothisumathi");
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();

	}

	@When("i want to choose mens wear")
	public void i_want_to_choose_mens_wear() {
		WebElement mouse = driver.findElement(By.xpath("//span[text()='Men']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(mouse).perform();

	}

	@Then("i choose to topwears")
	public void i_choose_to_topwears() {
		driver.findElement(By.xpath("//a[text()='Top wear']")).click();

	}

}
