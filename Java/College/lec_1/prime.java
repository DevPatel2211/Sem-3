package College.lec_1;

import java.util.Scanner;

class prime {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Number : ");
        int number = num.nextInt();
        int flag = 0;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = 1;
                break;
            } else {
                flag = 0;
            }
        }
        if (flag == 1) {
            System.out.println(number + " is not Prime.");
        } else {
            System.out.println(number + " is Prime.");
        }
        num.close();
    }
}