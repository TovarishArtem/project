package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPoincuts {
    @Pointcut("execution(* get*())")
    public void allGetMethods(){}
    @Pointcut("execution(* return*())")
    public void allReturnMethods(){}
    @Pointcut("execution(public void returnBook(aop.Book))")
    public void ReturnMethod(){}
}
