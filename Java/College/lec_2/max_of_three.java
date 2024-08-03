public class max_of_three {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 20;

        if (a > b && a > c) {
            System.out.println(a + " is the Greates number amongst three");
        } else if (b > c && b > a) {
            System.out.println(b + " is the Greates number amongst three");
        } else {
            System.out.println(c + " is the Greates number amongst three");
        }
    }
}
