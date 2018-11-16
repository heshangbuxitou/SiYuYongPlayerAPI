package com.siyuyong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 等价于@Configuration，@EnableAutoConfiguration和@ComponentScan
public class PlayerApplication {
    public static void main(String[] args) {
        SpringApplication.run(PlayerApplication.class, args);
    }
    // 启动FastJson转换Object，项目中使用FastJson处理Json
    // 暂时不用，FastJson转义字符串带有转义符号，不方便前端识别
//    @Bean
//    public HttpMessageConverters fastJsonHttpMessageConverters() {
//        //1、定义一个convert转换消息的对象
//        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
//        //2、添加fastjson的配置信息
//        FastJsonConfig fastJsonConfig = new FastJsonConfig();
//        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
//        //3、在convert中添加配置信息
//        fastConverter.setFastJsonConfig(fastJsonConfig);
//        //4、将convert添加到converters中
//        HttpMessageConverter<?> converter = fastConverter;
//        return new HttpMessageConverters(converter);
//    }

}
