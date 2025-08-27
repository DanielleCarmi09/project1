public record CharComparables(char a, char b) implements Comparable<CharComparables>{

    @Override
    public int compareTo(CharComparables comparable){
        if(this.a>comparable.a) return 1;
        else if (this.a == comparable.a){
            if (this.b>comparable.b) return 1;
            else if (this.b==comparable.b) return 0;
            else return -1;
        }
        else return -1;
    }

    @Override
    public String toString() {
        return "(" + a + ", " + b + ")";
    }
}