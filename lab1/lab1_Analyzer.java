package lab1;

import java.util.Scanner;

public class lab1_Analyzer {
    static Scanner  input = new Scanner(System.in);
    static lab1_Data data = new lab1_Data();

    public static void analyze() {
        while (true) {
            System.out.print("Enter a number (Q to quit): ");
            String next = input.nextLine();
            if (next.equals("Q")){
                break;
            }
            try {
                double num = Double.parseDouble(next);
                data.addValue(num);
            }
            catch (NumberFormatException exc) {
                System.out.println("Invalid number, please try again");
            }
        }
        System.out.println("Average = " + Double.toString(data.getAverage()));
        System.out.println("Maximum = " + Double.toString(data.getMax()));
    }
}
