import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class BestGymEver extends GymMethods {

    public Boolean checkAndPrintUser(Scanner scanner, PrintWriter writer, String userInput) {
        String tempString1 = "";
        String tempString2 = "";
        boolean existsInFile = false;
        if (scanner.hasNext()) {
            tempString1 = scanner.nextLine();
            if (scanner.hasNext()) {
                tempString2 = scanner.nextLine();
            }
            boolean namn = getNameBool(tempString1, userInput);
            boolean idNr = getIDnr(tempString1, userInput);
            boolean date = compareDate(tempString2);

            if (namn || idNr) {
                System.out.println(getName(tempString1) + " finns i systemet.");
                existsInFile = true;
                if (date) {
                    System.out.println(getName(tempString1) + " har betalat årsavgiften och får träna");
                    writer.println("Kund: " + tempString1 + "\nTränade senast: " + LocalDate.now() + "\n");
                } else {
                    System.out.println(getName(tempString1) + " har tyvär inte betalat årsavgiften.");
                }
            }
        }
        return existsInFile;
    }


}