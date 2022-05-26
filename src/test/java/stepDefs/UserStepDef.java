package stepDefs;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UserStepDef {
	
	WebDriver driver;
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login"); 
	}
//	@When("User enters login credentials")
//	public void user_enters_login_credentials() {
//	   driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
//	   driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//	   driver.findElement(By.className("radius")).click();
//	}
	@Then("user Should be navigated to Home Page")
	public void user_should_be_navigated_to_home_page() {
		boolean isValid = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
		Assert.assertTrue(isValid);
	}
//	@When("User enters {string} and {string}")
//	public void user_enters_and(String strUsername, String strPassword) {
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(strUsername);
//		driver.findElement(By.id("password")).sendKeys(strPassword);
//		driver.findElement(By.className("radius")).click();
//	}
	
//	@When("User enters login credentials")
//	public void user_enters_login_credentials(DataTable dataTable) {
//		List<List<String>> user = dataTable.asLists(); 
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user.get(0).get(0));
//		driver.findElement(By.id("password")).sendKeys(user.get(0).get(1));
//		driver.findElement(By.className("radius")).click();
//	}
	
	//Get Values as Maps
	@When("User enters login credentials")
	public void user_enters_login_credentials(DataTable dataTable) {
		List <Map<String, String>> user = dataTable.asMaps();
		String strUser = user.get(0).get("username");
		String strPwd =	user.get(0).get("password");	
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(strUser);
		driver.findElement(By.id("password")).sendKeys(strPwd);
		driver.findElement(By.className("radius")).click();
	}
}
