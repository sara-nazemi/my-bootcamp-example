package calculator;

public abstract class GeneralCalculator<T> {

    protected T[] a;

    public GeneralCalculator(T[] a) {
        this.a = a;
    }

    public abstract void remove(int index);

    public abstract void add(T item);

    public abstract void set(int index, T item);

    public abstract int compare(T[] b);

    public abstract GeneralCalculator<T> subArray(int from, int to);

    public abstract GeneralCalculator<T> reverse();

    public abstract Boolean contains(T item);

    public abstract int indexOf(T item);

}
