import java.util.Scanner;
public class p1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String yourname = sc.nextLine();
        String name = "SillyCat";
        int length = yourname.length();


        System.out.print("+");
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        System.out.println("|"+yourname+"|");


        System.out.print("+");
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.print("+");
    }
}
