import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class BaixarNfce {

    public static void main(String[] args) throws IOException, CsvException, InterruptedException {

        FileReader file = new FileReader("D:/Python/chavesFaltam");

        CSVReader csv = new CSVReader(file);
        List<String[]> chaves = csv.readAll();
        List<String[]> chave_nao_baixadas = null;
        List<String[]> chave_baixadas = null;

        System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        String url = "https://www4.fazenda.rj.gov.br/consultaDFe/paginas/resultadoDfeResumido.faces?cid=2";
        driver.get(url);

        for (String[] chave : chaves){
            chave_nao_baixadas.add(chave);
        }
        Thread.sleep(5000);

        for (String[] chave : chaves){
            System.out.println(chave[0]);

            url = "https://www4.fazenda.rj.gov.br/consultaDFe/paginas/consultaChaveAcesso.faces";
            driver.get(url);
            Thread.sleep(1000);

            WebElement elem = wait.until(webDriver -> driver.findElement(By.id("showphoto")));
        }
    }

}
