public interface WeakFilter<T> {

    boolean getFilterResult(T value);
    default WeakFilter<T> and(WeakFilter<? super T> filter){
        return (T value) -> this.getFilterResult(value) && filter.getFilterResult(value);
    }
    default WeakFilter<T> or(WeakFilter<? super T> filter){
        return (T value) -> this.getFilterResult(value) || filter.getFilterResult(value);
    }
}