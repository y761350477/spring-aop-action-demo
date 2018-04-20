package phone.log;

import org.aspectj.lang.JoinPoint;

import java.util.Date;

public class LogUtil {

//    public void log(int num) {
//        System.out.println("进行交易: 交易数量" + num);
//    }

    public void before(JoinPoint joinPoint) {
        // JoinPoint:连接点对象 - Created by YC.
        // 获取方法名 - Created by YC.
        System.out.println("##获取方法名:\t" + joinPoint.getSignature().getName());
        // 获取所有方法的参数 - Created by YC.
        System.out.println("##获取所有方法的参数:\t" + joinPoint.getArgs().length);
        System.out.println(joinPoint.getKind());
        // 获取目标对象 - Created by YC.
        System.out.println("##获取目标对象:\t" + joinPoint.getTarget());
        String method = joinPoint.getSignature().getName();
        if (method.equals("buyPhone")) {
            System.out.println("准备开始进货:\t" + new Date());
        }

        if (method.equals("salePhone")) {
            System.out.println("准备开始销售:\t" + new Date());
        }
    }

    public void afterReturing(JoinPoint joinPoint) {
        String method = joinPoint.getSignature().getName();
        if (method.equals("buyPhone")) {
            System.out.println("进货完成:\t" + new Date());
        }

        if (method.equals("salePhone")) {
            System.out.println("全部售罄:\t" + new Date());
        }
    }

    public void after(JoinPoint joinPoint) {
        System.out.println("回家!");
    }
}
