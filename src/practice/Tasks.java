package practice;

public class Tasks {
    // Написать программу (алгоритм), которая проверяет число на нечетность. Если число нечетное, то программа делает
    // его негативным, иначе уменьшает число в 2 раза. Если число = 0, то программа печатает "Число равно 0".

    //1. Метод ,который делает число нечетным
    public static boolean isNumberOdd(int number){
        if (number % 2!= 0 ){
            return true;
        } else{
            return false;
        }
    }
    //2. Если числоНечетное==true, сделать отрицание этого числа=(-1)* число; -----> Действя выполняются в зависимости
    //3. Если числоНечетное== false, то число = число / 2

    //4.Метод который проверяет что число ==0
    public static boolean isNumberZero(int number){
        if(number==0){
            return true;
        }else{
            return false;
        }
    }
    // 5 Если  isNumberZero ==true to return "Error : число равно ";
    public static String checkNumber(int number){
        if(isNumberZero(number)){
            return "Error: число равно 0";
        }else if (isNumberOdd(number)){
            number=(-1)*number;
        }else {
            number=number/2;
        }
        return String.valueOf(number);
    }
    public static String assertStringResult(String expectedResult, String  actualResult){
        if(expectedResult.equals(actualResult)){
            return "Passed";
        }else{
            return "Failed";
        }
    }

    public static void main(String[] args) {

        int number1 = 17;
        String expectedResult1= "-17";
        String actualResult1= checkNumber(number1);

        System.out.println(assertStringResult(expectedResult1, actualResult1));

    }
}
