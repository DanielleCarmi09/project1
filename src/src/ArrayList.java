public class ArrayList<T> {
    private Object[] List;
    private int index;
    private final int STARTING_LIST_SIZE = 4;

    public ArrayList() {
        this.List = new Object[STARTING_LIST_SIZE];
        this.index = 0;
    }

    public void add(T item) {
        if (this.index == this.List.length - 1) {
            Object[]newList = new Object[this.List.length * 2];

            this.List[this.index+1] = item;
        } else {
            this.List[index] = item;
        }
        index++;
    }

    public Object get(int index) {
        return this.List[index];
    }

    public void set(T item, int index) {
        this.List[index] = item;
    }

    public Object[] AsArray() {
        int count = 0;
        while (this.List[count] != null) {
            count++;
        }
        Object[] compressed = new Object[count + 1];
        for (int i = 0; i < compressed.length; i++) {
            compressed[i] = this.List[i];
        }
        return compressed;
    }

    public Object[] getList() {
        return this.List;
    }

    public static void printArrayList(ArrayList list) {
        for (int i = 0; i < list.getList().length; i++) {
            if (list.getList()[i] != null) {
                System.out.println(list.getList()[i]);
            }
        }
    }
}