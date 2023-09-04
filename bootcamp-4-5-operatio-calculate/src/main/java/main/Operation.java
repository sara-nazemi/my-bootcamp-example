package main;

import calculate.Calculate;

import java.util.Scanner;

public class Operation {
    public static void operation() {
        Calculate calculate = new Calculate();
        Scanner in = new Scanner(System.in);
        int opr = -1;
        int[] b = Input.scannerStringToArrayInt();
        while (opr != 0) {
            System.out.println("select one of operations");
            System.out.println("0) exit\n1) sum\n2) average\n3) minus" +
                    "\n4) multiply\n5) divide\n6) max\n7) min" +
                    "\n8) compare\n9) index of\n10) contains\n" +
                    "11) reverse\n12) is equal\n13) sub array\n" +
                    "14) to string\n15) remove\n16) random array\n" +
                    "17) is prime\n18) find first prime\n19) find all primes" +
                    "\n20) bubble sort");
            opr = in.nextInt();
            switch (opr) {
                case 1:
                    calculate.sum(b);
                    break;
                case 2:
                    calculate.average(b);
                    break;
                case 3:
                    calculate.minus(b);
                    break;
                case 4:
                    calculate.multiply(b);
                    break;
                case 5:
                    calculate.divide(b);
                    break;
                case 6:
                    calculate.max(b);
                    break;
                case 7:
                    calculate.min(b);
                    break;
                case 8:
                    System.out.println("give me your second array : ");
                    calculate.compare(b, Input.scannerStringToArrayInt());
                    break;
                case 9:
                    System.out.println("give me your number : ");
                    calculate.indexOf(b, in.nextInt());
                    break;
                case 10:
                    System.out.println("give me your number : ");
                    calculate.contains(b, in.nextInt());
                    break;
                case 11:
                    calculate.reverse(b);
                    break;
                case 12:
                    System.out.println("give me your second array : ");
                    calculate.isEqual(b, Input.scannerStringToArrayInt());
                    break;
                case 13:
                    System.out.println("give me from and to : ");
                    calculate.subArray(b, in.nextInt(), in.nextInt());
                    break;
                case 14:
                    calculate.toString1(b);
                    break;
                case 15:
                    calculate.remove(b);
                    break;
                case 16:
                    calculate.randomArray(b);
                    break;
                case 17:
                    System.out.println("give me your number : ");
                    calculate.isPrime(in.nextInt());
                    break;
                case 18:
                    calculate.findFirstPrimes(b);
                    break;
                case 19:
                    calculate.findOfAllPrimes(b);
                    break;
                case 20:
                    System.out.println("give me your number : ");
                    calculate.bubbleSort(b, in.nextInt());
                    break;

            }

        }
    }
}
