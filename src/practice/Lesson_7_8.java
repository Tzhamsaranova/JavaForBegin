package practice;

public class Lesson_7_8 {

    //void methodName(){
    //     method body
    //}
    public static void printLine() {
        System.out.println("————————————————————————————————————————————");
    }

    public static void printLine1(String line) {
        System.out.println(line);
    }

    public static String printLine2(String line) {

        String text = "Yes yes yes";
        System.out.println("Yes yes yes");
        printLine1(line);
        printLine1(line);
        printLine1(line);
        return text;
    }
    public static int returnNumber(int number){
        return number;

    }
    public static void printTask(int number){
        printLine();
        System.out.println("Task #"+ number);
    }
    public static void printTestResult(int number){
        printLine();
        System.out.println("Test #"+ number);
    }


    public static String printName(String name) {
        String text1 = "Сосна";
        String text2 = "Дуб";
        String text3 = "Вишня";
        String text4 = "Клён";
        System.out.println(name);
        return text1;

    }



    public static void main(String[] args) {
//        printLine();
//        printLine1("**************************************************");
//        printLine1("#########################");
//        printLine2("$$$$$$$$$$$$$$$$$$$");
        //System.out.println(printLine2("$$$$$$$$$$$$$$$$$$$$$$$$$$$"));

//        printLine();
//        int a1 = 2;
//        int b1 = 7;
//        getResult(a1, b1);
       // printLine2("%%%%%%%%%%%%%%%%%%%");
        //System.out.println(printLine2("####################"));



        System.out.println(returnNumber(5));
        printTask(1);
        printTestResult(250);

        int digit= 10;
        int result= returnNumber(digit);
        System.out.println(returnNumber(digit));

    }
}
