
class Animal{
    void eat(){
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking.");
    }
}
public class SingleInh {
    public static void main(String[] args) {
        Dog mydog=new Dog();
        mydog.bark();
        mydog.eat();
    }
}
