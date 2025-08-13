public interface informationSignal<T> {
    T getLatestValue();
    void update(T value);
    Object[] AsArray();
}