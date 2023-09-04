package calculator;

import java.util.Arrays;
import java.util.Random;

public class IntegerCalculator extends NumericCalculator<Integer> {
    Integer[] a;

    public IntegerCalculator(Integer[] a) {
        super(a);
        this.a = a;
    }

    public void bubbleSort(int n) {
        int i, j, temp;

        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    public void randomArray(int n) {
        Random rnd = new Random();
        int num = a[rnd.nextInt(a.length)];
        System.out.println(num);
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
    public void add(Integer item) {
        Integer[] newArray = new Integer[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
        }
        newArray[a.length] = item;
        this.a = newArray;
    }

    @Override
    public void set(int index, Integer item) {
        a[index] = item;

    }

    private void remove2(int x) {
        Integer[] b = Arrays.copyOf(a, a.length);
        a = new Integer[a.length - 1];
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
        System.out.println("average type Integer is : " + avg);
        return avg;
    }

    @Override
    public int compare(Integer[] b) {
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
        for (Integer i : a) {
            sum += i;
        }
        System.out.println("sum is : " + sum);
        return sum;
    }

    @Override
    public Integer max() {
        Integer max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(" max is : " + max);
        return max;
    }

    @Override
    public Integer min() {
        Integer min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(" min is : " + min);
        return min;
    }

    @Override
    public IntegerCalculator subArray(int from, int to) {
        if (a.length == 0) {
            return null;
        }
        if (to < from) {
            return null;
        }
        if (from < 0) {
            return null;
        }
        if (from >= a.length) {
            return null;
        }
        Integer[] result = new Integer[to - from + 1];
        int index = 0;
        for (int i = from; i <= to; i++) {
            result[index++] = a[i];
        }
        System.out.println("sub array is :" + Arrays.toString(result));
        return this;
    }

    @Override
    public IntegerCalculator reverse() {
        Integer[] b = new Integer[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            b[((a.length - 1) - i)] = a[i];
        }
        System.out.println("revers is : " + Arrays.toString(b));
        return this;
    }

    @Override
    public Boolean contains(Integer item) {
        return indexOf(item) >= 0;
    }

    @Override
    public int indexOf(Integer item) {
        for (int i = 0; i < this.a.length; i++) {
            if (this.a[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public IntegerCalculator findOfAllPrimes() {
        int count = 0;
        for (int i : a) {
            if (isPrime(i)) {
                count++;
            }
        }
        Integer[] result = new Integer[count];
        int index = 0;
        for (int i : a) {
            if (isPrime(i)) {
                result[index++] = i;
            }
        }
        System.out.println(Arrays.toString(result));
        return this;
    }

    @Override
    public Integer findFirstPrimes() {
        for (int i : a) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
        return null;
    }

    public boolean isPrime(int i) {
        int count = 0;
        for (int j = 0; j <= (i / 2); j++) {
            if (i % j == 0) {
                count++;
            }
        }
        return count == 1;
    }
}
