package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.utility.Log;

public class General extends Global{
public void OpenApplication() {
	System.setProperty("webdriver.chrome.driver", "D:\\driver2\\chromedriver2\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to(url);
System.out.println("Application Opened");
Reporter.log("Application Opened");
Log.info("Application Opened");
}
public void CloseApplication() {
	driver.close();
	System.out.println("Application Closed");
	Reporter.log("Application Closed");
	Log.info("Application Closed");
}
public void Login() throws Exception {
	driver.findElement(By.name(txt_login)).sendKeys(un);
	driver.findElement(By.name(txt_password)).sendKeys(pw);
	driver.findElement(By.name(btn_submit)).click();
	Thread.sleep(3000);
	System.out.println("Login Completed");
	Reporter.log("Login Completed");
	Log.info("Login Completed");
}
public void Logout() throws Exception {
	driver.findElement(By.id(btn_welcome)).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText(link_logout)).click();
	System.out.println("Logout Completed");
	Reporter.log("Logout Completed");
	Log.info("Logout Completed");
}
public void AddEmp() {
	System.out.println("new Emp Added");
	Reporter.log("New emp Added");
	Log.info("New Emp Added");
}
public void DelEmp() {
	System.out.println("Delete Emp");
	Reporter.log("Delete Emp");
	Log.info("Delete emp");
}
}
