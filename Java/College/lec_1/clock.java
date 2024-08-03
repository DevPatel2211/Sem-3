package College.lec_1;

import java.util.Scanner;

public class clock {
    public static void main(String[] args) {
        Scanner sec = new Scanner(System.in);
        int second = sec.nextInt();
        int minute = 0;
        int hour = 0;

        for (int i = 0; i <= second; i++) {
            if (second > 59) {
                minute = second / 60;
                second = second % (minute * 60);
                if (minute > 59) {
                    hour = minute / 60;
                    minute = minute % (hour * 60);
                }
            }
        }
        System.out.print(hour + ":" + minute + ":" + second);
        sec.close();
    }
}