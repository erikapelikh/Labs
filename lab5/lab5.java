import java.util.Scanner;
import java.util.ArrayList;

public class lab5 {
    public static void main(String[] Args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String input = null;
        int el = 0;
        System.out.println("Введите элементы массива (чтобы остановить ввод введите 'quit'): ");
        do {
            input = scan.nextLine();
            try {
                el = Integer.parseInt(input);
            } catch (Exception NumberFormatException) {
                if (!input.equals("quit")) {
                    System.out.println("Введите число!");
                }
            }
            list.add(el);
        }
        while (!input.equals("quit"));
        System.out.println("Какой элемент вы хотите исключить? ");
        int X = scan.nextInt();
        scan.close();
        ArrayList<Integer> NList = list;
        System.out.println("Начальный массив: " + NList);
        for (int i = NList.size() - 1; i >= 0; i--) {
            int index = list.get(i);
            if (index == X) {
                list.remove(i);
            }
        }
        System.out.println("Массив без указанного элемента:" + list);
    }
}


