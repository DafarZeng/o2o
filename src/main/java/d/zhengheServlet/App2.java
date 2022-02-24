package d.zhengheServlet;

import d.zhengheServlet.filter.FirstFilter;
import d.zhengheServlet.listener.FirstListener;
import d.zhengheServlet.servlet.ThirdServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;

import javax.servlet.ServletRegistration;

@SpringBootApplication
public class App2 {
    public static void main(String[] args) {
        SpringApplication.run(App2.class,args);

    }

    //注册serlvet组件的方法，使用该方法，所有用注解配置映射的servlet都会被扫描到
    public ServletRegistrationBean getServletRegistration(){
        ServletRegistrationBean servletRegistration = new ServletRegistrationBean(new ThirdServlet());
        servletRegistration.addUrlMappings("/ts");
        return  servletRegistration;
    }

    //注册listener组件的方法，使用该方法，所有用注解配置映射的listener都会被扫描到
    public ServletListenerRegistrationBean getservletListener(){
        ServletListenerRegistrationBean servletListener = new ServletListenerRegistrationBean(new FirstListener());
        return  servletListener;
    }

    //注册filter组件的方法，使用该方法，所有用注解配置映射的fliter都会被扫描到
    public FilterRegistrationBean getFilterRegistration(){
        FilterRegistrationBean filterRegistration = new FilterRegistrationBean(new FirstFilter());
        return  filterRegistration;
    }
}
