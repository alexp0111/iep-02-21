package samsung_ac_project;

import java.util.Scanner;

public class Main {

    public static int read(Scanner v) {
        return v.nextInt();
    }

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int t1, t2, sum;
        //System.out.println("Enter number:");
        t1 = read(i);
        t2 = read(i);
        sum = t1 + t2;
        if (sum == 100) {
            System.out.println("it is 100");
        } else if (sum > 100) {
            System.out.println("Bigger");
        } else {
            while (sum < 100){
                sum += 1;
                System.out.println("Sum is: " + sum);
            }
        }
    }
}
