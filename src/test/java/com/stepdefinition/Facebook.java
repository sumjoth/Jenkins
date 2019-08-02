package com.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebook {
	static WebDriver driver;

	@Given("enter the fb url and facebook homepage")
	public void enter_the_fb_url_and_facebook_homepage() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\\\\\\\Selenium\\\\\\\\Company\\\\\\\\driver\\\\\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

	@When("enter the valid mail and password")
	public void enter_the_valid_mail_and_password() {
		driver.findElement(By.id("email")).sendKeys("j.ganeshkumar619@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("4545454");

	}

	@Then("click login button")
	public void click_login_button() throws IOException {
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\Screenshot//First.png");
		FileUtils.copyFile(src, dest);

	}

}
