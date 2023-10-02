package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main (String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationSContext1.xml");
//        Pet pet = context.getBean("myPet", Pet.class);

//        Dog dog = context.getBean("dogBean", Dog.class);
//        dog.say();
//        context.close();

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        context.close();

    }

}
