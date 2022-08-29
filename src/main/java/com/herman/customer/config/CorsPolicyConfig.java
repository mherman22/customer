package com.herman.customer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class CorsPolicyConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**");
            }
        };
    }

    // @Bean
    // public CorsFilter corsFilter(@Value("http://localhost:3000") List<String>
    // allowedOrigins) {
    // UrlBasedCorsConfigurationSource source = new
    // UrlBasedCorsConfigurationSource();
    // CorsConfiguration config = new CorsConfiguration();
    // config.setAllowCredentials(true);
    // config.setAllowedOriginPatterns(allowedOrigins);
    // config.addAllowedMethod("*");
    // config.addAllowedHeader("*");
    // source.registerCorsConfiguration("/**", config);
    // return new CorsFilter(source);
    // }
}
