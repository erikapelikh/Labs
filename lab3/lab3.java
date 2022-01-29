import java.util.Scanner;
import java.util.regex.*;

public class lab3 {
    public static void main(String[] args) {
        String pattern = ("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])" + "(?=.*[A-Z])(?=\\S+$).*$");
        Scanner scan = new Scanner(System.in);
        String pass = null;
        System.out.println("Введите свой пароль (пароль считается надежным, если содержит 8 и более символов, хотя бы одну цифру, одну заглавную букву и одну строчную букву): " );
        pass = scan.nextLine();
        scan.close();
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(pass);
        if (m.matches()) {
            System.out.println("Ваш пароль надежный");}
        else {
            System.out.println("Ваш пароль недостаточно надежный");
        }
    }
}

