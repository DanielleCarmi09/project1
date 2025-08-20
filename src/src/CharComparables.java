public class CharComparables implements Comparable<Character>{

    @Override
    public int compareTo(){
        if(this.A>b) return 1;
        else if (a == b) return 0;
        else return -1;
    }
}