package rent.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Broker {

    // 有相同的切点表达式使用公用的方法
    // 1. 使用@Pointcutq注解(写入切点表达式),创建我返回值的方法;
    // 2. 其他使用切点表达式的地方改成1步骤中创建的方法名();
    @Pointcut("execution(* rent.pojo.Landlord.service())")
    public void pointcut() {

    }

//    @Before("pointcut()")
//    public void before(){
//        System.out.println("带租客看房");
//        System.out.println("谈价格");
//    }
//
//    @After("pointcut()")
//    public void after(){
//        System.out.println("交钥匙");
//    }

    @Around("pointcut()")
    public void around(ProceedingJoinPoint jp) {
        try {
            System.out.println("带租客看房");
            System.out.println("谈价格");
//            proceed()方法。如果不调这个方法的话，那么你的通知实际上会阻塞对被通知方法的调用。
            jp.proceed();
            System.out.println("交钥匙");
        } catch (Throwable throwable) {
            System.out.println("雾草,抛出异常了!");
        }

    }
}
