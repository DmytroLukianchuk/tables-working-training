import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by qa1 on 1/14/16.
 */
public class Drivers {
    public static final String MAIN_PAGE_URL = "http://comments.azurewebsites.net/";

    WebDriver driver = new FirefoxDriver();

    public Drivers() {
        PageFactory.initElements(driver, this);
    }


    @Before
    public void setUp() throws Exception {
        driver.get(MAIN_PAGE_URL);
    }

    @After
    public void tearDown() throws Exception {
        driver.close();

    }

    @FindBy(xpath = "")




}
