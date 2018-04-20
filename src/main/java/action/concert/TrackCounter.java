package action.concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

// 切面所通知的方法有参数的情况的值传递
@Aspect
public class TrackCounter {

    // 切点表达式中的args(trackNumber)限定符。它表明传递给playTrack()方法的int类型参数也会传递到通知中去。参数的名称trackNumber也与切点方法签名中的参数相匹配。
    @Pointcut("execution(* action.concert.Performance.perform(int))" + "&& args(trackNumber)")
    public void performance(int trackNumber) {

    }

    @Before("performance(trackNumber)")
    public void countTrack(int trackNumber) {
        System.out.println("trackNumber:\t" + trackNumber);
    }

}
