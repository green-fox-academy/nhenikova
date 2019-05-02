import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GetRatioTest {
    //recommended naming of the test method
    //[MethodName_StateUnderTest_ExpectedBehavior]

    @Test
    public void getRatio_PositiveInput_ReturnRatio() {
        //act
        //use the unit to be tested (interaction with the SUT (System Under Test))
        double ratio = Main.getRatio(6, 2);

        //verify
        //do everything necessary to determine if the expected outcome has been obtained
        assertEquals(3d, ratio, 0.0001);
    }

    @Test
    public void getRatio_NegativeInput_ReturnRatio() {
        double ratio = Main.getRatio(6, -2);

        //verify
        //do everything necessary to determine if the expected outcome has been obtained
        assertEquals(-3d, ratio, 0.0001);
    }

    @Test
    public void getRatio_DivideByZero_ReturnZero() {
        //act
        //use the unit to be tested (interaction with the SUT (System Under Test))
        double ratio = Main.getRatio(6, 0);

        //verify
        //do everything necessary to determine if the expected outcome has been obtained
        assertEquals(0, ratio, 0.0001);
    }
}
