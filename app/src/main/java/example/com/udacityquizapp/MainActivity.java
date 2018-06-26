package example.com.udacityquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /*
    * this method perfomr the process of displaying
    * the string theResult in the submit() method
    * */
    private void displaymessage(String number) {
        TextView priceTextView = findViewById(R.id.displaymessage);
        priceTextView.setText(number);
    }

    public void submit(View view) {

        /* and identify each checkBox from the xml.
        We declare and initialize the variable
        as a normal routine of any method*/

        CheckBox peso1 = findViewById(R.id.checkPeso1);
        boolean pesotrue = peso1.isChecked();
        CheckBox peso2 = findViewById(R.id.checkPeso2);
        boolean pesofals = peso2.isChecked();
        CheckBox gold1 = findViewById(R.id.checkGold1);
        boolean goldtrue = gold1.isChecked();
        CheckBox gold2 = findViewById(R.id.checkGold2);
        boolean goldfalse = gold2.isChecked();
        CheckBox Nig1 = findViewById(R.id.checkNig1);
        boolean nigtrue = Nig1.isChecked();
        CheckBox Nig2 = findViewById(R.id.checkNig2);
        boolean nigfalse = Nig2.isChecked();
        CheckBox sey1 = findViewById(R.id.checkSey1);
        boolean seytrue = sey1.isChecked();
        CheckBox sey2 = findViewById(R.id.checkSey2);
        boolean seyfalse = sey2.isChecked();
        CheckBox sub1 = findViewById(R.id.checkSub1);
        boolean subtrue = sub1.isChecked();
        CheckBox sub2 = findViewById(R.id.checkSub2);
        boolean subfalse = sub2.isChecked();
        CheckBox dday1 = findViewById(R.id.checkDday1);
        boolean ddaytrue = dday1.isChecked();
        CheckBox dday2 = findViewById(R.id.checkDday2);
        boolean ddayfalse = dday2.isChecked();

        //the message to be printed if submit button is declared
        String theResult = "Thank you for participating, " + " You score   " + calCulatemark(pesotrue,
                pesofals, goldtrue, goldfalse, nigtrue, nigfalse,
                seytrue, seyfalse, subtrue, subfalse, ddaytrue, ddayfalse)+ " marks";
        displaymessage(theResult);
    }
       /*this the method that perform all the function in the submit() method button.
       we declare the variables and then perform an if statement to update our
        marks base on the selection of each variable as identifies in the submit() method above*/

    private int calCulatemark(boolean pesotrue, boolean pesofals, boolean goldtrue, boolean goldfalse,
                              boolean nigtrue, boolean nigfalse, boolean seytrue, boolean seyfalse,
                              boolean subtrue, boolean subfalse, boolean ddaytrue, boolean ddayfalse) {
        int positive = 0;
        if (pesotrue) {
            positive = positive - 1;
        }
        if (pesofals) {
            positive = positive + 1;
        }
        if (goldtrue) {
            positive = positive + 1;
        }
        if (goldfalse) {
            positive = positive - 1;
        }
        if (nigtrue) {
            positive = positive + 1;
        }
        if (nigfalse) {
            positive = positive - 1;
        }
        if (seytrue) {
            positive = positive - 1;
        }
        if (seyfalse) {
            positive = positive + 1;
        }
        if (subtrue) {
            positive = positive - 1;
        }
        if (subfalse) {
            positive = positive + 1;
        }
        if (ddaytrue) {
            positive = positive - 1;
        }
        if (ddayfalse) {
            positive = positive +1;
        }
        return positive;
    }
}