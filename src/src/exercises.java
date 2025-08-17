

public class exercises {

    public static void ex1() {
        isInString i = (String str, char ch) -> str.indexOf(ch)!=-1;
    }

    public static void ex2(){
        NumInPower numInPower = (int num1, int num2) -> (int) Math.pow(Math.min(num1, num2), Math.max(num1, num2));

    }

    public static void ex3(){
        PrintInt printInt = (num, getInt) -> System.out.println(getInt.returnNum(num));
    }
    
}