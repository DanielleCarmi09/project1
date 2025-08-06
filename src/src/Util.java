public class Util {
    public static Shirt[] addShirt(Shirt[] shirtsArr, Shirt shirt) {
        Shirt[] newArr = new Shirt[shirtsArr.length+1];
        for (int i = 0; i < shirtsArr.length; i++) {
            newArr[i] = shirtsArr[i];
        }
        newArr[newArr.length-1] = shirt;
        return newArr;
    }
    public static boolean isTolerant(double value, double wantedValue, double tolerance){
        return (value>=wantedValue-tolerance && value<=wantedValue+tolerance)|| (value<=wantedValue-tolerance&&value>=wantedValue+tolerance);
    }
}