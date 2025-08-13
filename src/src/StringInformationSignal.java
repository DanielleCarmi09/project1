public class StringInformationSignal implements informationSignal<String>{
    private String value;
    private ArrayList<String> formerValues;
    private final int STARTING_ARRAY_LENGTH = 4;
    public StringInformationSignal(String value){
        this.value = value;
        this.formerValues = new ArrayList<String>(new String[STARTING_ARRAY_LENGTH]);
    }

    @Override
    public String getLatestValue(){
        return this.value;
    }

    @Override
    public void update(String newValue){
        formerValues.add(this.value);
        this.value = newValue;
    }

    @Override
    public String[] AsArray(){
        return (String[]) formerValues.AsArray();
    }
}