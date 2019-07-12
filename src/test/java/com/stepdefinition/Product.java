package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Product {
	static WebDriver driver;

	@Given("i want to click the url")
	public void i_want_to_click_the_url() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\\\\\\\Selenium\\\\\\\\Company\\\\\\\\driver\\\\\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/?ie=UTF8&tag=googinabkvernac-21&ascsubtag=_k_CjwKCAjwvJvpBRAtEiwAjLuRPQ9iUdy3fPnV8Nd6ENTYJEWqoikMxO7bAYCCRuUvk0hZ_fHd9hOIahoCL28QAvD_BwE_k_&ext_vrnc=hi&gclid=CjwKCAjwvJvpBRAtEiwAjLuRPQ9iUdy3fPnV8Nd6ENTYJEWqoikMxO7bAYCCRuUvk0hZ_fHd9hOIahoCL28QAvD_BwE");

	}

	@Given("i want to search apple watches and click it")
	public void i_want_to_search_apple_watches_and_click_it() {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("apple watches");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@When("i want search some watches")
	public void i_want_search_some_watches() {
		driver.findElement(By.xpath("//img[@class='s-image']")).click();
	}

	@Then("to add the cart")
	public void to_add_the_cart() {
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();

	}

}
