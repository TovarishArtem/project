package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test4 {
    public static void main (String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Pet dog = context.getBean("dogBean", Pet.class);
        dog.say();
        context.close();
    }
}
