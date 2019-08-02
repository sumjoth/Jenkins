package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Webtable {
	static WebDriver driver;

	@Given("to launch the browser")
	public void to_launch_the_browser() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\\\\\\\Selenium\\\\\\\\Company\\\\\\\\driver\\\\\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();

	}

	@When("to execute the scripts")
	public void to_execute_the_scripts() {
	/*	List<WebElement> tRow = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < tRow.size(); i++) {
			List<WebElement> tData = driver.findElements(By.tagName("td"));
			for (int j = 0; j < tData.size(); j++) {
				if (tData.get(j).getText().equals("2")) {/*
					WebElement n = driver.findElement(
							By.xpath("//table[@class='tsc_table_s13']//tr[@class='odd']//td[text()='2']//preceding::th[text()='Clock Tower Hotel']"));
					System.out.println(n.getText());

				}

			}

		}

	}

	@Then("to validate")
	public void to_validate() {
		driver.quit();

	}

}
