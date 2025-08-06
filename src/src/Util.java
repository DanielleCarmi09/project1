public class Util {
    public Shirt[] addShirt(Shirt[] shirtsArr, Shirt shirt) {
        Shirt[] newArr = new Shirt[shirtsArr.length];
        for (int i = 0; i < shirtsArr.length; i++) {
            newArr[i] = shirtsArr[i];
        }
        newArr[newArr.length - 1] = shirt;
        return newArr;
    }
}