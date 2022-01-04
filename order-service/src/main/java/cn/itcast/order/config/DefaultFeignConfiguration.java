package cn.itcast.order.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;



/**
 * @author Dewily
 * @date 2022-01-04 17:25
 */
public class DefaultFeignConfiguration {

    @Bean
    public Logger.Level logLevel() {
        return Logger.Level.BASIC;
    }
}
