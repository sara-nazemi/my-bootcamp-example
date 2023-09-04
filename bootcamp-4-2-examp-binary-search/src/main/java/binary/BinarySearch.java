package binary;

public class BinarySearch {

    public static int[] quickSort(int[] a) {
        int left = 0;
        int right = a.length - 1;
        int pvot = 0;
        int temp;

        while (true) {
            if (a[pvot] == a[left]) {
                if (a[pvot] < a[right]) {
                    right--;
                } else {
                    // swap
                    temp = a[pvot];
                    a[pvot] = a[right];
                    a[right] = temp;
                }
            } else if (a[pvot] == a[right]) {
                if (a[pvot] > a[left]) {
                    left++;
                } else {
                    // swap
                    temp = a[pvot];
                    a[pvot] = a[left];
                    a[left] = temp;
                }

            }

            if (a[pvot] == a[right] && a[pvot] == a[left] && a[right] == a[left]) {
                break;
            }
        }
        return a;
    }

    private static int binarySearch(int[] a, int left, int right, int search) {
        int mid = (right + left) / 2;

        if (a[mid] == search) {
            return mid;
        }

        if (right == left) {
            return -1;
        }

        if (a[mid] > search) {
            //recursive left
            return binarySearch(a, 0, mid - 1, search);
        }
        if (a[mid] < search) {
            //recursive right
            return binarySearch(a, mid + 1, right, search);
        }

        return -1;
    }

    public static int binarySearch(int[] a, int search) {
        return binarySearch(a, 0, a.length - 1, search);
    }
}