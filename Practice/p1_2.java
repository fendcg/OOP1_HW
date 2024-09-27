import java.util.Scanner;
public class p1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите длину стороны квадрата a: ");
        double side = sc.nextDouble();
        double area = side * side;
        double perimeter = 4 * side;
        double diagonal = side * Math.sqrt(2);

        System.out.println("Площадь квадрата: " + area);
        System.out.println("Периметр квадрата: " + perimeter);
        System.out.println("Длина диагонали квадрата: " + diagonal);
    }
}
