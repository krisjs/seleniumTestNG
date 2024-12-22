package com.learning.seleniumTestNG;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {
	private WebDriver driver;

	@BeforeClass
	public void setup() {
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
	}

	@Test
	public void openGoogle() {
		driver.get("https://www.google.com");
		 try {
	            Thread.sleep(5000); // Delay for 5 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	}
}
