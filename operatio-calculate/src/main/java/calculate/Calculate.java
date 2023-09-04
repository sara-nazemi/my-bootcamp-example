package calculate;

import java.util.Arrays;
import java.util.Random;

public class Calculate {

    public int sum(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        System.out.println("sum is : " + sum);
        return sum;
    }

    public void average(int[] a) {
        double avg = sum(a) / a.length;
        System.out.println("average is : " + avg);
    }

    public void remove(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j] && i != j) {
                    remove2(a, j);
                }
            }
        }
        System.out.println("new array is : " + Arrays.toString(a));
    }

    private void remove2(int[] a, int x) {
        int[] b = Arrays.copyOf(a, a.length);
        a = new int[a.length - 1];
        for (int i = 0; i < b.length; i++) {
            if (i != x) {
                int i2 = i < x ? i : i - 1;
                a[i2] = b[i];
            }
        }
    }

    public void bubbleSort(int[] a, int n) {
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
            if (swapped == false)
                break;
        }
    }


    public Double divide(int[] a) {
        double div = 1;
        for (int i : a) {
            if (i == 0) {
                return null;
            }
            div /= i;
        }
        System.out.println(div);
        return div;
    }

    public Integer compare(int[] a, int[] b) {
        if (a.length == b.length) {
            return 0;
        }
        if (a.length > b.length) {
            return 1;
        }
        if (a.length < b.length) {
            return -1;
        }
        return null;
    }

    public Long multiply(int[] a) {
        long mul = 1;
        for (int i : a) {
            mul *= i;
        }
        System.out.println(mul);
        return mul;
    }

    public String toString1(int[] a) {
        StringBuilder str = new StringBuilder("[");
        for (int i : a) {
            str.append(", ");
        }
        if (!str.toString().equals("[")) {
            str.delete(str.length() - 2, str.length());
        }
        str.append("]");
        return str.toString();
    }


    public void max(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(" max is : " + max);
    }

    public void min(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(" min is : " + min);

    }

    public int[] subArray(int[] a, int from, int to) {
        if (a.length == 0) {
            return null;
        }
        if (to < from) {
            return null;
        }
        if (from < 0) {
            return null;
        }
        if (from >= a.length && to >= a.length) {
            return null;
        }
        int[] result = new int[to - from + 1];
        int index = 0;
        for (int i = from; i <= to; i++) {
            result[index++] = a[i];
        }
        System.out.println("sub array is :" + Arrays.toString(result));
        return result;
    }

    public void reverse(int[] a) {
        int[] b = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            b[((a.length -1) - i)] = a[i];
        }
        System.out.println("revers is : " + Arrays.toString(b));
    }

    public boolean contains(int[] a, int item) {
        return indexOf(a, item) >= 0;
    }

    public int indexOf(int[] a, int item) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public Integer[] findOfAllPrimes(int[] a) {
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
        return result;
    }

    public Integer findFirstPrimes(int[] a) {
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

    public void randomArray(int[] a) {
        Random rnd = new Random();
        int num = a[rnd.nextInt(a.length)];
        System.out.println(num);
    }

    public boolean isEqual(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        if (a.length == 0) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public void minus(int[] a) {
        int mi = 0;
        for (int i : a) {
            mi -= i;
            System.out.println("minus is : " + mi);
        }
    }


}
