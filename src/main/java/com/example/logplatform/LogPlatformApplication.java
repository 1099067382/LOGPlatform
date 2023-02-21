package com.example.logplatform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;

import javax.servlet.MultipartConfigElement;

@Configuration
@SpringBootApplication
//MapperScan指定当前项目中的Mapper接口路径，启动项目的时候自动加载全部接口
@MapperScan("com.example.logplatform.mapper")
public class LogPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogPlatformApplication.class, args);
    }

    @Bean
    public MultipartConfigElement getMultipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        // DataSize dataSize = DataSize.ofMegabytes(10);
        // 设置文件最大10M，DataUnit提供5中类型B,KB,MB,GB,TB
        factory.setMaxFileSize(DataSize.of(10, DataUnit.MEGABYTES));
        factory.setMaxRequestSize(DataSize.of(15, DataUnit.MEGABYTES));
        // 设置总上传数据总大小10M
        return factory.createMultipartConfig();
    }
}
