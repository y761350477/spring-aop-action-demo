package rent.app;

import rent.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rent.pojo.Landlord;

public class MainApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(Config.class);
        ac.refresh();
        Landlord landlord = (Landlord) ac.getBean("landlord", Landlord.class);
        landlord.service();

    }
}
