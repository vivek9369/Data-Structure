public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Bird b = new Bird();
        b.eat();
        b.walk();
    }
}
abstract class Animal {
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    void walk(){
        System.out.println("walk on 4 legs");
    }
}
class Bird extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
