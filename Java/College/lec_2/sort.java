public class sort {
    public static void main(String args[]) {
        int[] a = new int[] { 1, 2, 37, 4, 59, 68, 74, 81, 9, 10 };
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter size");

        for (int i = 1; i < 9; i++) {
            for (int j = 0; j <= i; j++) {
                if (a[i] < a[i + 1]) {
                    continue;
                } else {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        for (int j = 0; j < 9; j++) {
            System.out.println(a[j]);
        }
    }
}
