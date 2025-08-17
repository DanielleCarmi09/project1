public interface StrongFilter<T>{

    boolean getFilterResult(T value);
    default <E extends T> StrongFilter<E> and(StrongFilter<E> filter, E value){
        return new StrongFilter<E>() {
            @Override
            public boolean getFilterResult(E value) {
                return this.getFilterResult(value) && filter.getFilterResult(value);
            }
        };
    }
    default <E extends T> StrongFilter<E> or(StrongFilter<E> filter, E value){
        return new StrongFilter<E>() {
            @Override
            public boolean getFilterResult(E value) {
                return this.getFilterResult(value) || filter.getFilterResult(value);
            }
        };
    }
}