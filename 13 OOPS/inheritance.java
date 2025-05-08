public class inheritance {
    public static void main(String[] args){
        // Creating an object of the Dog class
        Dog shoeDog = new Dog();
        // Accessing the properties and methods of the Dog class
        shoeDog.color = "Black";
        System.out.println("Dog color: " + shoeDog.color);
        shoeDog.eat(); // Inherited method from Animal class
        shoeDog.breathe(); // Inherited method from Animal class
        shoeDog.bark(); // Method of Dog class
        // Creating an object of the birds class
        birds parrot = new birds();
        // Accessing the properties and methods of the birds class
        parrot.color = "Green";
        System.out.println("Bird color: " + parrot.color);
        parrot.eat(); // Inherited method from Animal class
        parrot.breathe(); // Inherited method from Animal class
        parrot.fly(); // Method of birds class
        // creating an object of the fish class
        fish goldFish = new fish();
        // Accessing the properties and methods of the fish class
        goldFish.color = "Golden";
        System.out.println("Fish color: " + goldFish.color);
        goldFish.eat(); // Inherited method from Animal class
        goldFish.breathe(); // Inherited method from Animal class
        goldFish.swim(); // Method of fish class
    }
}
// Base Class
class Animal{
    String color;
    void eat(){
        System.out.println("Animal eats");
    }
    void breathe(){
        System.out.println("Animal breathes");
    }
}
// Derived Class
class Dog extends Animal{ // class Dog extends Animal
    void bark(){
        System.out.println("Dog barks");
    }
} 
// multi level inheritance
class birds extends Animal{ // class birds extends Animal
    void fly(){
        System.out.println("Birds fly");
    }
}
// Hierarchical inheritance
class fish extends Animal{ // class fish extends Animal
    void swim(){
        System.out.println("Fish swims");
    }
}
// Hybrid inheritance
class hybrid extends Dog{ // class hybrid extends Dog
    void bark(){
        System.out.println("Dog barks");
    }
}
// Multiple inheritance is not supported in Java, but can be achieved using interfaces
