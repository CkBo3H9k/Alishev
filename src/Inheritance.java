public class Inheritance { //НАСЛЕДОВАНИЕ
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.eat();
//        animal.sleep();
        //Перед тем как обратиться к классу Dog необходимо создать с его помощью новый объект
        Dog dog = new Dog(); //Создаем новую собаку
        dog.eat(); dog.sleep(); dog.bark(); dog.showName();
        System.out.println();
        Cat cat = new Cat(); //Создаем нового кота
        cat.eat(); cat.sleep(); cat.meow(); cat.showName();
    }
}
class Animal {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println("The animal eats");
    }
    public void sleep() {
        System.out.println("The animal is sleeping");
    }
}
class Dog extends Animal{
    @Override
    //Метод eat в классе Dog (наследнике) переопределяет метод в классе Animal (родителе)
    public void eat() {
        System.out.println("Dog eats meat");
    }
    public void bark(){
        System.out.println("The dog barks");
    }
    public void showName() {
        super.setName("Bobby");
        System.out.println(super.getName());
    }
}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("Cat eats fish");
    }
    public void meow() {
        System.out.println("The cat meows");
    }
    public void showName() {
        super.setName("Barsik");
        System.out.println(super.getName());
    }
}
/*----------------------------------------------------------------------*/
/*
Dog eats meat
The animal is sleeping
The dog barks
Bobby

Cat eats fish
The animal is sleeping
The cat meows
Barsik

Process finished with exit code 0
*/
/*----------------------------------------------------------------------*/