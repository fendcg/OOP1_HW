import java.util.Scanner;

public class p1_6 {

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s", "").toLowerCase();
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Строка является палиндромом, ты прав");
        } else {
            System.out.println("Строка не является палиндромом, ты не прав");
        }
    }
}
