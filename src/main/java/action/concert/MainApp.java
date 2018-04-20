package action.concert;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(Config.class);
        ac.refresh();
        // 到底是返回接口还是类?
        // 启用AspectJ自动代理(自动生成代理类有两种方式,JDK和CGLIB, 一个基于接口,一个基于类,默认(false)是JDK方式)
//@EnableAspectJAutoProxy(proxyTargetClass = true)
        Performance performance = (Performance) ac.getBean("performance");
        performance.perform(10);

    }
}
