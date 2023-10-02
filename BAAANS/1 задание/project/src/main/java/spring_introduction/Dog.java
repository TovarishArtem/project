package spring_introduction;

import org.springframework.stereotype.Component;

//@Component("dogBean")
public class Dog implements Pet {
    public Dog(){
        System.out.println("Создался Dog");
    }
    @Override
    public void say(){
        System.out.println(("Гав-Гав"));
    }
}
