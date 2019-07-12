package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Lifetime {
	static WebDriver driver;

	@Given("the user want to click the url")
	public void the_user_want_to_click_the_url() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\\\\\\\\\\\\\\\Selenium\\\\\\\\\\\\\\\\Company\\\\\\\\\\\\\\\\driver\\\\\\\\\\\\\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.lifetime.life/");

	}

	@When("the user provide to click explore")
	public void the_user_provide_to_click_explore() {
		driver.findElement(By.xpath("(//a[@class=' nav-link    dropdown-toggle'])[3]")).click();

	}

	@Then("the user  want to click spa")
	public void the_user_want_to_click_spa() {
		driver.findElement(By.xpath("(//a[@class='dropdown-item '])[15]")).click();

	}

}
