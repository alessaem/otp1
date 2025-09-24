import java.util.Random;

public class Dice {
    private int die1;
    private int die2;
    private int rollCount;

    public Dice() {
        this.die1 = 0;
        this.die2 = 0;
        this.rollCount = 0;
    }

    public void roll(){
        Random rand = new Random();
        die1 =  rand.nextInt(6)+1;
        die2 =   rand.nextInt(6)+1;
        rollCount++;
    }

    public boolean isDouble(){
        if(die1 == die2){
            return true;
        }else {
            return false;
        }
    }

    public int getDie1(){
        return die1;
    }

    public int getDie2(){
        return die2;
    }

    public int getRollCount(){
        return rollCount;
    }


}
