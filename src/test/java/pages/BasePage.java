package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    // static hace que haya un solo valor para todas las instancias de esta clase.
    // Es decir, una sola instancia de WebDriver compartida para todas las clases
    protected static WebDriver driver;
    private static WebDriverWait wait;

    // bloque estatico que se va a ejecutar al comienzo
    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\practicas\\java-selenium\\practica-ger\\src\\main\\resources\\drivers\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //Constructor
    public BasePage(WebDriver driver) {

        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public static void navigateTo(String url) {
        driver.get(url);
    }

    // No quiero instanciar los webelements desde cada pagina sino que lo quiero hacer una sola vez desde aqui
    // y luego, usar la herencia
    private WebElement Find(String locator){
        // Aqui seteamos un wait general que va a hacer que espere hasta que el elemento sea visible o que alcance el limite de 10 segundos que seteamos más arriba.
        // <<*>> Esto obviamente nos limita a usar la localizancion mediante XPATH
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    // Como el click es un método extremadamente usado, lo definieroms en esta base Page pasandole como parámetro el
    // webElement que retorna la funcion de arriba.
    public void clickElement(String locator){
        Find(locator).click();
    }

    public void write(String locator, String textToWrite){
        Find(locator).clear();
        Find(locator).sendKeys(textToWrite);
    }

    public void selectFromDropDownByValue(String locator, String valueToSelect){
        Select dropdown = new Select (Find(locator));
        dropdown.selectByValue(valueToSelect);
    }

    public void selectFromDropDownByIndex(String locator, int valueToSelect){
        Select dropdown = new Select (Find(locator));
        dropdown.selectByIndex(valueToSelect);
    }

    public void selectFromDropDownByText(String locator, String textToSelect){
        Select dropdown = new Select (Find(locator));
        dropdown.selectByVisibleText(textToSelect);
    }

}
