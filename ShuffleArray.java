import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }

        shuffleArray(arr);

        System.out.println("Shuffled array: " + Arrays.toString(arr));

        scanner.close();
    }

    public static void shuffleArray(int[] arr) {
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}