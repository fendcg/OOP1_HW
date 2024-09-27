package Practice;
import java.util.Scanner;

public class p2_Student {
    private String name;
    private int id;
    private int yearOfStudy;

    public p2_Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = 1;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void incrementYearOfStudy() {
        yearOfStudy++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student's name: ");
        String name = sc.nextLine();

        System.out.println("Enter student's ID: ");
        int id = sc.nextInt();
        p2_Student student = new p2_Student(name, id);
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("Year of Study: " + student.getYearOfStudy());

        student.incrementYearOfStudy();

        System.out.println("Updated Year of Study: " + student.getYearOfStudy());
    }
}
