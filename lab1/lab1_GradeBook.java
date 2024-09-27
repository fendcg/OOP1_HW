package lab1;
import lab1.*;
import Practice.*;
import java.util.*;

public class lab1_GradeBook {
    private lab1_Course course;
    private Vector<p2_Student> p2_Students;
    private Map<p2_Student, Double> grades = new Hashtable<p2_Student, Double>();
    public lab1_GradeBook(lab1_Course course, Vector<p2_Student> p2_Students) {
        this.course = course;
        this.p2_Students = p2_Students;
    }
    public lab1_GradeBook(lab1_Course course) {
        this.course = course;
    }
    public lab1_GradeBook(Vector<p2_Student> p2_Students) {
        this.p2_Students = p2_Students;
    }
    public void displayMessage(){
        System.out.println("Welcome to the " + course.getCourseCode() + " " + course.getCourseName() + " Gradebook!");
    }
    public void gradesInitialization(){
        System.out.println("Please, input ");
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < p2_Students.size(); i++){
            System.out.print(p2_Students.get(i).getName() + " : ");
            grades.put(p2_Students.get(i), input.nextDouble());

        }
    }
    public void displayGradeReport(){
        System.out.println("Class average: " + Double.toString(determineClassAverage()));
        System.out.println(findLowest());
        System.out.println(findHighest());
        outputBarChart();
    }
    private double determineClassAverage(){
        double total = 0;
        for (p2_Student p2_Student : p2_Students){
            total += grades.get(p2_Student);
        }
        return total / p2_Students.size();
    }

    private String findLowest(){
        double lowest = 1000;
        p2_Student stud = null;
        for (p2_Student p2_Student : p2_Students){
            if (grades.get(p2_Student) < lowest){
                lowest = grades.get(p2_Student);
                stud = p2_Student;
            }
        }
        String res = "Lowest Grade is " + Double.toString(lowest) + " (" + stud.getName() + ", id: " + Integer.toString(stud.getId()) + ")";
        return res;
    }
    private String findHighest(){
        double highest = -10;
        p2_Student stud = null;
        for (p2_Student p2_Student : p2_Students){
            if (grades.get(p2_Student) > highest){
                highest = grades.get(p2_Student);
                stud = p2_Student;
            }
        }
        String res = "Lowest Grade is " + Double.toString(highest) + " (" + stud.getName() + ", id: " + Integer.toString(stud.getId()) + ")";
        return res;
    }

    private void outputBarChart(){
        Map<String, Integer> stars = new Hashtable();
        stars.put("00-09", 0);
        stars.put("10-19", 0);
        stars.put("20-29", 0);
        stars.put("30-39", 0);
        stars.put("40-49", 0);
        stars.put("50-59", 0);
        stars.put("60-69", 0);
        stars.put("70-79", 0);
        stars.put("80-89", 0);
        stars.put("90-99", 0);
        stars.put("100", 0);

        for(p2_Student p2_Student : p2_Students){
            if (grades.get(p2_Student) == 100){
                stars.put("100", stars.get("100")+1);
            }
            else if (grades.get(p2_Student) >= 90){
                stars.put("90-99", stars.get("90-99")+1);
            }
            else if (grades.get(p2_Student) >= 80){
                stars.put("80-89", stars.get("80-89")+1);
            }
            else if (grades.get(p2_Student) >= 70){
                stars.put("70-79", stars.get("70-79")+1);
            }
            else if (grades.get(p2_Student) >= 60){
                stars.put("60-69", stars.get("60-69")+1);
            }
            else if (grades.get(p2_Student) >= 50){
                stars.put("50-59", stars.get("50-59")+1);
            }
            else if (grades.get(p2_Student) >= 40){
                stars.put("40-49", stars.get("40-49")+1);
            }
            else if (grades.get(p2_Student) >= 30){
                stars.put("30-39", stars.get("30-39")+1);
            }
            else if (grades.get(p2_Student) >= 20){
                stars.put("20-29", stars.get("20-29")+1);
            }
            else if (grades.get(p2_Student) >= 10){
                stars.put("10-19", stars.get("10-19")+1);
            }
            else if (grades.get(p2_Student) >= 0){
                stars.put("00-09", stars.get("00-09")+1);
            }
        }
        String[] order = {"00-09", "10-19", "20-29", "30-39", "40-49", "50-59", "60-69", "70-79", "80-89", "90-99", "100"};
        for (String s : order){
            String starsLine = "";
            for(int x = 0; x < stars.get(s); x++){
                starsLine += "*";
            }
            System.out.println(s+ ": " +  starsLine);
        }
    }
}
