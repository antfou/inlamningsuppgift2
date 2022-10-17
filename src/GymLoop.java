import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class GymLoop extends BestGymEver{


    public void userLoop (String userInput) { //Inte testad
        Path inFilePath = Paths.get("src/customers.txt");
        Path outFilePath = Paths.get("src/trainersList.txt");

        try (FileWriter fileWriter = new FileWriter(outFilePath.toFile(), true);
             PrintWriter writer = new PrintWriter(fileWriter);
             Scanner scanner = new Scanner(inFilePath)) {
            Boolean existsInFile = false;

            while (scanner.hasNextLine()) {
                if (checkAndPrintUser(scanner, writer, userInput)) {
                    existsInFile = true;
                    break;
                }
            }
            if (!existsInFile){
                if(userInput.isEmpty()){ //Ifall user input är tom
                    System.out.println("Du skrev inte in någonting.");
                }else{System.out.println("Denna person finns inte i systemet."); //Ifall user input inte matchar någon i textfilen
                }
            }

        } catch (FileNotFoundException a) {
            System.out.println("Filen låg inte där den borde ligga");
            a.printStackTrace();
            System.exit(0);
        } catch (IOException b) {
            System.out.println("Writern bråkar");
            b.printStackTrace();
            System.exit(0);
        } catch (Exception c) {
            System.out.println("Nu blev något fel");
            c.printStackTrace();
            System.exit(0);
        }
    }

}
