import java.time.LocalDate;
import java.util.Scanner;

public class GymMethods {
    Scanner s = new Scanner(System.in);

    public boolean getNameBool(String line, String inputName) {
        String[] stringArray = line.split(",");
        String nameFromFile = stringArray[1].trim();
        return inputName.equalsIgnoreCase(nameFromFile);

    }

    public boolean getIDnr(String line, String inputIDnr) {
        String[] stringArray = line.split(",");
        String idNRFromFile = stringArray[0].trim();
        return inputIDnr.equalsIgnoreCase(idNRFromFile);
    }

    public boolean compareDate(String inputDate){
        LocalDate date1 = LocalDate.now().minusYears(1);
        LocalDate date2 = LocalDate.parse(inputDate);
        return date1.compareTo(date2) < 0;
    }
    public String getName(String line) {
        String[] stringArray = line.split(",");
        String nameFromFile = stringArray[1].trim();
            return nameFromFile;

        }

    public String userInput() { //Inte testad
        System.out.println("Leta efter kund i systemet:");
        System.out.println("Skriv in för och efternamn eller personnummer: ");
        String userInput = s.nextLine();
        return userInput;
    }

}





