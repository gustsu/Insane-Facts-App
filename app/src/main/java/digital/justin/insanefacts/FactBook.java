package digital.justin.insanefacts;

import java.util.Random;

/**
 * Created by Justin on 6/17/2015.
 */
public class FactBook {

    public String[] mFacts = {"The national anthem of Greece has 158 verses",
            "Honey does not spoil. You could feasibly eat 5000 year old honey.",
            "The brain named itself."};


    public String getFact(){

        String fact = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];





     return fact;
    }
}
