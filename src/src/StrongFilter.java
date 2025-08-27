public interface StrongFilter<T>{

    boolean getFilterResult(T value);
    default <E extends T> StrongFilter<E> and(StrongFilter<E> filter){
        return value -> this.getFilterResult(value) && filter.getFilterResult(value);
    }

    default <E extends T> StrongFilter<E> or(StrongFilter<E> filter){
        return value -> this.getFilterResult(value) || filter.getFilterResult(value);
    }
}