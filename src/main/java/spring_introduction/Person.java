package spring_introduction;

public class Person {
    private Pet pet;

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
