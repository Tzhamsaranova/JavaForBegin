package practice;

public class HW_7_8 {
   //1
      public static boolean printResult(double a, double b){
          if(a==a && b==b){
              return true;
          }else {
              return false;
          }
      }
      //2
    public static boolean getResult1(int a, int b){
        if(!(a<b)){
            return true;
        }else {
            return false;
        }
    }
    //3
    public static boolean printResult(String str1, String str2, String str3, String str4){
          if(str1.equals(str2) || (str3.equals(str4))) {
              return true;
          }else {
                  return false;
              }

        }
    //tassk4
    public static boolean printResult( String str1, String str2) {
        if (!(str1.equals(str2))) {
            return true;
        } else {
            return false;
        }
    }

    //5
    public static boolean getResult(int q, int w, int e, int r){
        if (!(q < w) && (e > r)){
            return true;
        }else {
            return false;
        }
    }
    //task6
 //   public static int getResut2(int y) {
//          String result = " ";
//          if(y>=16){
//              result = ("You can get driver license");
//          } else {
//             result  = ("You can not get driver license");
//              return result;
//          }
//
//    }
        public static int isNumberOddorEven ( int number){
            if (number % 2 == 0) {
                System.out.println("odd");
            } else {
                System.out.println("even");
            }
            return number;
        }












    public static void main(String[] args) {
          String task = "Task # " ;
        String line = "——————————————————————————————————————————————";

          //task1
        System.out.println(task+1);
        int a=7;
        int b=2;
        System.out.println(printResult(a,b));
        System.out.println(line);

        //task #2
        System.out.println(task+2);
        int a1=15;
        int b1=3;
        System.out.println(getResult1(a1,b1));

        //task#3
        System.out.println(line);
        System.out.println(task+3);
        String str1 = "Сосна";
        String str2 = "Дуб";
        String str3 = "Вишня ";
        String str4 = "Клён";
        System.out.println(printResult(str1,str2,str3,str4));

        //task4
        System.out.println(line);
        System.out.println(task+4);
        System.out.println(printResult(str1,str2));

        //task5
        int aa =15;
        int bb=3;
        int cc=10;
        int dd= 20;
        System.out.println(getResult(aa,bb,cc,dd));
//
//        task6
//        System.out.println(line);
//        System.out.println(task+6);
//        int y=12;
//        getResut2(y);
        //if -else + test
        //task1
        System.out.println(line);
        System.out.println(task+1);
        isNumberOddorEven(2);


    }
}

