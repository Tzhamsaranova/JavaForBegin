package practice;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Practic_1 {
    public static void main(String[] args) {
        //Задача 1. Создайте цикл for с помощью которого Вы выведете в консоль числа от 15 до 8
//        for (int i=15; i<8; i=i-1){
//            System.out.println(i + " ");
//        }


        //Задача 2. Создайте цикл for с помощью которого Вы выведете в консоль числа от 500 до 550
//        for(int i = 500; i<550; i++){
//            System.out.print(i + " " );
//        }

        //Задача 3. Поделите все числа от 0 до 10 на 2 и выведете результат в консоль
//        int j = 0;
//        for(int i= 0; i<=10; i++){
//
//            System.out.println(  i/2.0 + " ");
//        }



        //Задача 4. Увеличьте все числа от 0 до 10 в 2.5 раза и выведете результат в консоль
//         for( int i = 0; i<=10; i++){
//             System.out.println(i * 2.5 + " ");
//         }

        //Задача 5.При помощи цикла возведите число 11 в 4 степень
//        int a = 11;
//         for(int i = 0; i<3; i=i+1){
//             a = a*11;
//         }
//        System.out.println(a );

        //цикл while

        //Задача 6. Выведете в консоль 5 раз "Я буду лучшим QA"
        int b = 0;

        while (b<5 ){
            b++;
            System.out.println(" Я буду лучшим QA");


        }

        //Задача 7. Возведите число 15 в 3 степень, все результаты вывести в консоль
        System.out.println( "Задача 7");
        int c = 15;
        int i1 = 0;
        while (i1<2 ){
            c = c*15;
            i1++;

            System.out.println(c);

        }

        //цикл do while

        //Задача 8. Еще 5 минуток на поспать. Выведет в консоль время с 7:00 до 7:30 и после надпись "я проспал"
        System.out.println("task 8");

        int d = 0;
        do {
            System.out.println("7:" + d + "Еще 5 минуток на поспать" );
            d = d+5;
        }while (d<=30);
        System.out.println("я проспал");



        //Задача 9. Вывести в консоль числа от 0 д 10 с использованием цикла do-while
        int e = 0;
        do{
            System.out.print(e + " ");
            e++;
        } while (e<=10);




        //if-else

        //Задача 10.  Проверить 5 чисел на четность
        int k = 0;
        for(int i= 0;i<=5; i++ ){
            if (i%2==0){
                System.out.println(i + "Четное");
        }else {
                System.out.println(i + "Не четное");
                }
            }

        //Задача 11. Вывести все четные числа в обратном порядке от 20 до 0
        for(int i=20; i>=0; i--){
            if(i%2==0);
            System.out.print(i + " ");

        }

        //Задача 12. В классе 32 ученика, каждый третий ученик умеет играть в футбол, вывести в консоль количество
        //           учеников которые умеют играть в футбол
        int sum = 0;
        for (int i=0; i<32; i++){
            if(i%3==0){
                sum ++;
                System.out.println(sum);
            }
        }
        //Задача 12. Создать массив и заполнить его числами от 0 до 10
         int []arr = {0,1,2,3,4,5,6,7,8,9,10};
        //Задача 13. Создать массив и заполнить его четными числами от 0 до 10
//        int[] array = new int[6];
//        int j = 0;
//        arr[0] = 0;
//        arr[0] = 0;
//        arr[1] = 2;
//        arr[2] = 4;
//        arr [3]= 6;
//        arr[4]= 8;
//        arr[5]= 10;
//        for(int i=0; i<=10; i++){
//            if( i%2==0){
//                array[j]= i;
//                j++;
//            }
//        }
//        System.out.println(Arrays.toString(array));


        //Задача 14. Вывести в консоль все элементы массива при помощи цикла while
        int [] ac = {1,2,4,6};
        int q = 0;
        while (q< ac.length){
            q++;
            System.out.println(Arrays.toString(ac));
        }
        //Задача 15. Найти максимальный элемент в массиве
        int max =  0;
        for( int i= 0; i< ac.length; i++){
            if (max < ac[i]) {
                max = ac[i];

            }
        }
        System.out.println(max);

        //Задача 16. Вычислить среднее арифметическое число элементов массива

       int p = 0;
       for(int i=0; i< ac.length; i++){
           p = p + ac[i];
       }
        System.out.println((double) p/ ac.length);

        //Задача 17. Заполнить массив размером на 20 элементов при помощи цикла
        int[] as = new int [20];
        System.out.println(Arrays.toString(as));
        for(int i= 0; i< as.length;i++ ){
            as[i]= i;

        }
        System.out.println(Arrays.toString(as));

        //Задача 18. Заполнить строковый массив при помощи цикла, строку и размер можно любые
        String[] str = new String [20] ;
        for(int i = 0; i< str.length; i++){
            str[i]= "Hello world!";
            System.out.println(str[i]);
        }
        System.out.println(Arrays.toString(str));

        //Задача 19. Необходимо вывести минимальное число массива
        int [] str2 = {2, 57, 198, -98, 4};
        int min = Integer.MAX_VALUE;
        for(int i=0; i<str2.length; i++){
            if(min>str2[i]){
                min = str2[i];
            }
        }
        System.out.println(min);


        //Задача 20. Создать двумерный массив и заполнить его
        int [] [] str3 = {{2, 6 , 343}, {-87, 3}};
        System.out.println(Arrays.deepToString(str3));

        //Задача 21. Вывести при помощи цикла массив в консоль
//        int [] [] str4 = {{7,5,3}, {-6, 2 }};
//        for (int i = 0; i< str.length; i++){
//            for (int j = 0; j<str4[i].length; j++){
//                System.out.println(str4[i][j] + "/n" + " ");
//
//            }
//        }

        //Задача 22. Вывести сумму элементов массива
//        int [][] str5 = {{7, 5, 3}, {-6, 2 }};
//        int sum1 = 0;
//        for (int i=0; i<str5.length;i )


        //Задача 23. Вывести максимальный элемент массива
        int [][]str6 = {{7, 5, 3}, {-6, 2 }, { 3, 5, 8}};
        int max1= Integer.MIN_VALUE;
        for (int i = 0; i< str6.length; i++){
            for(int j = 0; j<str6[i].length; j++){
                if(max1<str6[i][j]){
                    max1= str6[i][j];

                }

            }
        }
        System.out.println(max1);

        //Задача 24. Создать массив из 15 элементов и вывести в консоль с 4 по 9 элемент массива
        int [] str7 = new int [15];
        for(int i = 0; i< str7.length;i++){
            str7[i] = i;

        }
        System.out.println(Arrays.toString(str7));
        for (int i=4; i<=9; i++){
            System.out.println(str7[i] + " ");

        }


        System.out.println("Задача 25. Создать двумерный массив и вывести в консоль его размер ");
        int [] [] arr3 = {{7, 5, 3}, {-6,2, 5 }, { 3, 5, 8}};
        int v = 0;
        for(int i = 0; i< arr.length; i++){
            v = v + arr3[i].length;
        }

        System.out.println(v);

    }
}
