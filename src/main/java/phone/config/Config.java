package phone.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import phone.dao.PhoneSiz;
import phone.impl.PhoneSizImpl;

@Configuration
@ImportResource("applicationContext.xml")
public class Config {

    @Bean(value = "phone")
    public PhoneSiz phoneSiz() {
        return new PhoneSizImpl();
    }
}
