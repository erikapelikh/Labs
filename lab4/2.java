import java.util.Arrays;
import java.util.Scanner;
public class lab4 {
    public static void main(String[] Args) {
        Scanner scan = new Scanner(System.in);
        int[] A = new int[0];
        System.out.println("Введите элементы массива (чтобы остановить ввод введите 'quit'):");
        String input = null;
        int el = 0;
        do {
            input = scan.nextLine();
            try {
                el = Integer.parseInt(input);
                A = Arrays.copyOf(A, A.length + 1);
                A[A.length - 1] = el;}
            catch (Exception NumberFormatException) {
                if (!input.equals("quit")) {
                    System.out.println("Введите число!");
                }
            }
        }
        while (!input.equals("quit"));
        System.out.println("Какой элемент вы хотите исключить?");
        int X = scan.nextInt();
        scan.close();
        int c = 0;
        int[] NA = Arrays.copyOf(A, A.length);

        for (int i = 0; i < A.length; i++) {
            if (NA[i] == X) {
                c++;
                int L = A.length;
                L--;
                for (int n = i; n < NA.length - c; n++) {
                    NA[n] = NA[n + 1];
                }
                i--;
            }
        }
        NA = Arrays.copyOf(NA, NA.length - c);
        System.out.println("Начальный массив: "+ Arrays.toString(A));
        System.out.println("Массив без указанного элемента: " + Arrays.toString(NA));
    }
}
