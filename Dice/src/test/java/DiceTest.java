import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    void constructorSetsValuesAs0() {
        Dice dice = new Dice();
        int die1 = dice.getDie1();
        int die2 = dice.getDie2();
        int rollcount = dice.getRollCount();

        assertEquals(0,die1);
        assertEquals(0,die2);
        assertEquals(0,rollcount);
    }

    @Test
    void rollGivesNumbers1To6(){
        Dice dice = new Dice();
        for(int i=1;i<=10000;i++){
            dice.roll();
            assertTrue(dice.getDie1() >= 1 && dice.getDie1()<= 6);
            assertTrue(dice.getDie2() >= 1 && dice.getDie2()<= 6);

        }
    }

    @Test
    void isDoubledice(){
        Dice dice = new Dice();
        boolean found = false;
        for(int i = 0; i<10000; i++){
            dice.roll();
            if(dice.isDouble()){
                found = true;
                break;
            }
        }
        assertTrue(found);
    }



    @Test
    void getRollCount() {
        Dice dice = new Dice();
        int rolls = 6;
        for(int i = 0; i<rolls; i++){
            dice.roll();
        }
        assertEquals(rolls,dice.getRollCount());
    }
}