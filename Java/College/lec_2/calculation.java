public class calculation {
    public static void main(String args[]) {
        int arr[] = new int[6];

        arr[0] = 99;
        arr[1] = 89;
        arr[2] = 79;
        arr[3] = 69;
        arr[4] = 59;
        arr[5] = 49;

        int sum = 0;

        for (int i = 0; i < 6; i++) {
            sum = sum + arr[i];
        }

        int percentage = sum * 100 / 600;

        System.out.println("Percentage : " + percentage);

    }
}
