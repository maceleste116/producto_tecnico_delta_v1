package qa.conf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "qa")
public class DriverConfig {
    @Bean
    public WebDriver webDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\berdinas\\IdeaProjects\\delta_sprint_3\\delta_producto_tecnico_v1\\drivers\\chromedriver.exe");
        return new ChromeDriver();
    }


}
