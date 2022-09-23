package com.org;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Launch_Browser {
    @Test
    public void amazonTest() {
//    public static void main(String[] args) {
//    public static void main(String[] args) {	
	//  Set the system property  
//            System.setProperty("webdriver.chrome.driver", 
//                "D:\\NetbeansProjects\\Selenium_MavenProject\\Drivers\\chromedriver.exe");
            WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        //  maximize the window  
	    driver.manage().window().maximize();
        //  open the browser and enter the test URL
	    driver.get("https://www.amazon.in/");
            System.out.println(driver.getTitle()); 
            System.out.println("The amazon site launched");
	}
}