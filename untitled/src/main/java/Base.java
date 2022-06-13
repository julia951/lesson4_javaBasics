public class Base {
    public static void main(String[] args) {

    //  0) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой
    byte byteValue = 127; //(-128 .. 127)
    short shortValue = 32767; //( -32,768 .. 32,767)
    int intValue1 = 2147483647; // (-2147483648 .. 2147483647)
        int intValue2 = 2147483642; // (-2147483648 .. 2147483647)
        long longValue = 9223372036854775807L; // (-9223372036854775808L .. 9223372036854775807L)


    float floatValue = 0.1F; //от ~1,4*10-45 до ~3,4*1038
    double doubleValue = 0.1; //от ~4,9*10-324  до ~1,8*10308

    char charValue = 'q';
    String stroka="MEOW";
    boolean bool = true; // true, false

    //1) поупражняться с математическими и логическими операторами, добиться переполнения при вычислениях,
    // посмотреть результаты (вывести в консоль)
        byte b = 126 + 30;
        short s = 32767 + 150;
        int i = 2147483647 + 800;

        //2) попробовать вычисления комбинаций типов данных (int и double)
        System.out.println(intValue1+doubleValue);
        System.out.println(doubleValue-intValue1);
        System.out.println(doubleValue*intValue1);
        System.out.println(doubleValue/intValue1);

        //4) Написать код, использующий большинство или все виды операторов, о которых говорилось в лекции.
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(arr[2]);

        String str = "Hello!";

        if (intValue1 != 100 && intValue2 < 48) {
            System.out.println("it is correct, cool");
        } else if (intValue1 == intValue2) {
            System.out.println("these numbers are equal");
        } else {
            System.out.println("sth is wrong");
        }

        //5) Показать примеры операций над разными типами данных (int + long, например).
        System.out.println(intValue2+longValue);
        System.out.println(longValue-intValue2);
        System.out.println(longValue*intValue2);
        System.out.println(longValue/intValue2);

        //6) Добиться переполнения в min и max сторону и посмотреть что произойдет.
        int intMax = Integer.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;
        System.out.println(intMax + 1000000000);
        System.out.println(intMin - 1000000000);
    }
}
