package remove;

public class RemoveArray {
    int[] numbers = new int[]{1, 0, 2, 3, 5, 6, 7,};

    public int[] remove(int index) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                }
                if (numbers[i] == numbers[j]) {
                    shiftArray(i);
                    System.out.println("duplicate in " + numbers[j]);
                }
            }
        }
        return null;
    }

    public void shiftArray(int index) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[index] = numbers[index + 1];
            index++;
        }
        System.out.println("my new numbers is: ");
        for (int num : numbers) {
            System.out.println(num + ",");
        }
    }
}