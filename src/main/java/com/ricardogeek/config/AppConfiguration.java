package com.ricardogeek.config;

import java.awt.image.BufferedImage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.converter.BufferedImageHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;

import com.ricardogeek.generator.BarcodeGenerator;
import com.ricardogeek.generator.QrCodeGenerator;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfiguration {

    @Bean
    public HttpMessageConverter<BufferedImage> createImageHttpMessageConverter() {
        return new BufferedImageHttpMessageConverter();
    }

    @Bean
    public BarcodeGenerator getBarcodeGenerator() {
        return new BarcodeGenerator();
    }

    @Bean
    public QrCodeGenerator getQrCodeGenerator() {
        return new QrCodeGenerator();
    }
    
    

}
