package com.neusoft.platform.web;

import com.neusoft.enjoy.web.executor.ParameterAction;
import com.neusoft.enjoy.web.executor.ParameterHandler;
import com.neusoft.enjoy.web.utils.RequestVars;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by will on 17-5-22.
 */
@Component
public class WebRegistry implements InitializingBean {


    @Override
    public void afterPropertiesSet() throws Exception {
        ParameterHandler.register("username", new ParameterAction<String>() {
            @Override
            public String action(Map<String, Object> map, HttpServletRequest httpServletRequest) {
                String userId=RequestVars.getSessionUserId(httpServletRequest);
                return "小红";
            }
        });
    }
}
