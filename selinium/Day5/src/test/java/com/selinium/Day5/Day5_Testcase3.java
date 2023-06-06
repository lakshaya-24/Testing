package com.selinium.Day5;

public class Day5_Testcase3 {


		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			String url="https://j2store.net/free/";
			driver.get(url);
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]")).click();

		}

