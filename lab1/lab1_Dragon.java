package lab1;
import lab1.*;

import java.util.Vector;

enum Gender {
    BOY, GIRL
}

class Person {
    private Gender gender;

    public Person(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return gender == Gender.BOY ? "B" : "G";
    }
}

class DragonLaunch {
    private Vector<Person> people = new Vector<>();

    public void kidnap(Person p) {
        people.add(p);
    }

    public boolean willDragonEatOrNot() {
        int size = people.size();
        for (int i = 0; i < size - 1; i++) {
            if (people.get(i).getGender() == Gender.BOY && people.get(i + 1).getGender() == Gender.GIRL) {
                people.remove(i);
                people.remove(i);
                size -= 2;
                i = -1;
            }
        }
        return people.size() > 0;
    }
}

public class lab1_Dragon{
    public static void main(String[] args) {
        DragonLaunch dragonLaunch = new DragonLaunch();

        dragonLaunch.kidnap(new Person(Gender.BOY));
        dragonLaunch.kidnap(new Person(Gender.GIRL));
        dragonLaunch.kidnap(new Person(Gender.GIRL));
        dragonLaunch.kidnap(new Person(Gender.BOY));

        boolean willEat = dragonLaunch.willDragonEatOrNot();
        System.out.println("Will dragon eat: " + willEat);
    }
}
