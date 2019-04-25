import org.junit.Test;
import static org.junit.Assert.*;

public class ApplesTest {

    @Test
    public void Apples_initialiseNewApples_toBeInitialized() {
        Apples myApples = new Apples();
        assertNotNull(myApples);
    }

    @Test
    public void printStringApple_toPrint() {
        Apples apples = new Apples();
        String result = apples.getApples();

        assertEquals("apples",result);
    }
}
