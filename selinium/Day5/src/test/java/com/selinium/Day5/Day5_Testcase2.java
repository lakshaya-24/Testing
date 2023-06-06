package com.selinium.Day5;

public class Day5_Testcase2 {

	// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			private void WebDriver() {
				// TODO Auto-generated method stub

			} driver = new ChromeDriver();
			String url="https://j2store.net/free/";
			driver.get(url);
			driver.manage().window().maximize();
			Thread.sleep(1000);
			System.out.println(driver.getCurrentUrl());
			String newurl="https://j2store.net/free/";
			if(driver.getCurrentUrl().equals(newurl))
			{
				System.out.println("Valid url");
			}
			else
			{
				System.out.println("Invalid url");
			}
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]")).click();
			Thread.sleep(1000);
			String curl="https://j2store.net/free/index.php/shop?filter_catid=11";
			if(driver.getCurrentUrl().equals(curl))
			{
				System.out.println("Valid url");
			}
			else
			{
				System.out.println("Invalid url");
			}
			Thread.sleep(1000);
			driver.quit();

		}

	};
}
