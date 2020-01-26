public class Pair<T, O> {
    private T value1;
    private O value2;

    public Pair(T value1, O value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return this.value1;
    }

    public O getValue2() {
        return this.value2;
    }
}
