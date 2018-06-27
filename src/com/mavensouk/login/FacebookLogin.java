package com.mavensouk.login;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
      //  eventCommercial(driver);
       // eventWedding(driver);
       //eventBabiesandKids(driver);
       // eventFashionAndPortfolio(driver);
       // eventCorporateEvent(driver);
      //  eventSports(driver);
     //   eventFood(driver);
        eventSchoolCollege(driver);
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
	private static void createEvent1(WebDriver driver){
		
		WebElement element= driver.findElement(By.name("location"))		;
        element.sendKeys("Mumbai");
       
        element=driver.findElement(By.name("bugdet_from"));
        element.sendKeys("1000");
        
        element=driver.findElement(By.name("bugdet_to"));
        element.sendKeys("10000");	
        
        Select selectTravelCost = new Select(driver.findElement(By.name("travel_cost")));
        selectTravelCost.selectByVisibleText("Include cost in the package");
        
        Select selectAccommodationCost = new Select(driver.findElement(By.name("accommodation_cost")));
        selectAccommodationCost.selectByVisibleText("Include cost in the package");
      
        List<WebElement> elements5= driver.findElements(By.className("icheckbox_flat"));
        element = elements5.get(1);
        element.click();
	}
	
	private static void createEvent2(WebDriver driver){
		
		WebElement element=driver.findElement(By.name("event_start"));
        element.clear();
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
        Calendar calendar = Calendar.getInstance();
        Date today = calendar.getTime();
        calendar.add(Calendar.DAY_OF_YEAR, 2);  
        String tomorrow= dateFormat.format(calendar.getTime()); 
        System.out.println(today);
        System.out.println(tomorrow);
        element.sendKeys(tomorrow);
        
        element=driver.findElement(By.name("event_end"));
        element.clear();
        Date today1 = calendar.getTime();
        calendar.add(Calendar.DAY_OF_YEAR, 5);
        String tomorrow1= dateFormat.format(calendar.getTime()); 
        System.out.println(today1);
        System.out.println(tomorrow1);
        element.sendKeys(tomorrow1);
        
	}
	
	private static void createEvent3(WebDriver driver){
		
	 Select selectPhotography = new Select(driver.findElement(By.name("photography")));
     selectPhotography.selectByVisibleText("Yes");
     
     Select selectVideography = new Select(driver.findElement(By.name("videography")));
     selectVideography.selectByVisibleText("Yes");
	}
	
	private static void eventCommercial(WebDriver driver){
		
		
		driver.navigate().refresh();
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
        element= driver.findElement(By.name("location"));
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
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
        
        //get current date time with Date()
     //   Date date = new Date();
        
        // Now format the date
       // String date1= dateFormat.format(date);
        
        // Print the Date
     //   System.out.println(date1);
        
     //   element.sendKeys(date1);
        Calendar calendar = Calendar.getInstance();
        Date today = calendar.getTime();

        calendar.add(Calendar.DAY_OF_YEAR, 2);
         
        String tomorrow= dateFormat.format(calendar.getTime()); 
        System.out.println(today);
        System.out.println(tomorrow);
        element.sendKeys(tomorrow);
        element=driver.findElement(By.name("event_end"));
        element.clear();
        
       // Calendar calendar1 = Calendar.getInstance();
        Date today1 = calendar.getTime();

        calendar.add(Calendar.DAY_OF_YEAR, 5);
         
        String tomorrow1= dateFormat.format(calendar.getTime()); 
        System.out.println(today1);
        System.out.println(tomorrow1);
        element.sendKeys(tomorrow1);
        
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
	private static void eventWedding(WebDriver driver){
		
		driver.navigate().refresh();
		
		WebElement element = driver.findElement(By.xpath("/html/body/main/aside/ul/li[5]/a/span"));
        element.click();
        
        List<WebElement> elements= driver.findElements(By.id("dropdownMenu1"));
        element = elements.get(0);
        element.click();		
        element = driver.findElement(By.linkText("Wedding"));
        element.click();
        
        List<WebElement> elements1= driver.findElements(By.id("dropdownMenu1"));
        element = elements1.get(1);
        element.click();
        element = driver.findElement(By.linkText("Bachelor Party"));
        element.click();
     
        createEvent1(driver);
        createEvent2(driver);
   
        List<WebElement> elements3= driver.findElements(By.id("dropdownMenu1"));
        element = elements3.get(3);
        element.click();
        element = driver.findElement(By.linkText("Traditional"));
        element.click();
        
        List<WebElement> elements4= driver.findElements(By.id("dropdownMenu1"));
        element = elements4.get(4);
        element.click();
        element = driver.findElement(By.linkText("Traditional"));
        element.click();
               
        element=driver.findElement(By.name("gathering"));
        element.sendKeys("100");
            
        List<WebElement> elements2= driver.findElements(By.id("dropdownMenu1"));
        element = elements2.get(2);
        element.click();
        element = driver.findElement(By.linkText("Groom"));
        element.click(); 
        
        element= driver.findElement(By.xpath("//*[@id=\"post_job_form\"]/button"));
        element.click();
      	
	}
	private static void eventBabiesandKids(WebDriver driver){
		
		driver.navigate().refresh();
		
		WebElement element = driver.findElement(By.xpath("/html/body/main/aside/ul/li[5]/a/span"));
        element.click();
        
        List<WebElement> elements= driver.findElements(By.id("dropdownMenu1"));
        element = elements.get(0);
        element.click();		
        element = driver.findElement(By.linkText("Babies & Kids"));
        element.click();
        
        List<WebElement> elements1= driver.findElements(By.id("dropdownMenu1"));
        element = elements1.get(1);
        element.click();
        element = driver.findElement(By.linkText("Baby Shower"));
        element.click();
        element = driver.findElement(By.linkText("Birthday"));
        element.click();
     
        createEvent1(driver);
        
        createEvent2(driver);
        
        Select selectBabyAge = new Select(driver.findElement(By.name("baby_age")));
        selectBabyAge.selectByVisibleText("Pregnancy");
        
        createEvent3(driver);
                       
        element=driver.findElement(By.name("gathering"));
        element.sendKeys("100");
            
        element= driver.findElement(By.xpath("//*[@id=\"post_job_form\"]/button"));
        element.click();
      	}
	
	private static void eventFashionAndPortfolio(WebDriver driver) {
		
		driver.navigate().refresh();
		
		WebElement element = driver.findElement(By.xpath("/html/body/main/aside/ul/li[5]/a/span"));
        element.click();
        
        List<WebElement> elements= driver.findElements(By.id("dropdownMenu1"));
        element = elements.get(0);
        element.click();		
        element = driver.findElement(By.linkText("Fashion & Portfolio"));
        element.click();
        
        List<WebElement> elements1= driver.findElements(By.id("dropdownMenu1"));
        element = elements1.get(1);
        element.click();
        element = driver.findElement(By.linkText("Celebrity & Glamour"));
        element.click();
       
        createEvent1(driver);
        
        createEvent2(driver);
        
        element= driver.findElement(By.name("no_of_pics"))		;
        element.sendKeys("100");
        
        createEvent3(driver);
        
        List<WebElement> elements2= driver.findElements(By.id("dropdownMenu1"));
        element = elements2.get(2);
        element.click();
        element = driver.findElement(By.linkText("Indoor"));
        element.click();
        
        element= driver.findElement(By.xpath("//*[@id=\"post_job_form\"]/button"));
        element.click();
	}
	
	private static void eventCorporateEvent(WebDriver driver) {
		
		driver.navigate().refresh();
		
		WebElement element = driver.findElement(By.xpath("/html/body/main/aside/ul/li[5]/a/span"));
        element.click();
        
        List<WebElement> elements= driver.findElements(By.id("dropdownMenu1"));
        element = elements.get(0);
        element.click();		
        element = driver.findElement(By.linkText("Corporate Events"));
        element.click();
        
        List<WebElement> elements1= driver.findElements(By.id("dropdownMenu1"));
        element = elements1.get(1);
        element.click();
        element = driver.findElement(By.linkText("Annual Day"));
        element.click();
       
        createEvent1(driver);
        
        createEvent2(driver);
        
        element= driver.findElement(By.name("no_of_photographers"))		;
        element.sendKeys("2");
        
        element= driver.findElement(By.name("no_of_videographers"))		;
        element.sendKeys("2");
        
        createEvent3(driver);
        
        element=driver.findElement(By.name("gathering"));
        element.sendKeys("200");
        
        List<WebElement> elements2= driver.findElements(By.id("dropdownMenu1"));
        element = elements2.get(2);
        element.click();
        element = driver.findElement(By.linkText("Indoor"));
        element.click();
        
        element= driver.findElement(By.xpath("//*[@id=\"post_job_form\"]/button"));
        element.click();
	}
	
	private static void eventSports(WebDriver driver) {
	
		driver.navigate().refresh();
	
		WebElement element = driver.findElement(By.xpath("/html/body/main/aside/ul/li[5]/a/span"));
		element.click();
    
		List<WebElement> elements= driver.findElements(By.id("dropdownMenu1"));
		element = elements.get(0);
		element.click();		
		element = driver.findElement(By.linkText("Sports"));
		element.click();
    
		List<WebElement> elements1= driver.findElements(By.id("dropdownMenu1"));
		element = elements1.get(1);
		element.click();
		element = driver.findElement(By.linkText("Aerobics"));
		element.click();
   
	    createEvent1(driver);
	    
	    createEvent2(driver);
	    
	    element= driver.findElement(By.name("no_of_photographers"))		;
	    element.sendKeys("1");
	    
	    element= driver.findElement(By.name("no_of_videographers"))		;
	    element.sendKeys("1");
	    
	    createEvent3(driver);
	    
	    element=driver.findElement(By.name("gathering"));
	    element.sendKeys("50");
	    
	    element= driver.findElement(By.xpath("//*[@id=\"post_job_form\"]/button"));
	    element.click();
	}
	private static void eventFood(WebDriver driver) {
		
		driver.navigate().refresh();
	
		WebElement element = driver.findElement(By.xpath("/html/body/main/aside/ul/li[5]/a/span"));
		element.click();
    
		List<WebElement> elements= driver.findElements(By.id("dropdownMenu1"));
		element = elements.get(0);
		element.click();		
		element = driver.findElement(By.linkText("Food"));
		element.click();
    
		List<WebElement> elements1= driver.findElements(By.id("dropdownMenu1"));
		element = elements1.get(1);
		element.click();
		element = driver.findElement(By.linkText("Drinks"));
		element.click();
   
	    createEvent1(driver);
	    
	    createEvent2(driver);
	    
	    createEvent3(driver);
	    
	    element=driver.findElement(By.name("product_desc"));
	    element.sendKeys("Cocktail");
	    
	    element=driver.findElement(By.name("no_of_product"));
	    element.sendKeys("10");
	    
	    List<WebElement> elements2= driver.findElements(By.id("dropdownMenu1"));
		element = elements2.get(2);
		element.click();
		element = driver.findElement(By.linkText("3"));
		element.click();
		
		element=driver.findElement(By.name("background_color"));
	    element.sendKeys("Blue");
	    
	    List<WebElement> elements3= driver.findElements(By.id("dropdownMenu1"));
		element = elements3.get(3);
		element.click();
		element = driver.findElement(By.linkText("Online"));
		element.click();
	    
	    element= driver.findElement(By.xpath("//*[@id=\"post_job_form\"]/button"));
	    element.click();
	}
	
private static void eventSchoolCollege(WebDriver driver) {
		
		driver.navigate().refresh();
	
		WebElement element = driver.findElement(By.xpath("/html/body/main/aside/ul/li[5]/a/span"));
		element.click();
    
		List<WebElement> elements= driver.findElements(By.id("dropdownMenu1"));
		element = elements.get(0);
		element.click();		
		element = driver.findElement(By.linkText("School/College"));
		element.click();
    
		List<WebElement> elements1= driver.findElements(By.id("dropdownMenu1"));
		element = elements1.get(1);
		element.click();
		element = driver.findElement(By.linkText("Convocation"));
		element.click();
   
	    createEvent1(driver);
	    
	    createEvent2(driver);
	    
	    createEvent3(driver);
	    
	    element= driver.findElement(By.name("no_of_photographers"))		;
	    element.sendKeys("1");
	    
	    element= driver.findElement(By.name("no_of_videographers"))		;
	    element.sendKeys("1");
	    
	    element=driver.findElement(By.name("gathering"));
	    element.sendKeys("50");
	    
	    element= driver.findElement(By.xpath("//*[@id=\"post_job_form\"]/button"));
	    element.click();
	}
}
