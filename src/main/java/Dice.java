import java.util.Random;

public class Dice {
    private int die1;
    private int die2;
    private Random random;

    public Dice() {
        random = new Random();
    }

    public void roll() {
        die1 = random.nextInt(6) + 1;
        die2 = random.nextInt(6) + 1;
    }

    public boolean isDouble() {
        return die1 == die2;
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public static void main(String[] args) {
        Dice dice = new Dice();
        int count = 0;
        do {
            dice.roll();
            count++;
            System.out.println("Rolling the dice...");
            System.out.println("Die 1: " + dice.getDie1());
            System.out.println("Die 2: " + dice.getDie2());
            if (dice.isDouble()) {
                System.out.println("You rolled a double!");
                System.out.println("After " + count + " try both reach the same value");
            } else {
                System.out.println("Try again.");
            }
        } while (!dice.isDouble());
    }
}