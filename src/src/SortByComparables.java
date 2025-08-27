import java.util.Arrays;

public class SortByComparables{

    public static <T extends Comparable<T>> void sort(T []arr){

        for(int i=0;i<arr.length;i++){
            int minIndex = i;
            for(int j=1;j< arr.length;j++){
                if(arr[minIndex].compareTo(arr[j]) == -1){
                    minIndex = j;
                }
            }
            T temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[]args){
        CharComparables a = new CharComparables('a', 'b');
        CharComparables b = new CharComparables('e', 'f');
        CharComparables c = new CharComparables('a', 'd');
        CharComparables d = new CharComparables('c', 'c');
        CharComparables e = new CharComparables('d', 'e');
        CharComparables f = new CharComparables('b', 'h');
        CharComparables g = new CharComparables('c', 'c');
        CharComparables h = new CharComparables('c', 'd');
        CharComparables i = new CharComparables('b', 'b');
        CharComparables j = new CharComparables('d', 'e');
        CharComparables[] CharComparablesArr = {a, b, c, d, h, g, h, i, j};
        System.out.println(Arrays.toString(CharComparablesArr));
        SortByComparables.sort(CharComparablesArr);
        System.out.println(Arrays.toString(CharComparablesArr));
    }
}