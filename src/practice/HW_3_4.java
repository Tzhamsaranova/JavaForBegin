package practice;

public class HW_3_4 {
    public static void main(String[] args) {
        String max = "Максимальное значение типа данных";
        String min = "Минимальное значение типа данных";

        Short s = Short.MAX_VALUE;
        System.out.println(max + s.getClass().getSimpleName() + " = " + s);

        Short ss = Short.MIN_VALUE;
        System.out.println(min + ss.getClass().getSimpleName() + "=" + ss);


        byte b = Byte.MIN_VALUE;
        System.out.println("min value of byte b =" + b);

        byte b1 = Byte.MAX_VALUE;
        System.out.println("max value of byte b1 =" + b1);


        Integer ii = Integer.MIN_VALUE;
        System.out.println(min + ii.getClass().getSimpleName() + "=" + ii);

        int i = Integer.MAX_VALUE;
        System.out.println("max value of int i =" + i);
        i = ii;
        System.out.println(min + "int=" + i);


        Integer iI = Integer.MAX_VALUE;
        System.out.println(max + iI.getClass().getSimpleName() + "=" + iI);

        //int i = Integer.MIN_VALUE;
        //System.out.println("min value of int =" + ii);
        //22
        double pi = 3.14;
        System.out.println(pi);
        pi = Math.PI;
        System.out.println(pi);


        //23
        for (char alphabet = 'а'; alphabet <= 'я'; alphabet++) {
            System.out.println(alphabet);
        }


        Long number4 = 9876543210l;
        for (int number = 9; number > 1; number--) {
            System.out.println(number4);

            float e = 2.718F;
            System.out.println("Euler's number:" + e);


            Double d = 10.099 + 20.0999;
            Double d1 = (double) (10.099 + 20.0999);
            System.out.println("Результат Double d =" + d);
            System.out.println("Результат Double d =" + d1);
            System.out.println(d.toString());
            System.out.println(String.valueOf(d));

            Float f;
            f = 10.099f + 20.0999f;
            Float f1 = (float) (10.099 + 20.0999);
            System.out.println("Float number in f is" + f);
            System.out.println("Float number in f is" + f1);

            //Float f2 = d;
            String dd = d.toString();
            Float f2 = Float.valueOf(dd);


            short ssss;
            ssss = (short) (8000 * 4000);
            System.out.println("Результат произведения =" + ssss);

            short sss = (short) (800 * d);
            System.out.println(sss);


            int number6 = Integer.MIN_VALUE - 1;
            long number3 = Integer.MIN_VALUE - 1l;

            System.out.println(number);
            System.out.println(number3);


            char c = 'a';
            final int cc = 'а';
            System.out.println((int) (c) + " ,");
            System.out.println(cc + " , ");
            System.out.println((char) (c + 25));
            System.out.println((char) (cc + 31));


            String classHeader = "класс";
            String ageHeader = "лет";
            String space = " ";
            String line = "——————————————————————";
            String nameStudent1 = "Вова";
            String lastNameStudent1 = "Сидоров";
            int ageStudent1 = 12;
            String genderStudent1 = "М";
            int gradeStudent1 = 6;

            String nameStuden2 = "Маша";
            String lastNameStudent2 = "Семенова";
            int ageStudent2 = 7;
            String genderStudent2 = "Ж";
            int gradeStudent2 = 1;


            System.out.println(nameStudent1 + space + lastNameStudent1);
            System.out.println(ageStudent1 + space + ageHeader);
            System.out.println(genderStudent1);
            System.out.println(gradeStudent1 + space + classHeader);

            System.out.println(line);
            System.out.println(nameStuden2 + space + lastNameStudent2);
            System.out.println(ageStudent2 + space + ageHeader);
            System.out.println(genderStudent2);
            System.out.println(gradeStudent2 + space + classHeader);


        }
    }
}

















