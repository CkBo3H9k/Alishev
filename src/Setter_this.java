import java.util.Scanner;

public class Setter_this {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("", 0);
        human1.getInfo();
    }
}
class Human {
    private String name;     //Переменная объекта
    private int age;
/*-----Сеттер со словом .this-----*/
    public void setName(String name, int age) { //Переменная метода
        //Область видимости переменной name только внутри {...}
        //this.name указывает на переменную объекта
        //Ключевое слово this вызывает объект внутри класса
        System.out.print("Enter a name: ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        this.name = name;
        System.out.print("Enter the age: ");
        Scanner scanner1 = new Scanner(System.in);
        age = scanner1.nextInt();
        this.age = age;
        scanner1.close();
    }
/*--------------------------------------------*/
    public void getInfo() {
        System.out.println("My name is " + name + ". I'm " + age + " years old.");
    }
}
/*----------------------------------------------------------------------*/
/*
Enter a name: Andrey
Enter the age: 32
My name is Andrey. I'm 32 years old.

Process finished with exit code 0
*/
/*----------------------------------------------------------------------*/