package digital.justin.insanefacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Justin on 6/17/2015.
 */
public class ColorWheel {

    public String[] mColors = {"#30B27B",
            "#FF0000",
            "#FA6B3C",
            "#3097B2",
            "#0BB200",
            "#97B220",
            "#B2840F",
            "#B24A11",
            "#8000B2"};


    public int getColor(){

        String color = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);




        return colorAsInt;
    }
}
