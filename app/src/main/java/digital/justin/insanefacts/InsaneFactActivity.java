package digital.justin.insanefacts;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class InsaneFactActivity extends ActionBarActivity {

    private FactBook mFactBook = new FactBook();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insane_fact);

        // Declare our View vars
        final TextView factLabel = (TextView)findViewById(R.id.FactTextView);
        Button nextButton = (Button) findViewById(R.id.NextButton);
        View.OnClickListener listener = new View.OnClickListener(){

         @Override
         public void onClick(View view) {
            String fact = mFactBook.getFact();

             factLabel.setText(fact);
         }
        };
       nextButton.setOnClickListener(listener);
    }



}
