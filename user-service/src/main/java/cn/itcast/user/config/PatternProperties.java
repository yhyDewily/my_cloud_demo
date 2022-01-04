package cn.itcast.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Dewily
 * @date 2022-01-03 15:37
 */

@Data
@Component
@ConfigurationProperties("pattern")
public class PatternProperties {
    private String fuck;
}
