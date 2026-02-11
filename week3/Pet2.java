public class Pet {

    // TODO: Declare THREE private fields
    private String name;
    private int age;
    private String type;

    // TODO: Create a constructor that takes name, age, and type
    public Pet(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    // TODO: Create getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    // TODO: Create setter method
    public void setAge(int age) {
        this.age = age;
    }

    // TODO: Create speak() method
    public void speak() {
        String sound = "";

        switch (type) {
            case "Dog":
                sound = "Woof!";
                break;
            case "Cat":
                sound = "Meow!";
                break;
            case "Bird":
                sound = "Chirp!";
                break;
            default:
                sound = "Hello!";
        }

        System.out.println(name + " (" + type + ", " + age + " years old) says: " + sound);
    }

    // TODO: Create haveBirthday() method
    public void haveBirthday() {
        age += 1;
        System.out.println(name + " had a birthday!");
    }
}
