package tests.units;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.otus.game.*;

public class GameTest {
    @Test
    public void testPlayerOneWin() {
        String scenario = "Проверка выигрыша первого игрока";

        try {
            Player one = new Player("Den");
            Player two = new Player("Max");
            Dice dice = new Dice() {

                private int count = 0;
                @Override
                public int roll() {
                    if (count==0) {
                        count++;
                        return 6;

                    }
                    return 5;
                }
            };

            GameWinnerPrinter printer = winner -> Assertions.assertEquals("Den",winner.getName());

            Game game = new Game(dice, printer);
            game.playGame(one,two);
            System.out.printf(" \"%s\" passed " + "\n", scenario);
        }
        catch (Throwable e) {
            System.err.printf(" \"%s\" failed " + "\n", scenario);
        }
    }

    @Test
    public void testPlayerSecondWin() {
        String scenario = "Проверка выигрыша второго игрока";

        try {
            Player one = new Player("Den");
            Player two = new Player("Max");
            Dice dice = new Dice() {

                private int count = 0;
                @Override
                public int roll() {
                    if (count==1) {
                        count++;
                        return 6;

                    }
                    return 5;
                }
            };

            GameWinnerPrinter printer = winner -> Assertions.assertEquals("Max",winner.getName());

            Game game = new Game(dice, printer);
            game.playGame(one,two);
            System.out.printf(" \"%s\" passed " + "\n", scenario);
        }
        catch (Throwable e) {
            System.err.printf(" \"%s\" failed " + "\n", scenario);
        }
    }
    @Test
    public void testPlayerNobodyWin() {
        String scenario = "Проверка исхода игры - ничья";

        try {
            Player one = new Player("Den");
            Player two = new Player("Max");
            Dice dice = new Dice() {

                private int count = 0;
                @Override
                public int roll() {
                    if (count==0) {
                        count++;
                        return 2;

                    }
                    return 2;
                }
            };

            GameWinnerPrinter printer = winner -> Assertions.assertEquals("Max",winner.getName());

            Game game = new Game(dice, printer);
            game.playGame(one,two);
            System.out.printf(" \"%s\" passed " + "\n", scenario);
        }
        catch (Throwable e) {
            System.err.printf(" \"%s\" failed " + "\n", scenario);
        }
    }
}
