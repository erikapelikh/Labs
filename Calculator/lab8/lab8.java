import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lab8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение формата: a/b (+/-/*/:) c/d ");
        String calculate = scanner.nextLine();
        Pattern p = Pattern.compile("^(-?\\d{0,10})/(-?\\d{1,10})( )[+*:-]( )(-?\\d{0,10})/(-?\\d{1,10})$");
        Matcher m = p.matcher(calculate);
        if (m.matches()) {
            String[] part = calculate.split("[/( )]+");
            int n1 = Integer.parseInt(part[0]);
            int d1 = Integer.parseInt(part[1]);
            String operation = part[2];
            int n2 = Integer.parseInt(part[3]);
            int d2 = Integer.parseInt(part[4]);

            lab7 f1 = new lab7(n1, d1);
            lab7 f2 = new lab7(n2, d2);

            if (operation.equals("+")) {
                lab7.sum(f1, f2);
            }
            if (operation.equals("-")) {
                lab7.sub(f1, f2);
            }
            if (operation.equals("*")) {
                lab7.mul(f1, f2);
            }
            if (operation.equals(":")) {
                lab7.div(f1, f2);
            }
        } else {
            System.out.println("Вы ввели выражение неверного формата, перезапустите программу");
        }
    }
}
