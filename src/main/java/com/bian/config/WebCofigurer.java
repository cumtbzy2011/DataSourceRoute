package com.bian.config;

import com.bian.util.CCutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author bianzy
 * @create 2017-07-18 17:51
 **/
@Configuration
public class WebCofigurer extends WebMvcConfigurerAdapter{
    @Autowired
    CCutil cCutil;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HandlerInterceptorAdapter() {
            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
                String cc = request.getParameter("CC");
                cCutil.set(cc);
                return super.preHandle(request, response, handler);
            }
        });
    }

}
