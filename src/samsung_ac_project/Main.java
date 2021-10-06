package samsung_ac_project;

import java.util.Scanner;

public class Main {

    public static int read(Scanner v) {
        return v.nextInt();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t1, t2, sum;
        t1 = read(in);
        t2 = read(in);
        sum = t1 + t2;
        System.out.print("Please, wait: ");
        for (int j = 0; j <= 10; j++) {
            long h = 0;
            System.out.print(j*10 + "% ");
            while (h < 500000000){ h++; }
        }
        System.out.println();
        if (sum == 100) {
            System.out.println("it is 100");
        } else if (sum > 100) {
            System.out.println("Bigger");
        } else {
            while (sum < 100) {
                sum++;
                System.out.println("Sum is: " + sum);
            }
        }
        System.out.println("Massive:");
        int[] t = new int[10];
        for (int j = 0; j < t.length; j++) {
            t[j] = j*10;
            System.out.print(t[j] + " ");
        }
        System.out.println();
        System.out.println("Matrix:");
        int[][] m = new int[5][10];
        int counter = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                counter++;
                m[i][j] = counter;
                if (counter < 10){
                    System.out.print(m[i][j] + "  ");
                } else {
                    System.out.print(m[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
