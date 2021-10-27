package practice;

import java.sql.SQLOutput;

public class HW_5_6 {

    public static void main(String[] args) {
        String line = "———————————————————";

        //task1
        int a = 2;
        int b = 7;
        if ((2 == 2) && (7 == 7)) {
            System.out.println(true);

        }

        System.out.println(line);
        //task2
        if (!(15 < 3)) ;
        System.out.println(!(15 < 3));

        System.out.println(line);
        //task3

        String str1 = "Сосна";
        String str2 = "Дуб";
        String str3 = "Вишня ";
        String str4 = "Клён ";
        System.out.println(str1.equals(str2) || (str3.equals(str4)));


        System.out.println(line);
        //task4
        String str5 = "Сосна";
        String str6 = "Дуб";
 //       if (!("Сосна" = "Дуб"));
        System.out.println(!(str5.equals(str6)));

        System.out.println(line);
        //task5
        if (!(15 < 3) && (10 > 20)) ;
        System.out.println(false);

        System.out.println(line);
        //Task6
        String a1 = "Глаза даны, чтобы видеть";
        String a2 = "Под третьим этажом находится второй этаж";

        System.out.println("a1 && a2");


        System.out.println(line);
        //task6

        int j = 12;
        if (j >= 16) {
            System.out.println("You can get driver license");
        } else {
            System.out.println("You can not get driver license");
        }
//
//        9.”Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно”
//
//        10. “Если с другом ты, это хорошо, а когда наоборот - плохо”


        System.out.println(line);
        //if -else + test
        //task1
        int number = 2;
        if (number % 2 == 0) {
            System.out.println("Четное число " + number);
        } else {
            System.out.println("Нечетное число + " + number);

            number = number * 2;
        }
        System.out.println(number);


//TestCase

        int expectedResult = 2;
        int actualResult = number;
        if (expectedResult == actualResult) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        System.out.println(expectedResult == actualResult);


        System.out.println(line);
        //Напишите алгоритм проверки возраста на соответствие условиям:
        //Голосовать можно с 18 лет
        //Машину можно водить с 16 лет
        //В школу можно идти с 5 лет
        //Напишите тест, который валидирует ваш код. Придумайте тестовые данные. Выведите результат проверки на печать.
        int age = 15;
        if (age < 18) {
            System.out.println("You can not vote");
        } else {
            System.out.println("you can vote");
        }  //test
        if (age < 16) {
            System.out.println("You can drive");
        } else {
            System.out.println("you can not drive");
        }
        if (age < 5) {
            System.out.println("you can go to school");
        } else {
            System.out.println("you can not go to school");
        }
        //test
        int expectedResult1 = 18;
        int actualResult1 = age;
        if (expectedResult1 == actualResult1) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        System.out.println(expectedResult1 == actualResult1);


        System.out.println(line);
        //task 3
        int c = 3;
        if ( c >2 && c<5) {
        } else if (c == 5) {
            System.out.println("Выдать похвальную грамоту и перевести в следующий класс");
        } else if (c == 4) {
            System.out.println("Перевести в следующий класс");

        } else if (c == 3) {
            System.out.println("Дать задание на лето и перевести в след класс");

        } else if (c == 2) {
            System.out.println("Вызвать родителей и оставить текущем классе");
        }
        int expectedResult2 = 5;
        int actualResult2 = a;
        if (expectedResult2 == actualResult2) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");

        }
        System.out.println(expectedResult2 == actualResult2);


        System.out.println(line);
        //Task 4

        int n = 100;
        if ((n / 10) == 0) {
            System.out.println("Single digit" + n);
        } else {
            System.out.println("it is a two-digit number" + n);
        }


        System.out.println(line);


        int num = 20;
        int res = 0;
        if (num % 3 == 0) {
            res += num;
            System.out.println(res + " ");
        }
        if (num % 5 == 0) {
            res -= num;
            System.out.println(res + " ");
        }


    }


}
