package com.selinium.Day5;

public class Day5_Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.getTitle().contains("Home");
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.quit();

	}

}
