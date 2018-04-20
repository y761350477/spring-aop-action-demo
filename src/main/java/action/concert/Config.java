package action.concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Config {

    @Bean
    public Audience audience() {
        return new Audience();
    }

    @Bean(value = "performance")
    public Performance performance() {
        return new PerformanceImpl();
    }
}
