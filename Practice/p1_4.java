/*
ax^2+bx+c=0
D=b^2-4ac

x1= -b+sqrt(D)/2a=
x2= -b-sqrt(D)/2a=
 */
import java.util.Scanner;
public class p1_4{

    private static void quadraticSolver(int a, int b, int c) {
        int D=b*b-4*a*c;
        double sqrt_D=Math.sqrt(Math.abs(D));
        if (a==0){
            System.out.println("Ты вообще не прав, a меньше нуля");

        }
        if(D>0){
            System.out.print("2 roots: ");
            System.out.println("1 Root: "+(-b + sqrt_D) / (2 * a) + "2 root: " + (-b - sqrt_D) / (2 * a));

        }
        else if (D==0) {
            System.out.print("1 root: ");
            System.out.println((double) (-b) / (2 * a));

        }
        else if (D<0){
            System.out.println("Ты не прав, корни имаджинированные, но вот решение");
            double realPart = (double) -b / (2 * a);
            double imaginaryPart = Math.sqrt(-D) / (2 * a);
            System.out.println("Complex roots: x1 = " + realPart + " + " + imaginaryPart + "i, x2 = " + realPart + " - " + imaginaryPart + "i");
            }

    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Напиши константы квадратичного уравнения: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    quadraticSolver(a, b, c);
    }
}
