package com.siyuyong.config;

import com.siyuyong.cache.CustomizedConcurrentMapCacheManager;
import com.siyuyong.interceptor.HeaderInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.cache.interceptor.SimpleKeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.HashMap;
import java.util.Map;

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
                    registry.addInterceptor(new HeaderInterceptor()).addPathPatterns("/**");
                }
            }
        };
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
