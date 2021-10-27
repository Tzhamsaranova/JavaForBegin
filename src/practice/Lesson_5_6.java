package practice;

public class Lesson_5_6 {

    public static void main(String[] args) {
        //Написать программу или алгорит который проверяет число на нечетность.Если число нечетное то программа делает
        // его негативным иначе уменьшает число в 2 раза.Если число =0  то программа печатает число равно 0.

        int number;
        number = 6;


        if (number == 0) {
            System.out.println("число равно 0");
        } else if (number % 2 != 0) {
            number = number * (-1);
            //System.out.println(number);
        } else {
            number = number / 2;
            // System.out.println(number);

        }
        //expectedResult
        // actualResult
//TestCase
        int testNumber = 6;
        int expectedResult = 4;
        int actualResult = number;
        if (expectedResult == actualResult) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        System.out.println(expectedResult == actualResult);



            }


        }

