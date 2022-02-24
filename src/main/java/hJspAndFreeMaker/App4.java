package hJspAndFreeMaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*启动器存放的位置。启动器可以和 controller 位于同一个包下，或者位于 controller 的上一级 包中，
但是不能放到 controller 的平级以及子包下。
并且需要放在包下*/

/*启动程序，浏览器直接访问http://localhost:8080/hallo即可*/
@SpringBootApplication
public class App4 {
    public static void main(String[] args) {
        SpringApplication.run(App4.class,args);
    }
}
