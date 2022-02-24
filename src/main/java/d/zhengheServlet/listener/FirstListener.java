package d.zhengheServlet.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/*配置listener同样是有两种方式，一种是使用注解扫描，一种是使用编写注册listener的方法。*/
@WebListener
public class FirstListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("项目启动，执行listener启动方法");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("项目销毁，执行销毁方法");
    }
}
