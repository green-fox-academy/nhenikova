import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    @Test
    public void eat_PositiveInput_DecreaseByValue() {
        Animal animal = new Animal(87);
        animal.eat(20);

        assertEquals(67, animal.getHunger());
    }

    @Test
    public void eat_NegativeInput_RemainTheSameValue() {
        Animal animal = new Animal(87);
        animal.eat(-20);

        assertEquals(87, animal.getHunger());
    }

}
