import java.util.Scanner;

public class p1_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Сколько Джонни Кэша: ");
        double initialBalance = sc.nextDouble();

        System.out.print("Процентная ставка? ");
        double interestRate = sc.nextDouble();

        double interestAmount = initialBalance * interestRate / 100;
        double newBalance = initialBalance + interestAmount;

        System.out.println("Начальный баланс: " + initialBalance);
        System.out.println("Процентная ставка: " + interestRate + "%");
        System.out.println("Накопилось: " + interestAmount);
        System.out.println("Новый баланс: " + newBalance);
    }
}

