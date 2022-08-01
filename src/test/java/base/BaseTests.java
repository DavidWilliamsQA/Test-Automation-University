package base;

import com.google.common.io.Files;
import org.junit.AfterClass;
import org.junit.*;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.HomePage;
import utils.WindowManager;

import java.io.File;

public class BaseTests {

    private static WebDriver driver;
    protected  HomePage homePage;


    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver(getChromeOptions());
        driver.manage().window().maximize();
        BaseTests base = new BaseTests();
        base.goHome();
        base.setCookie();
    }

    @Before
    public void goHome(){
        driver.get("http://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

    @Rule
    public TestWatcher watchman = new TestWatcher() {
        @Override
        protected void failed(Throwable e, Description description) {
            // Handle logging of failing tests
            System.out.println("Fail!");
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/screenshots/test.png"));
            }catch (Exception ex){
                ex.printStackTrace();
            }
            System.out.println("Screenshot saved in: " + screenshot.getAbsolutePath());
        }

        @Override
        protected void succeeded(Description description) {
            // Handle logging of succeeding tests
            System.out.println("Success!");
        }
    };

    private static ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
//        options.setHeadless(true);
        return options;
    }

    private void setCookie(){
        Cookie cookie = new Cookie.Builder("tau", "123").domain("the-internet.herokuapp.com").build();
        driver.manage().addCookie(cookie);
    }

}
