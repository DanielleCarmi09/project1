public class intInformationSignal implements informationSignal<Integer>{
    private Integer value;
    private ArrayList<Integer> formerValues;
    private final int STARTING_ARRAY_LENGTH = 4;
    public intInformationSignal(Integer value){
        this.value = value;
        this.formerValues = new ArrayList<Integer>(new Integer[STARTING_ARRAY_LENGTH]);
    }

    @Override
    public Integer getLatestValue(){
        return this.value;
    }

    @Override
    public void update(Integer newValue){
        formerValues.add(this.value);
        this.value = newValue;
    }

    @Override
    public Integer[] AsArray(){
        return (Integer[]) formerValues.AsArray();
    }
}