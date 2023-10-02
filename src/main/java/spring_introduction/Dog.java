package spring_introduction;

public class Dog implements Pet {
    public Dog(){
        System.out.println("Создался Dog");
    }
    @Override
    public void say(){
        System.out.println(("Гав-Гав"));
    }
}
