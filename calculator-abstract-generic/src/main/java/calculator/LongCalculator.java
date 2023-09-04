package calculator;

import java.util.Arrays;

public class LongCalculator extends NumericCalculator<Long> {
    Long[] a;


    public LongCalculator(Long[] a) {
        super(a);
        this.a = a;
    }

    @Override
    public void remove(int index) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i].equals(a[j]) && i != j) {
                    remove2(j);
                }
            }
        }
        System.out.println("new array is : " + Arrays.toString(a));
    }

    @Override
    public void add(Long item) {
        Long[] newArray = new Long[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
        }
        newArray[a.length] = item;
        this.a = newArray;

    }

    @Override
    public void set(int index, Long item) {
        a[index] = item;

    }

    private void remove2(int x) {
        Long[] b = Arrays.copyOf(a, a.length);
        a = new Long[a.length - 1];
        for (int i = 0; i < b.length; i++) {
            if (i != x) {
                int i2 = i < x ? i : i - 1;
                a[i2] = b[i];
            }
        }
    }

    @Override
    public Double avg() {
        Double avg = sum() / a.length;
        System.out.println("average is : " + avg);
        return avg;
    }

    @Override
    public int compare(Long[] b) {
        if (a.length == b.length) {
            return 0;
        }
        if (a.length > b.length) {
            return 1;
        }
        if (a.length < b.length) {
            return -1;
        }
        return -2;
    }

    @Override
    public Double sum() {
        Double sum = 0.0;
        for (Long i : a) {
            sum += i;
        }
        System.out.println("sum is : " + sum);
        return sum;
    }

    @Override
    public Long max() {
        Long max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(" max is : " + max);
        return max;
    }

    @Override
    public Long min() {
        Long min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(" min is : " + min);
        return min;
    }

    @Override
    public LongCalculator subArray(int from, int to) {
        if (a.length == 0) {
            System.err.println("error");
        }
        if (to < from) {
            System.err.println("error");
        }
        if (from < 0) {
            System.err.println("error");
        }
        if (from >= a.length) {
            System.err.println("error");
        }
        Long[] result = new Long[to - from];
        int index = 0;
        for (int i = from; i <= to; i++) {
            result[index++] = a[i];
        }
        System.out.println("sub array is :" + Arrays.toString(result));
        return this;
    }

    @Override
    public LongCalculator reverse() {
        Long[] b = new Long[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            b[((a.length - 1) - i)] = a[i];
        }
        System.out.println("revers is : " + Arrays.toString(b));
        return this;
    }

    @Override
    public Boolean contains(Long item) {
        return indexOf(item) >= 0;
    }


    public int indexOf(Long item) {
        for (int i = 0; i < this.a.length; i++) {
            if (this.a[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public LongCalculator findOfAllPrimes() {
        int count = 0;
        for (long i : a) {
            if (isPrime(i)) {
                count++;
            }
        }
        Long[] result = new Long[count];
        int index = 0;
        for (long i : a) {
            if (isPrime(i)) {
                result[index++] = i;
            }
        }
        return this;
    }

    @Override
    public Long findFirstPrimes() {
        for (long i : a) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
        return null;
    }

    public boolean isPrime(Long i) {
        int count = 0;
        for (int j = 0; j <= (i / 2); j++) {
            if (i % j == 0) {
                count++;
            }
        }
        return count == 1;
    }
}
