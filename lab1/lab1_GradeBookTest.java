package lab1;
import lab1.*;

import Practice.p2_Student;
import java.util.Vector;

public class lab1_GradeBookTest {
    public static void main(String[] args) {
        lab1_Course c1 = new lab1_Course("Sample Discipline", "IWTKMS", "KYSKYSKYS", 5);
        p2_Student Student1 = new p2_Student("Kazuma Kiryu", 1);
        p2_Student Student2 = new p2_Student("Majima Goro", 2);
        p2_Student Student3 = new p2_Student("Daisaku Kuze", 3);
        p2_Student Student4 = new p2_Student("Sohei Dojima", 4);
        p2_Student Student5 = new p2_Student("Mr Shakedown", 5);
        Vector<p2_Student> studs = new Vector<p2_Student>();
        studs.add(Student1);
        studs.add(Student2);
        studs.add(Student3);
        studs.add(Student4);
        studs.add(Student5);

        lab1_GradeBook gBook = new lab1_GradeBook(c1, studs);
        gBook.displayMessage();
        gBook.gradesInitialization();
        gBook.displayGradeReport();
    }
}
