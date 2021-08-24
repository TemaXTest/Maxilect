package com.maxilect;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMaxilect extends WebDriverSettings {

    @Test
    public void maxilectCom() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://maxilect.ru/");

        WebElement projects = driver.findElementByXPath("//*[@id='menu-item-89']/a");
        projects.sendKeys(Keys.ENTER);
        Thread.sleep(500);

        WebElement blockchein = driver.findElementByXPath("//*[@id='filters']/li[10]/a");
        blockchein.sendKeys(Keys.ENTER);
        Thread.sleep(500);

        if(driver.findElements(By.xpath("//*[@id='portfolio']/div/div[3]/div[2]/div[22]")).size() != 0){
            System.out.println("Element is Present");
        }else{
            System.out.println("Element is Absent");
        }

        if(driver.findElements(By.xpath("//*[@id='portfolio']/div/div[3]/div[2]/div[29]")).size() != 0){
            System.out.println("Element is Present");
        }else{
            System.out.println("Element is Absent");
        }

        driver.get("https://maxilect.ru/");
        Thread.sleep(500);

        WebElement projectsB = driver.findElementByXPath("//*[@id='projects']/div[2]/div[3]/div/a");
        projectsB.sendKeys(Keys.ENTER);

        blockchein = driver.findElementByXPath("//*[@id='filters']/li[10]/a");
        blockchein.sendKeys(Keys.ENTER);
        Thread.sleep(500);

        if(driver.findElements(By.xpath("//*[@id='portfolio']/div/div[3]/div[2]/div[22]")).size() != 0){
            System.out.println("Element is Present");
        }else{
            System.out.println("Element is Absent");
        }

        if(driver.findElements(By.xpath("//*[@id='portfolio']/div/div[3]/div[2]/div[29]")).size() != 0){
            System.out.println("Element is Present");
        }else{
            System.out.println("Element is Absent");
        }
    }

}
