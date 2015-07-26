package BrowserMobProxyTrial;

import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.filters.ResponseFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserMobMain {

    public static void main(String[] args) {
        BrowserMobProxy browserMobProxy = new BrowserMobProxyServer();
        browserMobProxy.start(9999);

        // get the Selenium proxy object
        Proxy proxy = ClientUtil.createSeleniumProxy(browserMobProxy);

        // configure it as a desired capability
        //URL location = BrowserMobMain.class.getProtectionDomain().getCodeSource().getLocation();
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver/chromedriver");


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PROXY, proxy);

        browserMobProxy.newHar("http://www.sportsbet.com.au");

        // start the browser up
        WebDriver driver = new ChromeDriver();

        browserMobProxy.addResponseFilter(new ResponseFilter() {
            @Override
            public void filterResponse(io.netty.handler.codec.http.HttpResponse httpResponse, HttpMessageContents httpMessageContents, HttpMessageInfo httpMessageInfo) {
                if (httpMessageInfo.getUrl().endsWith("/dn.js")) {
                    System.out.println("Hi");
                }
            }
        });

        driver.get("http://www.sportsbet.com.au");

    }
}
