package practice;

import java.util.Arrays;

public class Lesson_9_10 {
    public static void main(String[] args) {
        int [] array = new int [3];
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        array[0]= 55555;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        array[1] = 33333;
        array[2] = 44444;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        int []array10 = {22, 33, 44};

        array = array10;
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println(array10);

        array = new int[]{101,  102, 103};
        System.out.println(array); //увидим адресс массива
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);



        String [] letter = new String[2];
        System.out.println(letter);
        System.out.println(letter[0]);
        System.out.println(letter[1]);
      //  System.out.println(array[2]);

      Integer [] array1 = new Integer[4];
        System.out.println(array1);
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
          System.out.println(array1[3]);

          char [] symbols = new char [5];
        System.out.println(symbols);
        System.out.println(symbols[0]);
        System.out.println(symbols[1]);
        System.out.println(symbols[2]);
        System.out.println(symbols[3]);
        System.out.println(symbols[4]);



        String[] catsNames = new String[8];
        catsNames[0] = "Вася";
        catsNames[1] = "Кузя";
        catsNames[2] = "Снежок";
        catsNames[3] = "Барсик";
        catsNames[4] = "Рыжик";
        catsNames[5] = "Бегемот";
        catsNames[6] = "Матильда";
        catsNames[7] = "Мурка";

        System.out.println(catsNames);
        System.out.println(catsNames[0]);
        System.out.println(catsNames[1]);
        System.out.println(catsNames[6]);
        System.out.println(Arrays.toString(catsNames));

        int index;
        int endIndex = 7;
        //int endIndex = catsNames.length - 1;
        int step = 1;

        for (index = 0; index <= endIndex; index += step) {
              System.out.println(catsNames[index]);
        }


//        int boxNumber;
//        int endBoxNumber = 7;
//        //int endBoxNumber = catsNames.length - 1;
//        int step = 1;
//
//        for (boxNumber = 0; boxNumber <= endBoxNumber; boxNumber += step) {
//              System.out.println(catsNames[boxNumber]);
//        }

        for (int i = 0; i < catsNames.length; i++) {
            System.out.println(catsNames[i]);
        }

        for (int i = 0; i < catsNames.length; i++) {
            if (catsNames[i].equals("Рыжик")) {
                System.out.println("Накорми Рыжика!");
                //break;
            } else {
                System.out.println(catsNames[i] + " - кормить не надо!");
            }
        }

        System.out.println("_________________________");
        int j = 0;
        while (j < catsNames.length) {
            if (catsNames[j].equals("Рыжик")) {
                System.out.println("Накорми Рыжика!");
                //break;
            } else {
                System.out.println(catsNames[j] + " - кормить не надо!");
            }
            j++;
        }


        System.out.println("_________________________");

        for (int i = 0; i < catsNames.length; i++) {
            if (catsNames[i].equals("Рыжик")) {
                System.out.println("Накорми Рыжика!");
                break;
            }
        }







    }


    }

