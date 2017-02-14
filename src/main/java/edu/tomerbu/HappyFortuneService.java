package edu.tomerbu;

/**
 * Created by tomerbuzaglo on 14/02/2017.
 */
public class HappyFortuneService implements FortuneService {
    @Override
    public String toString() {
        return getFortune();
    }

    public String getFortune() {
        return "Today is your lucky day!";
    }
}
