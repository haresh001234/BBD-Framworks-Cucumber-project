package definition1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdefinition1 {
	public static String url ="https://demo.guru99.com/test/newtours/login.php";
	WebDriver driver;
	ExtentHtmlReporter htmlreporter;
	ExtentReports Extent;
	ExtentTest test;
	@Given("I should be in the login page of the Guru99")
	public void i_should_be_in_the_login_page_of_the_guru99() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@And("Enter the user name")
	public void enter_the_user_name() {
		htmlreporter =new ExtentHtmlReporter("Extent.html");
	    Extent = new ExtentReports();
		Extent.attachReporter(htmlreporter);
		test=Extent.createTest("Guru report");
		driver.findElement(By.name("userName")).sendKeys("user");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		test.pass("usersname entered ");
	}
	@And("Enter the Password")
	public void enter_the_password() {
		driver.findElement(By.name("password")).sendKeys("user");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		test.pass("usersname entered password");
	}
	@When("click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.name("submit")).click(); 
		test.pass("usersname entered login button");
	}
	@And("click on the register page")
	public void click_on_the_register_page() {
		driver.findElement(By.linkText("REGISTER")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		test.pass("usersname entered register buttton");
	}
	@And("enter the first name")
	public void enter_the_first_name() {
		driver.findElement(By.name("firstName")).sendKeys("haresh");
		test.pass("usersname entered first name");
	}
	@And("enter the last name")
	public void enter_the_last_name() {
		driver.findElement(By.name("lastName")).sendKeys("G");
		test.pass("usersname entered last name");
	   
	}

	@And("enter the phone number")
	public void enter_the_phone_number() {
		driver.findElement(By.name("phone")).sendKeys("9159199318");
		test.pass("usersname entered phone number");
	   
	}

	@And("enter the email")
	public void enter_the_email() {
		driver.findElement(By.name("userName")).sendKeys("haresh@gamil.com");
		test.pass("usersname entered email");
	    
	}

	@And("enter the address")
	public void enter_the_address() {
		driver.findElement(By.name("address1")).sendKeys("no41:chennai");
		test.pass("usersname entered address");
	}

	@And("enter the city")
	public void enter_the_city() {
		driver.findElement(By.name("city")).sendKeys("chennai");
		test.pass("usersname entered city");
	}

	@And("enter the state")
	public void enter_the_state() {
		driver.findElement(By.name("state")).sendKeys("tamilnadu");
		test.pass("usersname entered state");
	
	}
	@And("enter the postal code")
	public void enter_the_postal_code() {
		driver.findElement(By.name("postalCode")).sendKeys("6001102");
		test.pass("usersname entered ostal code");
	}

	@And("enter the country")
	public void enter_the_country() {
		WebElement contr=driver.findElement(By.name("country"));
		Select opt=new Select(contr);
		opt.selectByIndex(5);
		test.pass("usersname entered coutry");
	
	}

	@And("enter the user n")
	public void enter_the_user_n() {
		driver.findElement(By.name("email")).sendKeys("haresh@gmail.com");
		test.pass("usersname entered email id");
	}

	@And("enter the pass")
	public void enter_the_pass() {
		driver.findElement(By.name("password")).sendKeys("1234567");
		test.pass("usersname entered password");
	}

	@And("enter the confirm password")
	public void enter_the_confirm_password() {
		driver.findElement(By.name("confirmPassword")).sendKeys("1234567");
		test.pass("usersname entered confirm password");
	}
	@When("click on the submit button")
	public void click_on_the_submit_button() {
		driver.findElement(By.name("submit")).click();
		test.pass("users entered submit button");
	  
	}

	@Then("I should see the title as {string}")
	public void i_should_see_the_title_as(String string) {
		System.out.println("title: "+driver.getTitle());
		test.pass("match the title");
		Extent.flush();
		driver.close();
	}
}
