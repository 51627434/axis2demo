package com.example.axis2demo;

import org.apache.axis2.transport.http.AxisServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AxisConfig {

    @Bean
    public ServletRegistrationBean axisServlet(){

        System.out.println("tttttttttttttttttttt");
        ServletRegistrationBean axisServlet = new ServletRegistrationBean();
        axisServlet.setServlet(new AxisServlet());
        axisServlet.addUrlMappings("/services/*");
        // 设置服务路径，主要用于读取生成的services.xml文件，注意这里的serviesPath为保持和resouse下文件名一致
        String path = this.getClass().getResource("/servicesPath").getPath();
        System.out.println("servics路径："+path);
        axisServlet.addInitParameter("axis2.repository.path", path);
        axisServlet.setLoadOnStartup(1);

        return axisServlet;
    }
}
