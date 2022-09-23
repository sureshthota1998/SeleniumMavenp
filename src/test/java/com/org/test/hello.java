package com.org.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class hello {
	@Test
	public static void mytest() {	
		//  Set the system property  
	            System.setProperty("webdriver.chrome.driver", 
	                "D:\\NetbeansProjects\\Selenium_MavenProject\\Drivers\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
	        //  maximize the window  
		    driver.manage().window().maximize();
	        //  open the browser and enter the test URL
		    driver.get("https://www.amazon.in/");
	            System.out.println(driver.getTitle()); 
	            System.out.println("The amazon site launched");
	            System.out.println("By using TestNG");
		}

}
