package rent.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import rent.aspect.Broker;
import rent.pojo.Landlord;

@ComponentScan(basePackageClasses = {Broker.class, Landlord.class})
@Configuration
@EnableAspectJAutoProxy
public class Config {

}
