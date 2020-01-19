package pro10.sec03.ex01;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.awt.*;
import java.io.IOException;

//@WebFilter(value = "/pro10Sec03Login", filterName = "EncoderFilter")
public class EncoderFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("pro10 doFilter 호출");
        req.setCharacterEncoding("utf-8");
        String context = ((HttpServletRequest) req).getContextPath();
        String pathInfo = ((HttpServletRequest) req).getContextPath();
        String realPath = req.getRealPath(pathInfo);
        String msg = " Context 정보 " + context + "\n URI 정보 : " + pathInfo + "\n 물리적 경로: " + realPath;
        System.out.println(msg);
        long begin = System.currentTimeMillis();
        chain.doFilter(req, resp);

        long end = System.currentTimeMillis();
        System.out.println("작업 시간: " + (end - begin) + "ms");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
