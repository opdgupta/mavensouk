package com.mavensouk.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
		//System.setProperty("webdriver.ie.driver", "C:/Program Files/Internet Explorer/iexplore.exe");
		//System.setProperty("webdriver.chrome.driver", "C:/Users/mb70fy/Backup/Personal/mavensouk/chrome.exe");
		//System.setProperty("webdriver.ie.driver", "C:/Program Files (x86)/Mozilla Firefox/firefox.exe");
		String exePath = "C:\\Users\\Deepti G\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
WebDriver driver=new ChromeDriver();
		
		//WebDriver driver =  new FirefoxDriver();

        // And now use this to visit Google
        driver.get("http://www.mavensouk.co.in/");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div[3]/ul/li[2]/a/span[1]"));
        element.click();
        fillInLoginDetails(driver);
        createAnEvent(driver);
        // Enter something to search for
       // element.sendKeys("Cheese!");

        // Now submit the form. WebDriver will find the form for us from the element
        //element.submit();

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        
        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
       /* (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });*/

        // Should see: "cheese! - Google Search"
        System.out.println("Page title is: " + driver.getTitle());
        
        //Close the browser
        //driver.quit();
    }
	
	private static void fillInLoginDetails(WebDriver driver){
		
			
		driver.get("http://www.mavensouk.co.in/users/login");
		
		
		WebElement emailAdd=driver.findElement(By.id("login_email"));
		emailAdd.sendKeys("pg220515@gmail.com");
		
		WebElement password = driver.findElement(By.id("exampleInputPassword"));
		password.sendKeys("123456");
		
		WebElement loginButton = driver.findElement(By.id("login_btn"));
		loginButton.click();
		
		
	}
	private static void createAnEvent(WebDriver driver){
		
		
        WebElement element = driver.findElement(By.xpath("/html/body/main/aside/ul/li[5]/a/span"));
        element.click();
        List<WebElement> elements= driver.findElements(By.id("dropdownMenu1"));
        element = elements.get(0);
        System.out.println("elemte tag name>>"+element.getTagName());
        //element = driver.findElement(By.id("dropdownMenu1"));
        element.click();		
        element = driver.findElement(By.linkText("Commercial"));
        //element.sendKeys("Commercial");
        element.click();
        List<WebElement> elements1= driver.findElements(By.id("dropdownMenu1"));
        element = elements1.get(1);
        element.click();
        element = driver.findElement(By.linkText("Aerial"));
        element.click();
      //  element.submit();
        element= driver.findElement(By.name("location"))		;
        element.sendKeys("Abohar");
       // Select select = new Select(driver.findElement(By.name("location")));
        //select.deselectAll();
      //  select.selectByVisibleText("Abohar");
        element=driver.findElement(By.name("bugdet_from"));
        element.sendKeys("1000");
        element=driver.findElement(By.name("bugdet_to"));
        element.sendKeys("10000");	
        element=driver.findElement(By.name("event_start"));
        element.clear();
        element.sendKeys("09/01/2018 10:45 PM");
        
        element=driver.findElement(By.name("event_end"));
        element.clear();
        element.sendKeys("10/02/2018 10:45 PM");
        
        element=driver.findElement(By.name("product_name"));
        element.sendKeys("ZARAAA");
        
        Select selectPhotography = new Select(driver.findElement(By.name("photography")));
        selectPhotography.selectByVisibleText("Yes");
        
        Select selectVideography = new Select(driver.findElement(By.name("videography")));
        selectVideography.selectByVisibleText("Yes");
        
        element=driver.findElement(By.name("no_of_product"));
        element.sendKeys("1");
            
        List<WebElement> elements2= driver.findElements(By.id("dropdownMenu1"));
        element = elements2.get(2);
        element.click();
        element = driver.findElement(By.linkText("Shiny"));
        element.click();
        
        element=driver.findElement(By.name("product_weight"));
        element.sendKeys("5");
        
        element=driver.findElement(By.name("product_size"));
        element.sendKeys("2");
        
        element=driver.findElement(By.name("background_color"));
        element.sendKeys("white");
        
        List<WebElement> elements3= driver.findElements(By.id("dropdownMenu1"));
        element = elements3.get(3);
        element.click();
        element = driver.findElement(By.linkText("Online"));
        element.click();
        
        List<WebElement> elements4= driver.findElements(By.id("dropdownMenu1"));
        element = elements4.get(4);
        element.click();
        element = driver.findElement(By.linkText("3"));
        element.click();
        
        Select selectTravelCost = new Select(driver.findElement(By.name("travel_cost")));
        selectTravelCost.selectByVisibleText("Include cost in the package");
        
        Select selectAccommodationCost = new Select(driver.findElement(By.name("accommodation_cost")));
        selectAccommodationCost.selectByVisibleText("Include cost in the package");
      
       List<WebElement> elements5= driver.findElements(By.className("icheckbox_flat"));
        element = elements5.get(1);
       System.out.println(element.getTagName());
        element.click();
        element= driver.findElement(By.xpath("//*[@id=\"post_job_form\"]/button"));
       
        element.click();
       
        
//        Select select = new Select(driver.findElement(By.name("phptography")));
//                select.deselectAll();
//        select.selectByVisibleText();

		
	}
}
