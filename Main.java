package nested;

class Animal {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("The animal is eating.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("The dog is barking.");
    }
}

class GermanShepherd extends Dog {
    public void guard() {
        System.out.println("The German Shepherd is guarding.");
    }
}
public class Main {
    public static void main(String[] args) {
        GermanShepherd dog = new GermanShepherd();
        dog.setName("Max");
        dog.eat();  // Inherited method from Animal class
        dog.bark(); // Inherited method from Dog class
        dog.guard(); // Method specific to GermanShepherd class
    }
}