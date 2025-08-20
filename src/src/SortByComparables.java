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
}