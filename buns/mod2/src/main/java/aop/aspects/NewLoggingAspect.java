package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("aop.aspects.MyPoincuts.ReturnMethod()")
    public Object arroundReturningBookLoggingAdvise(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{

        System.out.println("arroundReturningBookLoggingAdvise : в библиотеку пытаются вернуть книгу ");
        Object targetMethodResult = null
                ;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        }
        catch (Exception e) {
            System.out.println("arroundReturningBookLoggingAdvise : было поймано исключение" + e);
            throw e;
        }

        System.out.println("arroundReturningBookLoggingAdvise : в библиотеку успешно вернули книгу ");

        return targetMethodResult;
    }
}
