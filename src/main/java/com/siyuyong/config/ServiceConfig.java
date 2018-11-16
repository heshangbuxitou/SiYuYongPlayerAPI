package com.siyuyong.config;

import com.siyuyong.service.NeteaseReplayService;
import com.siyuyong.service.QQReplayService;
import com.siyuyong.service.ReplayService;
import com.siyuyong.service.XiamiReplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class ServiceConfig {

    @Autowired
    NeteaseReplayService neteaseReplayService;

    @Autowired
    QQReplayService qQReplayService;

    @Autowired
    XiamiReplayService xiamiReplayService;

    @Autowired
    private List<ReplayService> replayServiceList;

    public ReplayService getReplayServiceByIndex(int index) {
        return replayServiceList.get(index);
    }

    public ReplayService getReplayServiceByPrefix(String prefix) {
        if (prefix.startsWith("ne")) {
            return neteaseReplayService;
        } else if (prefix.startsWith("xm")) {
            return xiamiReplayService;
        } else if (prefix.startsWith("qq")) {
            return qQReplayService;
        } else {
            throw new RuntimeException("不存在的.Service类型。。。");
        }
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        .allowCredentials(true)
                        .allowedMethods("GET", "POST", "DELETE", "PUT", "OPTIONS")
                        .maxAge(3600);
            }
        };
    }
}
