package Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal_1 = new Animal(1);
        Person person_1 = new Person("Piter");
        animal_1.sleep();
        person_1.sayHello();
    }
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