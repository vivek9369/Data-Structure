public class Inheritance {
    public static void main(String[] args) {
       Fish shark =  new Fish();
       shark.eat();
       shark.breathe();
       shark.swim();
       Dog buzo = new Dog();
       buzo.eat();
       buzo.legs =4;
       System.out.println(buzo.legs);
    }
}
class Animal {
    String color;
    void eat(){
        System.out.println("Eat");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}
class Mammals  extends Animal{
    int legs;
    void walk(){
        System.out.println("walk");
    }
}
class Dog extends Mammals{
     String breed;
}
class Fish extends Animal{
    int fins;
    void swim() {
        System.out.println("Swims in water");
    }
    
}
class Bird extends Animal{
    void fly() {
        System.out.println("Fly in sky");
    }
    
}