public class ArrayList<T> {
    private Object[] list;
    private int size;
    private static final int STARTING_LIST_SIZE = 4;

    public ArrayList() {
        this.list = new Object[STARTING_LIST_SIZE];
        this.size = -1;
    }

    public void add(T item) {
        if (this.size == this.list.length - 1) {
            Object[] newList = new Object[this.list.length * 2];
            for (int i = 0; i < this.size + 1; i++) {
                newList[i] = this.list[i];
            }
            this.list = newList;
        }
        this.size++;
        this.list[this.size] = item;
    }

    public Object get(int index) {
        return this.list[index];
    }

    public void set(T item, int index) {
        this.list[index] = item;
    }

    public <T> T[] asArray() {
        Object[] compressed = new Object[size + 1];
        for (int i = 0; i < compressed.length; i++) {
            compressed[i] = this.list[i];
        }
        return (T[])compressed;
    }

    public T[] getList() {
        return (T[])this.list;
    }

    public static void printArrayList(ArrayList list) {
        int count = 0;
        while(list.getList()[count]!=null) System.out.println(list.getList()[count].toString());
        count++;
    }
}