// PetShop.java
public class PetShop {

    public static void main(String[] args) {

        // TODO: Create a Pet object called pet1
        Pet pet1 = new Pet("Buddy", 3); // Set name and age in constructor

        // TODO: Create a second Pet object called pet2
        Pet pet2 = new Pet("Luna", 5);

        // TODO: Call speak() on pet1
        pet1.speak();  // Output: Buddy says: Woof! I am 3 years old.

        // TODO: Call speak() on pet2
        pet2.speak();  // Output: Luna says: Woof! I am 5 years old.
    }
}
