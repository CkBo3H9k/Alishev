public class PrintF {
    public static void main(String[] args) {
        System.out.printf("%.2f This is the string, %s, %d, ",3.141592, "Nice!", 16);
//        %s - вставит строку
//        %d - вставит цифру
//        %10d - резервирует 10 пустых "клеток" для числа (окончательная ширина числа)
//        %10d - числа выравниваются по правому краю, %-10d - по левому
//        %f - число с запятой
//        %.2f - ограничит числа после точки. Округлит значения
        System.out.println();
        System.out.printf("%10d \n", 1234567890);
        //Если попытаться вывести 11е число, будет ошибка
        System.out.printf("%10d \n", 123456);
        System.out.printf("%10d \n", 123);
    }
}
/*----------------------------------------------------------------------*/
/*
3,14 This is the string, Nice!, 16,
1234567890
    123456
       123

        Process finished with exit code 0
*/
/*----------------------------------------------------------------------*/