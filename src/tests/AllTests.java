package tests;

import tests.units.*;

public class AllTests {
    public static void main(String[] args) throws RuntimeException {
        new GameTest().testPlayerOneWin();
        new GameTest().testPlayerSecondWin();
        new GameTest().testPlayerNobodyWin();
        new DiceImplTest().testDiceRange();
    }
}
