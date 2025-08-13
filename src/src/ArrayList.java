public class ArrayList<T>{
    private Object[] List;
    public ArrayList(Object[]List){
        this.List = List;
    }

    public void add(T item){
        int index = 0;
        while(this.List[index]!=null || index <this.List.length){
            index++;
        }
        if(index == this.List.length-1){
            this.List = new Object[this.List.length*2];
            this.List[index] = item;
        }else{
            this.List[index] = item;
        }
    }

    public Object get(int index){
        return this.List[index];
    }

    public void set(T item, int index){
        this.List[index] = item;
    }

    public Object[] AsArray(){
        int count = 0;
        while(this.List[count]!=null){
            count++;
        }
        Object[]compressed = new Object[count+1];
        for(int i=0;i<compressed.length;i++){
            compressed[i] = this.List[i];
        }
        return compressed;
    }

    public Object[] getList(){ return this.List;}

    public static void printArrayList(ArrayList list){
        for(int i = 0; i<list.getList().length;i++){
            if(list.getList()[i]!=null){
                System.out.println(list.getList()[i]);
            }
        }
    }
}