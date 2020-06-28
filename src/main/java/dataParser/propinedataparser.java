package dataParser;


import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;

public class propinedataparser {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
			ChromeDriver driver = new ChromeDriver();
			String website = "https://vast-dawn-73245.herokuapp.com/";
			List <String> month = Arrays.asList("jan", "feb","mar","apr","may", "jun", "jul", "aug", "sep", "oct", "nov", "dec");
			for(String mon: month) {
			for(int date=1;date <= 31;date++) {
				driver.get(website);
				String dateFormat = date+"/" + mon + "/" +2020;
				System.out.println(dateFormat);
				driver.findElementByClassName("form-control").sendKeys(dateFormat);
				driver.findElementByXPath("//input[@class='btn btn-default']").click();
				Thread.sleep(3000);
				String dateValue = driver.findElementByXPath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]").getText();
				System.out.println(dateValue);
		}
	}

}
}
