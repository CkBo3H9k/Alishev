package Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal_1 = new Animal(1);
        Person person_1 = new Person("Piter");
        animal_1.sleep(); person_1.sayHello();
        Inform info1 = new Animal(2);
        Inform info2 = new Person("Bred");
        info1.showInfo(); info2.showInfo();
        outputInfo(animal_1); outputInfo(person_1);
    }
    public static void outputInfo(Inform inform) {
        //Метод принимает в качестве аргументов нечто, что реализует класс Inform.
        //Теперь метод outputInfo может действовать на любом из объектов, класс которого реализует интерфейс Inform.
        //В этот метод мы, в качестве аргумента, можем подать либо Animal, либо Person.
        inform.showInfo();
    }
}
interface Inform {
    public void showInfo();
    /*{
        Interface abstract methods cannot have body.
        body - {...} Это все, что между скобками.
        И по этому {} тут быть не может.
        В интерфейсе не может быть реализации метода, только их сигнатуры
    }*/
}
class Animal implements Inform { //implements - реализует
    public int id;
    public Animal(int id) {
        this.id = id;
    }
    public void sleep() {
        System.out.println("The animal from the interface is sleeping");
    }
    @Override
    public void showInfo() {
        //Данный метод имплементирует (реализует) метод интерфейса
        System.out.println("Id is " + this.id);
    }
}
class Person implements Inform {
    public String name;
    public Person(String name) {
        this.name = name;
    }
    public void sayHello(){
        System.out.println("The person from the interface says hello");
    }
    @Override
    public void showInfo() {
        System.out.println("Name is " + this.name);
    }
}
/*----------------------------------------------------------------------*/
/*
The animal from the interface is sleeping
The person from the interface says hello
Id is 2
Name is Bred
Id is 1
Name is Piter

Process finished with exit code 0
*/
/*----------------------------------------------------------------------*/