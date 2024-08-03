import java.util.*;

public class element_sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < numElements; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        Collections.sort(numbers);

        System.out.println("Sorted list in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
