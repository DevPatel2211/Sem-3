class e2e_pyramid {
    public static void main(String[] args) {

        int m = 5;
        int i = 1;
        if (i <= m) {
            for (i = 1; i < m * 2; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.print("\n");

            }
        } else {
            for (i = m; i >= 0; i--) {
                for (int j = i - 1; j >= 0; j--) {
                    System.out.print("* ");
                }
                System.out.print("\n");
            }
        }
        System.out.print("\n");
    }

}
