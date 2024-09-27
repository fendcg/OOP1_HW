/*
letters Numerical Equivalent Percentage Verbal Equivalent
А 95 - 100 Excellent
А 90 - 94
В+ 85 - 89 Good
В 80 - 84
В- 75 - 79
С+ 70 - 74
С 65 - 69
С- 60 - 64
D+ 55 - 59
D 50 - 54
F 0 - 49 Unsatisfactory

 */
import java.util.Scanner;

public class p1_3 {
    public static String getGrade(int score) {
            if (score >= 95 && score <= 100) return "A+";
            if (score >= 90 && score <= 94) return "A";
            if (score >= 85 && score <= 89) return "B+";
            if (score >= 80 && score <= 84) return "B";
            if (score >= 75 && score <= 79) return "B-";
            if (score >= 70 && score <= 74) return "C+";
            if (score >= 65 && score <= 69) return "C";
            if (score >= 60 && score <= 64) return "C-";
            if (score >= 55 && score <= 59) return "D+";
            if (score >= 50 && score <= 54) return "D";
            if (score >= 0 && score <= 49) return "F";
            return "Ты не прав, напиши еще раз";
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Оценка: "+ getGrade(a));

    }
}
