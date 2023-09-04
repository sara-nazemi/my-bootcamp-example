package calculator;

public abstract class NumericCalculator<T extends Number> extends GeneralCalculator<T> {

    public NumericCalculator(T[] a) {
        super(a);
    }

    public abstract void remove(int index);

    public abstract Double avg();

    public abstract int compare(T[] b);

    public abstract Double sum();

    public abstract T max();

    public abstract T min();

    public abstract NumericCalculator<T> subArray(int from, int to);

    public abstract NumericCalculator<T> reverse();

    public abstract Boolean contains(T item);

    public abstract int indexOf(T item);

    public abstract NumericCalculator<T> findOfAllPrimes();

    public abstract T findFirstPrimes();


}
