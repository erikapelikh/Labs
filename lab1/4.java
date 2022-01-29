import java.util.Scanner;
public class lab4{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число месяца: ");
        int a = in.nextInt();
        if (a == 3 || a == 4 || a == 5) {
            System.out.print("Время года - весна");}
        else if (a == 6 || a == 7 || a == 8) {
            System.out.print("Время года - лето");}
        else if (a == 9 || a == 10 || a == 11) {
            System.out.print("Время года - осень");}
        else if (a == 12 || a == 1 || a == 2) {
            System.out.print("Время года - зима ");}
        else if (a > 12 || a < 1 ) {
            System.out.print("Такого месяца нет");}
        in.close();
    }
}
