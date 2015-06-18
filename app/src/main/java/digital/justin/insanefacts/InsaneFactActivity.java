package digital.justin.insanefacts;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;


public class InsaneFactActivity extends ActionBarActivity {

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insane_fact);

        // Declare our View vars
        final TextView factLabel = (TextView)findViewById(R.id.FactTextView);
        final Button nextButton = (Button) findViewById(R.id.NextButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener(){

         @Override
         public void onClick(View view) {
            String fact = mFactBook.getFact();

            int color = mColorWheel.getColor();


             factLabel.setText(fact);
             relativeLayout.setBackgroundColor(color);
             nextButton.setTextColor(color);
         }
        };
       nextButton.setOnClickListener(listener);
    }



}
