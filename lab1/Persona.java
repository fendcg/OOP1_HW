package lab1;
import lab1.*;


enum Role{
    STUDENT,
    TEACHER,
    ADMIN
}

public class Persona {

    static int person_count = 0;
    final String universe = "Milky Way";
    private Role personRole = Role.STUDENT;
    private String name;
    private String occupation;
    private double experience;
    // initialization block
    {
        person_count += 1;
        System.out.println("We have " + Integer.toString(person_count) + " persons so far.");
    }

    public Persona(String name, String occupation, Role personRole, double experience) {
        this.name = name;
        this.occupation = occupation;
        this.personRole = personRole;
        this.experience = experience;
    }
    public String getUniverse() {
        return universe;
    }
    public String getName() {
        return name;
    }
    public String getOccupation() {
        return occupation;
    }
    public Role getRole(){
        return personRole;
    }
    public static int getPersonCount() {
        return person_count;
    }

    public double getExperience() {
        return experience;
    }

    // method overloading
    public void addExperience(double experience) {
        this.experience += experience;
    }
    public void addExperience(int experience) {
        this.experience += experience;
    }

}
