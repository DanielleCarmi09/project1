public class GenericInformationSignal<T> implements informationSignal {

    private T value;
    private ArrayList<T> formerValues;

    public GenericInformationSignal(T value) {
        this.value = (T) value;
        this.formerValues = new ArrayList<T>();
    }

    @Override
    public T getLatestValue() {
        return this.value;
    }

    @Override
    public void update(Object newValue) {
        formerValues.add(this.value);
        this.value = (T) newValue;
    }

    @Override
    public T[] AsArray() {
        return (T[]) formerValues.asArray();
    }

}