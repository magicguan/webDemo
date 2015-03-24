package com.sunday.webDemo.web.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * function description.
 * <p><h2>Change History</h2>
 * 2014/8/11 | G | created
 * </p>
 *
 * @author G
 * @version 1.0.0
 */
public class EasyInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("a");
        return super.preHandle(request, response, handler);
    }
}
