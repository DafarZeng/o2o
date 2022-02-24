package d.zhengheServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/*第一种整合servlet，filter，listener的方法：直接在启动类上加上@ServletComponentScan。在servlet，filter，listener上加上
* @WebServlet标签，WebFilter标签，WebListener标签*/
@SpringBootApplication
@ServletComponentScan
public class App1 {
    public static void main(String[] args) {
        SpringApplication.run(App1.class,args);
    }
}
