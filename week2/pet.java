// Pet.java
class Pet {

    // TODO: Add a field for the pet's name (String)
    String name;

    // TODO: Add a field for the pet's age (int)
    int age;

    // Constructor to initialize name and age (optional but helpful)
    Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // TODO: Create a speak() method
    void speak() {
        System.out.println(name + " says: Woof! I am " + age + " years old.");
    }
}
