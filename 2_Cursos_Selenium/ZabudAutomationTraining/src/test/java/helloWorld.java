import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class helloWorld {

    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/windows/chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.manage().window().setSize(new Dimension(1500, 1200));
        wd.get("https://www.google.com");
        wd.findElement(By.xpath("//input[@name='q']")).sendKeys("amazon", Keys.ENTER);
        wd.findElement(By.xpath("//span[contains(.,'Compras en Línea de Electrónicos, Ropa ... - Amazon.com')]")).click();
        wd.findElement(By.xpath("//span[@class='nav-line-2 nav-long-width']")).click();
        wd.findElement(By.xpath("//input[@name='email']")).sendKeys("frank_vega25@hotmail.com", Keys.ENTER);
        wd.findElement(By.xpath("//input[@name='password']")).sendKeys("P@ssw0rd", Keys.ENTER);

        boolean result = false;

        try {

            if (wd.findElement(By.xpath("//span[contains(.,'Francisco')]")).isDisplayed()) {
                result = true;
                System.out.println("Prueba exitosa, el elemento fue encontrado");
            } else {
                System.out.println("Prueba fallida, el elemento no fue encontrado");
            }

        } catch (NoSuchElementException ns) {
            System.out.println("Prueba fallida, el elemento no existe");
        }

        Thread.sleep(5000);
        wd.quit();

    }

}
