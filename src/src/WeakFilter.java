public interface WeakFilter {

    boolean getFilterResult(T value);
    default <E super T> WeakFilter<E> and(WeakFilter<E> filter, E value){
        return new WeakFilter() {
            @Override
            public boolean getFilterResult(E value) {
                return this.getFilterResult(value) && filter.getFilterResult(value);
            }
        };
    }
    default <E super T> WeakFilter<E> or(WeakFilter<E> filter, E value){
        return new WeakFilter() {
            @Override
            public boolean getFilterResult(E value) {
                return this.getFilterResult(value) || filter.getFilterResult(value);
            }
        };
    }
}