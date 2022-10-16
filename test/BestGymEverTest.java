import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class BestGymEverTest {
    BestGymEver b = new BestGymEver();


    @Test
    public void compareDateTest() {
        String inputDate = "2022-07-01";
        assertTrue(b.compareDate(inputDate)== true);
        assertFalse(b.compareDate(inputDate)== false);

    }


    @Test
    public void getNameTest(){
    String line = "7703021234, Alhambra Aromes";
    String inputName = "alhambra aromes";
    assertTrue(b.getName(line,inputName) == true);
    assertFalse(b.getName(line, inputName) == false);

    }

    @Test
    public void getIDnrTest(){
        String line = "7703021234, Alhambra Aromes";
        String inputIDnr = "7703021234";
        assertTrue(b.getIDnr(line,inputIDnr) == true);
        assertFalse(b.getIDnr(line, inputIDnr) == false);

    }

}