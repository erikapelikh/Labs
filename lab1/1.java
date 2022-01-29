import java.util.Scanner;
public class lab1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число а: ");
        int a = in.nextInt();
        System.out.print("Введите число b: ");
        int b = in.nextInt();
        System.out.print("Введите число c: ");
        int c = in.nextInt();
        System.out.print("Введите число d: ");
        int d = in.nextInt();
        int x = 0;
        if ((a < b) && (a < c) && (a < d)) {
            x = a;}
        else if ((b < a) && (b < c) && (b < d)) {
            x = b;}
        else if ((c < a) && (c < b) && (c < d)) {
            x = c;}
        else if ((d < a) && (d < b) && (d < c)) {
            x = d;}
        System.out.printf("Наименьшее чило: %d \n", x);
        in.close();
    }
}
