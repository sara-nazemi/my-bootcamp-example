package calculator;

import java.util.Arrays;

public class StringCalculator extends GeneralCalculator<String> {

    String[] a;

    public StringCalculator(String[] a) {
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

    private void remove2(int x) {
        String[] b = Arrays.copyOf(a, a.length);
        a = new String[a.length - 1];
        for (int i = 0; i < b.length; i++) {
            if (i != x) {
                int i2 = i < x ? i : i - 1;
                a[i2] = b[i];
            }
        }
    }

    @Override
    public void add(String item) {
        String[] newArray = new String[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
        }
        newArray[a.length] = item;
        this.a = newArray;
    }

    @Override
    public void set(int index, String item) {
        a[index] = item;

    }

    @Override
    public int compare(String[] b) {
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
    public GeneralCalculator<String> subArray(int from, int to) {
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
        String[] result = new String[to - from + 1];
        int index = 0;
        for (int i = from; i <= to; i++) {
            result[index++] = a[i];
        }
        System.out.println("sub array is :" + Arrays.toString(result));
        return this;
    }

    @Override
    public GeneralCalculator<String> reverse() {
        String[] b = new String[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            b[((a.length - 1) - i)] = a[i];
        }
        System.out.println("revers is : " + Arrays.toString(b));
        return this;
    }

    @Override
    public Boolean contains(String item) {
        return indexOf(item) >= 0;
    }

    @Override
    public int indexOf(String item) {
        for (int i = 0; i < this.a.length; i++) {
            if (this.a[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }
}
