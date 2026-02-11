// PetShop.java
// Week 2: Using constructors and methods

public class PetShop {

    public static void main(String[] args) {

        // TODO: Create pet1 - Dog named Buddy, age 3
        Pet pet1 = new Pet("Buddy", 3, "Dog");

        // TODO: Create pet2 - Cat named Luna, age 5
        Pet pet2 = new Pet("Luna", 5, "Cat");

        // TODO: Create pet3 - Bird named Tweety, age 1
        Pet pet3 = new Pet("Tweety", 1, "Bird");

        // TODO: Call speak() on all three pets
        pet1.speak();
        pet2.speak();
        pet3.speak();

        // TODO: Print a blank line
        System.out.println();

        // TODO: Call haveBirthday() on pet1
        pet1.haveBirthday();

        // TODO: Print pet1's new age using getAge()
        System.out.println(pet1.getName() + " is now " + pet1.getAge() + " years old.");
    }

}
