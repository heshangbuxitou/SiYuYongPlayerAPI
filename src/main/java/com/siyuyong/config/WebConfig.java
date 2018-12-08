package com.siyuyong.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.siyuyong.cache.CustomizedConcurrentMapCacheManager;
import com.siyuyong.constant.Constant;
import com.siyuyong.interceptor.HeaderInterceptor;
import com.siyuyong.interceptor.UserInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.cache.interceptor.SimpleKeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * WebConfig class
 *
 * @author zhu.yong
 * @date 2018/11/25
 */
@Configuration
public class WebConfig {

    @Autowired
    Environment environment;

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            // cors 配置
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        .allowCredentials(true)
                        .allowedMethods("GET", "POST", "DELETE", "PUT", "OPTIONS")
                        .maxAge(3600);
            }

            // 拦截器 配置
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                if(environment.containsProperty("player.server.header.interceptor")){
                    registry.addInterceptor(headerInterceptor()).addPathPatterns("/**");
                }
                registry.addInterceptor(userInterceptor()).addPathPatterns(Constant.USER_FILTER_URLS);
            }
        };
    }

    @Bean
    public HandlerInterceptor headerInterceptor(){
        return new HeaderInterceptor();
    }

    @Bean
    public HandlerInterceptor userInterceptor(){
        return new UserInterceptor();
    }

    /**
     *  使用@Bean注入fastJsonHttpMessageConvert
     * @return HttpMessageConverters
     */
    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters(){
        //1.需要定义一个Convert转换消息的对象
        FastJsonHttpMessageConverter fastConverter=new FastJsonHttpMessageConverter();
        //2.添加fastjson的配置信息，比如是否要格式化返回的json数据
        FastJsonConfig fastJsonConfig=new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        //3.在convert中添加配置信息
        fastConverter.setFastJsonConfig(fastJsonConfig);

        HttpMessageConverter<?> converter=fastConverter;
        return new HttpMessageConverters(converter);
    }

    @Bean
    public CustomizedConcurrentMapCacheManager cacheManager() {
        CustomizedConcurrentMapCacheManager cacheManager = new CustomizedConcurrentMapCacheManager();
        cacheManager.setDefaultExpiration(60);
        Map<String, Long> expiresMap = new HashMap<>(32);
        expiresMap.put("Cache", 5L);
        cacheManager.setExpires(expiresMap);
        return cacheManager;
    }

    @Bean
    public KeyGenerator keyGenerator() {

        return new SimpleKeyGenerator();
    }
}
