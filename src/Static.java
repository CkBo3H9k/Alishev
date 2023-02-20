public class Static {
    public static void main(String[] args) {
        Human2.description = "№1";
        Human2 human2 = new Human2("Andrey", 32); //Новый объект класса Human2
//        human2.description = "Vetrov"; <- Так писать можно, но с точки зрения ООП не имеет смысла
//        Значение для переменной лучше задать через класс
//        /*Можно обратиться к переменной description с помощью класса Human2,
//        так как эта переменная принадлежит самому классу. Она не статическая.
//        Переменная будет общей для всех объектов класса Human2
//        */
        human2.getAllFields(); //Выведет на экран переменную объекта первого человека
//        human21.getAllFields();//Второго человека
//        //И общую переменную для двух объектов - description
//        Human2.getDescription();
        human2.printNumberOfPeople();
        Human2.description = "№2";
        Human2 human21 = new Human2("Aleksandr", 8);
//        Human2.getDescription();
//        human2.getAllFields();
        human21.getAllFields();
        human21.printNumberOfPeople();
    }
}
class Human2 {
    private String name;
    private int age;
    private static int countPeople;
    public static String description;
    //static - ключевое слово стоит перед типом переменной String. Им обозначаются переменные и методы класса
    public Human2(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public static void getDescription() {
        System.out.println(description);
    }
    public void getAllFields() { //Метод, который выведет всю информацию
        System.out.println(description + ", " + name + ", " + age + ".");
    }
//    public static void printAllFields() {
//        System.out.println(name);  <-name выделилось красным (ошибка)
//    }
//    Non-static field 'name' cannot be referenced from a static context
/*    К нестатической переменной 'name' не может совершаться обращение через статический контекст.
      Статический контекст - это статический метод. Мы не можем обращаться к переменной объекта 'name'
      из статической переменной printAllFields. Почему? Потому что 'name' у каждого объекта свой,
      а статический метод один на все объекты
 */
    public void printNumberOfPeople() {
        System.out.println("Number of people is: " + countPeople);
    }
}
/*----------------------------------------------------------------------*/
/*
№1, Andrey, 32.
Number of people is: 1
№2, Aleksandr, 8.
Number of people is: 2

Process finished with exit code 0
*/
/*----------------------------------------------------------------------*/