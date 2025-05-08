public class Abstract {
    public static void main(String[] args){
        // Creating an object of the Dog class
        Dog dog = new Dog();
        dog.sound(); // Calling the abstract method
        dog.eat(); // Calling the regular method

        // Creating an object of the DogInterface class
        DogInterface dogInterface = new DogInterface();
        dogInterface.sound(); // Calling the abstract method
        dogInterface.eat(); // Calling the regular method

        // Multiple inheritance using interfaces
        Dog1 dog1 = new Dog1();
        dog1.sound(); // Calling the sound method from Animal1
        dog1.eat(); // Calling the eat method from Animal2
    }
}
// > Abstract Class
abstract class Animal {
    // Abstract method (does not have a body)
    abstract void sound();
    // Regular method
    void eat() {
        System.out.println("Animal eats food");
    }
}
// Derived class (inherited from Animal)
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Interface
interface AnimalInterface {
    // Abstract method (does not have a body)
    void sound();
    // Regular method
    default void eat() {
        System.out.println("Animal eats food");
    }
}
// Derived class (inherited from AnimalInterface)
class DogInterface implements AnimalInterface {
    public void sound() {
        System.out.println("Dog barks");
    }
    // eat() method is inherited from AnimalInterface
    // No need to override it unless you want to provide a different implementation
}

// multiple inheritance using interfaces
interface Animal1 {
    void sound();
}
interface Animal2 {
    void eat();
}
class Dog1 implements Animal1, Animal2 {
    public void sound() {
        System.out.println("Dog barks");
    }
    public void eat() {
        System.out.println("Dog eats food");
    }
}
