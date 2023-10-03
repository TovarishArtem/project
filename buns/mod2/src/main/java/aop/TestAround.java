package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAround {
    public static void main (String[] args){
        System.out.println("Method main start!");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary unilLibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);
        book.setName(" Преступление наказание");
        unilLibrary.returnBook(book);


        context.close();
        System.out.println("Method main end!");
    }
}
