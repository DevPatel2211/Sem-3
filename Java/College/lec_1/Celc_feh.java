package College.lec_1;

import java.util.*;

public class Celc_feh {
    public static void main(String[] args) {
        Scanner feh = new Scanner(System.in);
        float Feh = feh.nextInt();
        float celc = Feh - 32;

        System.out.println("Fehrenheit = " + Feh);
        System.out.print("Celsius = " + (celc * 0.55));

        feh.close();
    }
}