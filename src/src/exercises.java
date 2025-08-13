public class exercises {

    public static void ex1() {
        isInString i = (String str, char ch) -> charInString("hello", ch);
    }

    public static void ex2(){
        NumInPower numInPower = (int num1, int num2) -> {
            if(num1>num2) return (int)Math.pow(num2, num1);
            else return (int)Math.pow(num1, num2);
        };
    }

    public static void ex3(){
        printInt printInt = (num, getInt) -> System.out.println(getInt(num));
    }
    
}