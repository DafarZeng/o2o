package d.zhengheServlet.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")  //拦截所有请求
public class FirstFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter初始化了");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("拦截请求之前执行的方法1");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("拦截请求之后执行的方法2");
    }

    @Override
    public void destroy() {
        System.out.println("filter销毁了");
    }
}
