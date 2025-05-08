public class Demo {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.color = "blue";
        p1.price = 10;
        System.out.println(p1.color);
        System.out.println(p1.price);

        bankAccount b1 = new bankAccount();
        b1.username = "abc";
        b1.setPassword("1234");
        System.out.println(b1.username);
//      System.out.println(b1.password); // This will give an error because password is private and cannot be accessed directly

        book b2 = new book();
        b2.setname("abc");
        b2.setprice(100);
        System.out.println(b2.GetName());
        System.out.println(b2.GetPrice());

        students s1 = new students();
        students s2 = new students("Adil");
        students s3 = new students(20);

        students s4 = new students(s1); // Copy constructor
    }
    
}

class pen{
    String color;
    int price;

    void setColor(String newColar){
        color = newColar;
    }
    void setPrice(int newPrice){
        price = newPrice;
    }
}

class bankAccount{
    public String username;
    private String password;
    public void setPassword(String newPassword){
        password = newPassword;
    }
}

class book{
    private String name;
    private int price;

    String GetName(){
        return name;
    }
    int GetPrice(){
        return price;
    }
    void setname(String newName){
        name = newName;
    }
    void setprice(int newPrice){
        price = newPrice;
    }
}

// Constructor 
class students{
    String name;
    int age;
    int marks[] = new int[5];

    // Copy Constructor ---> Shallow Copy Constructor
    // students(students s1){
    //     this.name = s1.name;
    //     this.age = s1.age;
    //     this.marks = s1.marks; // This will create a shallow copy, both objects will point to the same array
    // }

    // deep copy constructor
    students(students s1){
        this.name = s1.name;
        this.age = s1.age;
        this.marks = new int[5]; // Create a new array for deep copy
        for(int i = 0; i < s1.marks.length; i++){
            this.marks[i] = s1.marks[i]; // Copy each element from the original array
        }
    }



    students(){
        System.out.println("Constructor called");
    }
    students(String naem){
        System.out.println("Constructor called with name: " + naem);
    }
    students(int age){
        System.out.println("Constructor called with age: " + age);
    }

}