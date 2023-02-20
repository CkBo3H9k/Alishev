public class Constructor {
    public static void main (String[] args) {
        Human1 human2 = new Human1("Andrey", 32);
        //В зависимости от количества параметров будет вызван тот или иной конструктор
    }
}
class Human1 {
    private String name; //Переменная объекта
    private int age;
    /*----------Конструкторы----------*/
    public Human1 () { //Конструктор, создаваемый по умолчанию. Изначально он невидимый
        System.out.print("This is the first constructor");
        //Переопределив его своим конструктором (написав его код) можно менять в нем значения
    }
    public Human1 (String name) {
        this.name = name;
        System.out.println("This is the second constructor");
        System.out.println(name);
    }
    public Human1 (String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("This is the third constructor");
        System.out.println(name + " " + age);
    }
    /*--------------------------------*/
    /*-------------Методы-------------*/
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    /*--------------------------------*/
}
/*----------------------------------------------------------------------*/
/*
This is the third constructor
Andrey 32

Process finished with exit code 0
*/
/*----------------------------------------------------------------------*/