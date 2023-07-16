package com.blog.config;

import com.blog.aop.ValidateAspect;
import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource("classpath:jdbc.properties")
@EnableTransactionManagement
@Import({DaoConfig.class})
@ComponentScan("com.blog.service")
@EnableAspectJAutoProxy
public class SpringConfig {

    @Bean
    public ValidateAspect validateAspect() {
        return new ValidateAspect();
    }
}
