public class StringBuilder {
    public static void main(String[] args) {
//        В Java существует два типа объектов:
//        mutable - изменяемый
//        immutable - неизменяемый
//        Тип данных String - immutable
        String x = "hello!";
//        Это не только строка - это еще и объект класса String
        x = x.toUpperCase();
//        Метод toUpperCase сделает все строчные буквы заглавными
//        Если не переопределить x, то метод работать не будет (x = x...)
//        Все методы класса String не изменяют строку на которой они вызываются,
//        они возвращают новую строку!
        System.out.println(x);
        String string1 = "Hello";
        String string2 = " my";
        String string3 = " friend";
        String stringAll = string1 + string2 + string3;
        System.out.println(stringAll);

        /*Всё то же самое с помощью класса StringBuilder*/
//        Объекты класса StringBuilder - mutable, могут изменяться
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Hello");
//        В конструктор () можно подставить начальное значение или оставить пустым
        sb.append(" my");
        sb.append(" friend");
        /*Методы можно вызывать по цепочке - это называется Method chaining
          sb.append(" my").append(" friends");
          Метод append возвращает тот же самый объект (sb) на котором он был вызван
          При использовании цикла, лучше использовать StringBuilder - расходуется меньше памяти
        */
        System.out.println(sb);
    }
}
/*----------------------------------------------------------------------*/
/*
HELLO!
Hello my friend
Hello my friend

Process finished with exit code 0
*/
/*----------------------------------------------------------------------*/