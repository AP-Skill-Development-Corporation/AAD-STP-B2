class Animal{
public void eat(){
System.out.println("eating....");
}
}
class Dog extends Animal{
public void bark(){
System.out.println("barking....");
}
}

class SingleInheritanceTest{

public static void main(String args[]){
Dog d = new Dog();
d.eat();
d.bark();

}

}
