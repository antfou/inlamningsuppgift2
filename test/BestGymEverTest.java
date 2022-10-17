import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class BestGymEverTest {
    GymLoop a = new GymLoop();
    GymMethods b = new GymMethods();

    @Test
    public void DocReaderDocWriterTest(){ //Inte riktigt test, fejk test, mini-main
        String userInput1 = "Diamanda Djedi";
        String userInput2 = "7608021234";
        String userInput3 = "Alhambra Aromes";
        String userInput4 = "7703021234";
        String userInput5 = "Hilmer Heur";
        String userInput6 = "5711121234";
        String userInput7 = "Kadine Karlsson";
        String userInput8 = "7907281234";
        String userInput9 = "aosidjas";
        String userInput10 = "";

        a.userLoop(userInput1);
    }




    @Test
    public void compareDateTest() {
        String inputDate = "2022-07-01";
        assertTrue(b.compareDate(inputDate));

    }


    @Test
    public void getNameBoolTest(){
    String line = "7703021234, Alhambra Aromes";
    String inputName = "alhambra aromes";
    assertTrue(b.getNameBool(line, inputName));
    assertNotEquals(false, b.getNameBool(line, inputName));

    }
    @Test
    public void getNameTest(){
        String line = "7703021234, Alhambra Aromes";
        assert(b.getName(line).equals("Alhambra Aromes"));
        assert(!b.getName(line).equals("7703021234"));

    }

    @Test
    public void getIDnrTest(){
        String line = "7703021234, Alhambra Aromes";
        String inputIDnr = "7703021234";
        assertTrue(b.getIDnr(line, inputIDnr));
    }


}