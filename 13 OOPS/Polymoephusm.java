public class Polymoephusm {
    public static void main(String[] args){
        // Creating an object of the MethodOverloading class
        MethodOverloading obj = new MethodOverloading();
        // Calling the sum method with integer parameters
        System.out.println("Sum of 5 and 10: " + obj.sum(5, 10));
        // Calling the sum method with double parameters
        System.out.println("Sum of 5.5 and 10.5: " + obj.sum(5.5, 10.5));

        // Creating an object of the Animal class
        Animal animal = new Animal();
        // Calling the eat method of the Animal class
        animal.eat();
        // Creating an object of the deer class
        deer deer = new deer();
        // Calling the eat method of the deer class
        deer.eat();
    }
}
// Method Overloading
class MethodOverloading {
    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }
}

// Method Overriding
class Animal {
    void eat() {
        System.out.println("Animal eats anything");
    }
}
class deer extends Animal {
    void eat() {
        System.out.println("Deer eats grass");
    }
}
