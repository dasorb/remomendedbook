package com.showbook.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 配置登陆拦截器
 * 作用：使用当请求/login时，判断登陆状态，已登陆，直接跳转首页。
 * @author chenjie
 * @date 2019/3/7 0007 - 16:05
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        HttpSession session = request.getSession();
        String login_status = null;
        if(session.getAttribute("LOGIN_STATUS") != null) {
            login_status = session.getAttribute("LOGIN_STATUS").toString();
        }
        //如果用户已经登陆，跳转到首页
        if("ok".equals(login_status)) {
            try {
                response.sendRedirect(request.getContextPath()+"/index.jsp");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

}
