public class booleanInformationSignal implements informationSignal<Boolean>{
    private Boolean value;
    private ArrayList<Boolean> formerValues;
    private final int STARTING_ARRAY_LENGTH = 4;
    public booleanInformationSignal(Boolean value){
        this.value = value;
        this.formerValues = new ArrayList<Boolean>(new Boolean[STARTING_ARRAY_LENGTH]);
    }

    @Override
    public Boolean getLatestValue(){
        return this.value;
    }

    @Override
    public void update(Boolean newValue){
        formerValues.add(this.value);
        this.value = newValue;
    }

    @Override
    public Boolean[] AsArray(){
        return (Boolean[]) formerValues.AsArray();
    }
}