import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BestGymEver {
    Path inFilePath = Paths.get("src/customers.txt");
    Path outFilePath = Paths.get("src/trainersList.txt");


    public void mainFunction(Scanner scanner, PrintWriter printer) {
        List<String> fullList = new ArrayList<>();
        String tempString1 = "";
        String tempString2 = "";
            while(scanner.hasNextLine()){
                if(scanner.hasNext()){
                    tempString1 = scanner.nextLine();}
                if(scanner.hasNext()){
                    tempString2 = scanner.nextLine();}
                }
    }

    public BestGymEver() {
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(outFilePath));
             Scanner scanner = new Scanner(inFilePath);) {
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

    public boolean getName(String line, String inputName) {
        String[] stringArray = line.split(",");
        String nameFromFile = stringArray[1].trim();
        if (inputName.equalsIgnoreCase(nameFromFile)){
            return true;
        }else{
            return false;
        }

    }

    public boolean getIDnr(String line, String inputIDnr) {
        String[] stringArray = line.split(",");
        String idNRFromFile = stringArray[0].trim();
        if (inputIDnr.equalsIgnoreCase(idNRFromFile)){
            return true;
        }else{
            return false;
        }
    }

    public boolean compareDate(String inputDate){
        LocalDate date1 = LocalDate.now().minusYears(1);
        LocalDate date2 = LocalDate.parse(inputDate);
        if(date1.compareTo(date2)<0){
            return true;}
        else{
            return false;
        }
    }
}