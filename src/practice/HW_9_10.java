package practice;

import java.util.Arrays;



public class HW_9_10 {


    public static int getNumber(int a, int b) {
        int res = 0;

        for (int i = a; i < 300; i *= b) {
            System.out.println(i);

        }
        return res;
    }

    public static void printSymbol(char a, char b) {


        for (int i = a; i <= b; i++) {
            System.out.print((char) i);
        }
    }

    // Написать метод, который принимает на вход целое положительное число, не больше 10, и возвращает
//        массив double[], который содержит 10 чисел - степени этого числа (Math.pow())

    public static double[] getArrayNumber(int a) {
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.pow(a, i);
        }
        return array;
    }


    public static void main(String[] args) {


        String line = "—————————————————————————————————————————————";
        String task = "Task #: ";
        String task1 = "Task 1.";
        System.out.println(task + 1);

//        числа от 1 до 5
        int[] num = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(num));
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println(line);
        System.out.println(task1 + 2);
//        числа от 100 до 1
        for (int i = 100; i >= 1; i--) {
            System.out.print(i);
        }

        System.out.println(line);
        System.out.println(task1 + 3);
//        числа от 100 до 1 с шагом 10
        for (int i = 100; i > 1; i -= 10) {
            System.out.println(i);
        }
        System.out.println(task1 + 4);
        System.out.println(line);
//        числа от -a до a включительно c шагом

//        int a = 20;
//        for(int i = -a; i <= 'a'; i+=3){
//            System.out.println(i);
//        }
        System.out.println(task1 + 5);
//        числа от a до b с шагом с

        int a = 1;
        int b = 11;
        int c = 2;
        for (char i = 'a'; i <= 'b'; i += 'c') {
            System.out.println(i);
        }

        System.out.println(line);
        System.out.println(task + 2);
//      2.  Для чисел  от 1 до 100 распечатать только четные числа
        for (int i = 1; i < 100; i += 2) {
            System.out.println(i);
        }

//       3. Для чисел от 101 до 200 создать массив нечетных чисел
        System.out.println(task + 3);
        System.out.println(line);
        int[] array = {};
        for (int i = 101; i < 200; i += 2) {
            System.out.println(i);
        }

        System.out.println(line);

//       4. Для всех чисел от 1 до 10:
//        если число меньше 5, распечатать значение, умноженное на 10,  иначе распечатать значение разделенное на 10
//        Создать массив из получившихся значений
        for (int i = 1; i < 5; i++) {
            System.out.println(i * 10);

        }


//        5.Создать массив значений (вычислить эти числа в цикле for) 0.01, 0.02, 0.03, 0.04, 0.05, 600, 700, 800, 900
        System.out.println(line);
        System.out.println(task + 5);
//
//        double[] array3 = {0.01, 0.02, 0.03, 0.04, 0.05, 600, 700, 800, 900};
//        for (int i = 0; i < array3.length; i++) {
//            if (i < 6) {
//                array3[i - 1] = i / 100.0;
//                {else{
//                    array3[i - 1] = i * 100.0;
//
//                }
//                }
//            }

//        6. Создать массив catsColors
        System.out.println(line);
        System.out.println(task + 6);

        String[] catsColors = new String[8];
        catsColors[0] = "Grey";
        catsColors[1] = "Black";
        catsColors[2] = "Grey";
        catsColors[3] = "Brown";
        catsColors[4] = "Beige";
        catsColors[5] = "White";
        catsColors[6] = "Beige";
        catsColors[7] = "White";
        System.out.println(Arrays.toString(catsColors));

        //      7. Создать массив catsAges
        System.out.println(task + 7);
        String[] catsAges = new String[8];

        catsAges[0] = "1";
        catsAges[1] = "5";
        catsAges[2] = "7";
        catsAges[3] = "2";
        catsAges[4] = "10";
        catsAges[5] = "3";
        catsAges[6] = "5";
        catsAges[7] = "6";
        System.out.println(Arrays.toString(catsAges));


        System.out.println(task + 1);
        for (int i = -100; i <= 100; i += 3) {
            System.out.println(i);
        }

        System.out.println(line);
        System.out.println(task + 2);
//        Распечатать последовательность чисел:
////        1, -1, 2, -2, 3, -3, ... -10, 10
//        for(int i = 0; i<10; i++){
//
//        }


//        Распечатать последовательность чисел:
//        1 5 25 125 625 3125 15625 78125 390625
        System.out.println(line);
        System.out.println(task + 3);
        for (int i = 1; i <= 390625; i *= 5) {
            System.out.println(i);
        }
//        Распечатать последовательность чисел:
//        1, 10, 100, 1000, 10000, 100000, 1000000
        System.out.println(line);
        System.out.println(task + 4);
        for (int i = 1; i <= 1000000; i *= 10) {
            System.out.print(i + " ");
        }


//        Распечатать с помощью for:
//        1
//        10
//        100
//        1000
//        10000
//        100000
//        1000000

        System.out.println(line + "\n");
        System.out.println(task + 5);
        for (int i = 1; i <= 1000000; i *= 10) {
            System.out.println(i);
        }

//        Распечатать с помощью for:
//        1000000
//        100000
//        10000
//        1000
//        100
//        10
//        1
        System.out.println(line);
        System.out.println(task + 6);
        for (int i = 1000000; i >= 1; i /= 10) {
            System.out.println(i);
        }
//        Распечатать с помощью for:
//        1
//        101
//        10101
//        1010101
//        101010101
        System.out.println(line);
        System.out.println(task + 7);
        for (int i = 1; i <= 101010101; i *= 101) {
            System.out.println(i);
        }

//    Написать метод, который принимает на вход 2 целочисленных параметра (a, b)
//    и печатает последовательность положительных  чисел в пределах 1000.
//    Последовательность начинается с числа a, и каждый следующий member
//    последовательности в b раз больше предыдущего.
//                Пример:
//        3, 7   ->   3 21 147
//        5, 3   ->   5 15 45 135 405
        System.out.println(line);
        System.out.println(task + 8);

        getNumber(3, 7);

//        Распечатать последовательность:
//        122333444455555666666777777788888888999999999
        System.out.println(line);
        System.out.println(task + 9);

//        Написать метод, который принимает на вход 2 символа char и печатает все символы char между ними
        System.out.println(line);
        System.out.println(task + 10);

        printSymbol('e', 'h');


//        Создать массив {0, 45, 90, 135, 180}
        System.out.println(line);
        System.out.println(task + 11);
        ;
        int[] arr = {0, 45, 90, 135, 180};
        for (int i = 0; i <= 180; i += 45) {
            System.out.println(i);
        }

//        Создать массив {0.0, 4.5, 9.0, 13.5, 18.0}
        System.out.println(line);
        System.out.println(task + 12);
        double[] arr1 = {0.0, 4.5, 9.0, 13.5, 18.0};
        for (double i = 0.0; i <= 18.0; i += 4.5) {
            System.out.println(i);
        }

//        Создать массив типа float[] из следующих значений
//        {k, m, l}:
//        double k = 2987.1234
//        int l = 3456
//        float m = 54.3
        System.out.println(line);
        System.out.println(task + 13);
        float[] arra = new float[3];
        for (int i = 0; i < arra.length; i++) {
            if (i < 3) {

            }

        }


//        Создать массив типа Byte[] из следующих значений
//        {o, o, o}:
//        Byte o = 32;
//        int  p = 74;
//        Short r = 104;
//        С помощью метода класса Math.pow() создать массив степеней числа 3:
        System.out.println(line);
        System.out.println(task + 13);
//       [1.0, 3.0, 9.0, 27.0, 81.0, 243.0, 729.0, 2187.0, 6561.0, 19683.0]
        int p = 3;
        int b1 = 0;
        int b2 = 1;
        int b3 = 2;
        int b4 = 3;
        int b5 = 4;
        int b6 = 5;
        int b7 = 6;
        int b8 = 7;
        int b9 = 8;
        int b10 = 9;
        for (int i = b1; i <= b10; i++) {
            System.out.println((Math.pow(p, i)));
        }
        System.out.println(line);
        System.out.println(task + 14);
//        Написать метод, который принимает на вход целое положительное число, не больше 10, и возвращает
//        массив double[], который содержит 10 чисел - степени этого числа (Math.pow())
        System.out.println(Arrays.toString(getArrayNumber(2)));


//        С помощью методов класса Math (догадайтесь по названиям) из массива {-13, 9, -314, -89, 98, 52, -4}:
//        построить новый массив, в котором все числа - положительные
//        построить новый массив, в котором все числа - отрицательные
        System.out.println(line);
        System.out.println(task + 15);

        int[] array1 = {-13, 9, -314, -89, 98, 52, -4};
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Math.abs(array1[i]);
        }
        System.out.println(Arrays.toString(array1));

        for (int i = 0; i < array1.length; i++) {
            array1[i] = Math.negateExact(array1[i]);
        }
        System.out.println(Arrays.toString(array1));


//        С помощью методов класса Math построить массив int[] из 10 случайных положительных
//        трехзначных чисел (random numbers). Числа должны быть не больше 1000.
//        Методы: Math.toIntExact(), Math.round(), Math.random()

        System.out.println(line);
        System.out.println(task + 18);

        int [] array2 = new int [10];
        for(int i = 0;i<array2.length; i++){
            array2[i]= Math.toIntExact(Math.round(Math.random() * 900+100));
        }
        System.out.println(Arrays.toString(array2));

//        С помощью методов класса Math построить новый массив double[],
//        в котором содержится квадратный корень каждого значения массива из задания 18.

//        С помощью методов класса Math и смекалки создать массив чисел от 1.11 до 1.99 включительно
//        Методы Math.round(), Math.nextUp()



        for ( int i = 0; i<=9; i++){
            for(int j = 0; j<i; j++){
                System.out.print(i + " ");
            }
        }


    }

}