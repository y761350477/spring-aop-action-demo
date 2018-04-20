package phone.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import phone.config.Config;
import phone.dao.PhoneSiz;

public class MainApp {

    public static void main(String[] args) {
        // 不使用代理类的效果 - Created by YC.
        /*PhoneSiz phoneSiz = new PhoneSizImpl();
        LogUtil logUtil = new LogUtil();
        phoneSiz.buyPhone(100);
        logUtil.log(100);
        phoneSiz.salePhone(50);
        logUtil.log(50);*/

        // 使用代理类的效果 - Created by YC.
        /*PhoneLog phoneLog = new PhoneLog();
        phoneLog.buy(100);
        phoneLog.sale(50);*/

        // 使用AOP实现代理 - Created by YC.
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(Config.class);
        ac.refresh();

        PhoneSiz phoneSiz = (PhoneSiz) ac.getBean("phone");
        phoneSiz.buyPhone(100);
    }
}
