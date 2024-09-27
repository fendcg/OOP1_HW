package lab1;
import lab1.*;

public class Main {
    public static void main(String[] args) {
        //1
        //lab1_Analyzer.analyze();

        //2

        Persona samplePersona = new Persona("John Yakuza", "Tojo Clan Chairman", Role.ADMIN, 1.0);
        samplePersona.addExperience(1);
        System.out.println(samplePersona.getExperience());
        samplePersona.addExperience(2.5);
        System.out.println(samplePersona.getOccupation());

        //3


/*
        lab1_Temperature temp = new lab1_Temperature(15.0, 'C');
        System.out.println(temp.getTemperatureCelsius());
        System.out.println(temp.getTemperatureFahrenheit());
*/
    }
}