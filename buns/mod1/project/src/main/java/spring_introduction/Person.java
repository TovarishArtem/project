package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    @Qualifier("dog")
    private Pet pet;
    @Autowired

    public Person(Pet pet) {

        System.out.println("Создался Person");
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }
    public Pet setPet() {
        return pet;
    }
    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
