public class ClassObjectAndMethod_toString {
    //Любой класс в Java наследуется от класса Object
    public static void main(String[] args) {
        String string = "Hello"; //Создан объект
        System.out.println(string); //Объект напечатан
        Human3 h3 = new Human3("Bobby", 15);
        h3.toString();
        //h3.toString(); -> Result of 'Human3.toString()' is ignored так как:
        //В самом классе Human3 этого метода нет. Метод toString наследуется от класса Object
        //.toString() возвращает хэш-код для созданного объекта - уникальный номер, присвоенный каждому объекту
        System.out.println(h3);
        //Написав System.out.println(h3); мы скрыто вызываем у объекта метод .to String -> System.out.println(h3.toString());
    }
}
class Human3 {
    private String name;
    private int age;
    public Human3 (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
    /*Здесь происходит переопределение метода toString() своим методом toString()
      То есть изменяется метод данный от предка класса Object в классе Human3
    */
    return "Name is: " + name + ". " + age + " years old";
    }
}
/*----------------------------------------------------------------------*/
/*
Hello
Name is: Bobby. 15 years old

Process finished with exit code 0
*/
/*----------------------------------------------------------------------*/