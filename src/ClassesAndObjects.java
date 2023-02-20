public class ClassesAndObjects {
    public static void main(String[] args) {
        /*---------Вызываем методы--------*/
        /*------------Person 1------------*/
        Person person1 = new Person();
        person1.setName("Роман");
        person1.setAge(55);
        person1.sayHello();
        person1.speak(); //Здесь мы вызываем у объекта person1 метод speak
        person1.calcYearsToRetirement();
//        System.out.println(person1.getName()); // Получаем значение Имени
//        System.out.println(person1.getAge()); //Получаем значение Возраста
        System.out.println(); //Пустая строка
        /*------------Person 2------------*/
        Person person2 = new Person();
        String name = "Володя";
        person2.setName(name);
        person2.setAge(20);
        person2.sayHello();
        person2.speak();
        person2.calcYearsToRetirement();
    }
}
class Person {
    //Идея Инкапсуляции состоит в максимальном ограничении полей от других классов. Делать так, чтобы поля были видны в пределах одного класса.
    private String name;
    //private - это поле теперь доступно только в пределах этого класса
    private int age;
    //Поле age Задекларировано в классе Person

    /*---------------Сеттеры и Геттеры---------------*/
    public void setName(String userName) {
        // Метод получает параметры
        if (userName.isEmpty()) {
            //Метод возвращает true если строка пустая, если не пустая, то - false.
            System.out.println("Ты ввел пустое имя");
        } else {
            name = userName;
        }
    }
    public String getName () {
        //При вызове этого метода будет возвращаться строка, которая является полем (private String name;)
        return name;
    }
    public void setAge(int userAge) {
        if (userAge<0) {
            System.out.println("Возраст должен быть положительным");
        } else {
            age = userAge;
        }
    }
    public int getAge () {
        return age;
    }
    /*-----------------------------------------------*/
    void speak () {
        //Метод подставит значения в name и age. Выведет строку в консоль.
        for (int i = 0; i < 1; i++) {
            age += 1;
            System.out.println("Меня зовут " + name + ", мне " + age);
//            if (Objects.equals(name, "Вова")) {
//                sayHello();
//                name = "Саша";
//            }
//            if (Objects.equals(name,"Роман")) {
//                sayHello();
//                name = "Георгий";
//            }
        }
    }
    void sayHello () {
        //Метод только выводит в консоль слово "Привет!"
        System.out.print("Привет! ");
    }
    void calcYearsToRetirement () {
        //Метод рассчитывает, сколько лет осталось до пенсии
        int years = 65 - age;
        //Пенсия наступит в 65 лет
        /*-----------------Условие------------------*/
        if (years > 10) {
            System.out.println("До пенсии, как до Китая пешком...");
        } else {
            System.out.println("Осталось лет до пенсии: " + years);
        }
        /*------------------------------------------*/
//После вызова return нет смысла что-то писать, так как метод прекратил свою работу. Если он не в IF.
    }
}
/*----------------------------------------------------------------------*/
/*
Привет! Меня зовут Роман, мне 56
Осталось лет до пенсии: 9

Привет! Меня зовут Володя, мне 21
До пенсии, как до Китая пешком...

Process finished with exit code 0
*/
/*----------------------------------------------------------------------*/