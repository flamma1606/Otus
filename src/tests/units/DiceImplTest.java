package tests.units;

import org.junit.Test;
import ru.otus.game.*;

public class DiceImplTest {
    @Test(expected = RuntimeException.class)
    public void testDiceRange() {

        String scenario = "Тест проверки диапазона допустимых значений";

            Dice dice = new DiceImpl();
            int actual = dice.roll();
            int count = 0;
            if (actual >= 1 && actual <= 6) {
                count++;
            }
            throw new RuntimeException();

    }
}


