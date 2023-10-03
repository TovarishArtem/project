package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main (String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary unilLibrary = context.getBean("uniLibrary", UniLibrary.class);
        unilLibrary.getBook();
        unilLibrary.getMagazine();
//        unilLibrary.returnBook();

//        ScoolLibrary scoolLibrary = context.getBean("scoolLibrary", ScoolLibrary.class);
//        scoolLibrary.getBook();


        context.close();
    }
}
