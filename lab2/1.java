import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        { factorial *= i;}
        System.out.printf("Факториал " +num+ " = " +factorial);
    }
}

