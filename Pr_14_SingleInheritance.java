class Animal{
    void Eat(){
        System.out.println("Eating");
    }
}
class Dog extends Animal{
    void Bark(){
        System.out.println("Dog is barking");
    }
}
public class Pr_14_SingleInheritance {
    public static void main(String[] args){
        Dog sc = new Dog();
        sc.Eat();
        sc.Bark();

    }
}
