package practice;

public class HHJ {
    public static int getResult3(int a, int b) {
        int res = 0;
        for (int i = -a; i <= b; i += 3) {
            System.out.println(i);

        }
        return res;
    }
    //Распечатать последовательность чисел:
//        1 5 25 125 625 3125 15625 78125 390625

    public static int getMut(int a) {
        int a1 = 0;
        for (int i = a; i <= 390625; i *= 5) {
            System.out.println(i);
        }
        return a1;
    }
//    Распечатать последовательность чисел:
//        1, 10, 100, 1000, 10000, 100000, 1000000

    public static int getRes(int a, int b) {
        int a2 = 0;
        for (int i = a; i <= b; i *= 10) {
            System.out.println(i);
        }
        return a2;
    }
    //   Распечатать последовательность чисел:
////        1, -1, 2, -2, 3, -3, ... -10, 10
//


    public static void main(String[] args) {
        String line = "——————————————————————————————————————————————————————————";
        getResult3(10, 10);

        System.out.println(line);
        getMut(5);

        System.out.println(line);
        getRes(10, 100000);
        System.out.println(line);


    }
}

