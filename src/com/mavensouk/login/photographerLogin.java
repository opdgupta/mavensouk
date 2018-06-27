package com.mavensouk.login;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class photographerLogin {

	public static void main(String[] args) {
		String exePath = "C:\\Users\\Deepti G\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver=new ChromeDriver();
        driver.get("http://www.mavensouk.co.in/");
        WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div[3]/ul/li[2]/a/span[1]"));
        element.click();
        fillInLoginDetails(driver);
       searchAnEvent(driver);
       test(driver);
       eventDetails(driver);
      
	}
	private static void fillInLoginDetails(WebDriver driver){
		
		
		driver.get("http://www.mavensouk.co.in/users/login");
		
		
		WebElement emailAdd=driver.findElement(By.id("login_email"));
		emailAdd.sendKeys("gurpinder@yahoo.co.in");
		
		WebElement password = driver.findElement(By.id("exampleInputPassword"));
		password.sendKeys("123456789");
		
		WebElement loginButton = driver.findElement(By.id("login_btn"));
		loginButton.click();	
	}
private static void searchAnEvent(WebDriver driver){
		
		
        WebElement element = driver.findElement(By.xpath("/html/body/main/aside/ul/li[5]/a"));
        element.click();
}
        
private static void test(WebDriver driver) {

	String sColValue = "ACTIVE";
	 String sRowValue="0";
	//First loop will find the 'ClOCK TWER HOTEL' in the first column
	for (int i=2;i<=3;i++){
		String sValue = null;
		sValue = driver.findElement(By.xpath("//*[@id=\"job-ajax\"]/tr["+i+"]/td[1]/div/span/span")).getText();
		if(sValue.equalsIgnoreCase(sColValue)){
			
			// If the sValue match with the description, it will initiate one more inner loop for all the columns of 'i' row 
			for (int j=1;j<=1;j++){
				String sValue1= driver.findElement(By.xpath("//*[@id=\"job-ajax\"]/tr["+i+"]/td[6]/div/p")).getText();
				System.out.println(sValue1);
				if(sValue1.equalsIgnoreCase(sRowValue))
				{
					driver.findElement(By.xpath("//*[@id=\"job-ajax\"]/tr["+i+"]/td[7]")).click();
					break;
				}
			}
		}
	}
		
	/*WebElement Webtable=driver.findElement(By.id("job-ajax")); // Replace TableID with Actual Table ID or Xpath
	List<WebElement> TotalRowCount=Webtable.findElements(By.id("job-ajax"));

	System.out.println("No. of Rows in the WebTable: "+TotalRowCount.size());*/
	// Now we will Iterate the Table and print the Values   
/*int RowIndex=1;
	for(WebElement rowElement:TotalRowCount)
	{
	      List<WebElement> TotalColumnCount=rowElement.findElements(By.xpath("//*[@id=\"job-ajax\"]/tr[2]/td[1]"));
	      int ColumnIndex=1;
	      String sRowValue = "ACTIVE";
	      String sRowValue1 = "0";
	      String sValue = null;
	      String sValue1=null;
	      for(WebElement colElement:TotalColumnCount)
	      {
	          
	    	 
	    	  System.out.println("Row "+RowIndex+" Column "+ColumnIndex+" Data "+colElement.getText());
	           sValue=colElement.getText();
	           ColumnIndex=ColumnIndex+5;
	           System.out.println(ColumnIndex);
	           System.out.println(sValue);
	           sValue1=colElement.getText();
				System.out.println(sValue1);*/
	          
	          /* if((sValue.equalsIgnoreCase(sRowValue)) && (sValue1.equalsIgnoreCase(sRowValue1))){
					// If the sValue match with the description, it will initiate one more inner loop for all the columns of 'i' row 
				System.out.println(sValue);
				System.out.println(sValue1);
			
				driver.findElement(By.xpath("//*[@id=\"job-ajax\"]/tr[2]/td[7]")).click();   
	           }*/
	    //  RowIndex=RowIndex+1;
	      
	  //    }
	     // driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div[5]/a")).click(); 
	     
	
	      
	//}
}
private static void eventDetails(WebDriver driver)
{
	driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div[5]/a")).click();
	 submitQuote(driver);
}
private static void submitQuote(WebDriver driver) {
	 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 WebElement photographyCharges=driver.findElement(By.xpath("//*[@id=\"bidding-table\"]/tbody/tr[2]/td[3]/div/input"));

	 
	 photographyCharges.sendKeys("2000");
	 
	 WebElement videographyCharges=driver.findElement(By.xpath("//*[@id=\"bidding-table\"]/tbody/tr[2]/td[4]/div/input"));
	 videographyCharges.sendKeys("5000");
	 WebElement delieverableCharges=driver.findElement(By.xpath("//*[@id=\"bidding-table\"]/tbody/tr[6]/td[2]/div/input"));
	 delieverableCharges.sendKeys("3000");
	 driver.findElement(By.xpath("//*[@id=\"form-bidding\"]/div[2]/button[3]")).click();
}

}
 	