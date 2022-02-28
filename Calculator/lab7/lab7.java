import java.util.InputMismatchException;
import java.util.Scanner;

public class lab7 {
    private int den;
    private int num;

    public lab7(int num, int den) {
        this.num = num;
        this.den = den;
    }
    public static void df() {
        System.out.println(1 + "/" + 1);
    }

    public static lab7 sum(lab7 f1, lab7 f2) {
        int num = f1.num * f2.den + f1.den * f2.num;
        int den = f1.den * f2.den;
        System.out.println(f1.num + "/" + f1.den + " + " + f2.num + "/" + f2.den + " = " + num + "/" + den);
        lab7 result = new lab7(num, den);
        return result;
    }

    public static lab7 sub(lab7 f1, lab7 f2) {
        int num = f1.num * f2.den - f1.den * f2.num;
        int den = f1.den * f2.den;
        System.out.println(f1.num + "/" + f1.den + " - " + f2.num + "/" + f2.den + " = " + num + "/" + den);
        lab7 result = new lab7(num, den);
        return result;
    }

    public static lab7 mul(lab7 f1, lab7 f2) {
        int num = f1.num * f2.num;
        int den = f1.den * f2.den;
        System.out.println(f1.num + "/" + f1.den + " * " + f2.num + "/" + f2.den + " = " + num + "/" + den);
        lab7 result = new lab7(num, den);
        return result;
    }

    public static lab7 div(lab7 f1, lab7 f2) {
        int num = f1.num * f2.den;
        int den = f1.den * f2.num;
        System.out.println(f1.num + "/" + f1.den + " : " + f2.num + "/" + f2.den + " = " + num + "/" + den);
        lab7 result = new lab7(num, den);
        return result;
    }
    public static void main(String args[]) {
        int result;
        try {
            Scanner console = new Scanner(System.in);
            System.out.println("Введите числитель первой дроби:");
            int num1 = console.nextInt();
            System.out.println("Введите знаменатель первой дроби:");
            int den1 = console.nextInt();
            System.out.println("Введите числитель второй дроби:");
            int num2 = console.nextInt();
            System.out.println("Введите знаменатель второй дроби:");
            int den2 = console.nextInt();
            console.close();
            lab7 f1 = new lab7(num1, den1);
            lab7 f2 = new lab7(num2, den2);
            sum(f1, f2);
            sub(f1, f2);
            mul(f1, f2);
            div(f1, f2);
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели недопустимые данные, перезапустите программу");
        }
    }
}


