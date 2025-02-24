import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {

    @Test
    public void testRoll() {
        Dice dice = new Dice();
        dice.roll();
        assertTrue(dice.getDie1() >= 1 && dice.getDie1() <= 6);
        assertTrue(dice.getDie2() >= 1 && dice.getDie2() <= 6);
    }

    @Test
    public void testIsDouble() {
        Dice dice = new Dice();
        dice.roll();
        if (dice.getDie1() == dice.getDie2()) {
            assertTrue(dice.isDouble());
        } else {
            assertFalse(dice.isDouble());
        }
    }
}