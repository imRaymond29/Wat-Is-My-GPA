package raymondlam.watismygpa;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView gpaText, overallPer, errorText;
    EditText percentText1, percentText2, percentText3, percentText4,
            percentText5, percentText6;
    EditText weightText1, weightText2, weightText3, weightText4, weightText5, weightText6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        errorText = (TextView) findViewById(R.id.errorText);
        gpaText = (TextView) findViewById(R.id.gpaText);
        overallPer = (TextView) findViewById(R.id.percentText);

        percentText1 = (EditText) findViewById(R.id.per1);
        percentText2 = (EditText) findViewById(R.id.per2);
        percentText3 = (EditText) findViewById(R.id.per3);
        percentText4 = (EditText) findViewById(R.id.per4);
        percentText5 = (EditText) findViewById(R.id.per5);
        percentText6 = (EditText) findViewById(R.id.per6);

        weightText1 = (EditText) findViewById(R.id.wei1);
        weightText2 = (EditText) findViewById(R.id.wei2);
        weightText3 = (EditText) findViewById(R.id.wei3);
        weightText4 = (EditText) findViewById(R.id.wei4);
        weightText5 = (EditText) findViewById(R.id.wei5);
        weightText6 = (EditText) findViewById(R.id.wei6);

        Button calcBtn = (Button) findViewById(R.id.calcBut);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float per1 = 0;
                float per2 = 0;
                float per3 = 0;
                float per4 = 0;
                float per5 = 0;
                float per6 = 0;

                float wei1 = 0;
                float wei2 = 0;
                float wei3 = 0;
                float wei4 = 0;
                float wei5 = 0;
                float wei6 = 0;

                //stringCompare(weightText1.getText().toString())

                if (stringCompare(percentText1.getText().toString()) || stringCompare(weightText1.getText().toString())){
                    per1 = 0;
                    wei1 = 0;
                }
                else{
                    per1 = Float.parseFloat(percentText1.getText().toString());
                    wei1 = Float.parseFloat(weightText1.getText().toString());
                }

                if (stringCompare(percentText2.getText().toString()) || stringCompare(weightText2.getText().toString())) {
                    per2 = 0;
                    wei2 = 0;
                } else {
                    per2 = Float.parseFloat(percentText2.getText().toString());
                    wei2 = Float.parseFloat(weightText2.getText().toString());
                }

                if (stringCompare(percentText3.getText().toString()) || stringCompare(weightText3.getText().toString())) {
                    per3 = 0;
                    wei3 = 0;
                } else {
                    per3 = Float.parseFloat(percentText3.getText().toString());
                    wei3 = Float.parseFloat(weightText3.getText().toString());
                }

                if (stringCompare(percentText4.getText().toString()) || stringCompare(weightText4.getText().toString())) {
                    per4 = 0;
                    wei4 = 0;
                } else {
                    per4 = Float.parseFloat(percentText4.getText().toString());
                    wei4 = Float.parseFloat(weightText4.getText().toString());
                }

                if (stringCompare(percentText5.getText().toString()) || stringCompare(weightText5.getText().toString())) {
                    per5 = 0;
                    wei5 = 0;
                } else {
                    per5 = Float.parseFloat(percentText5.getText().toString());
                    wei5 = Float.parseFloat(weightText5.getText().toString());
                }

                if (stringCompare(percentText6.getText().toString()) || stringCompare(weightText6.getText().toString())) {
                    per6 = 0;
                    wei6 = 0;
                } else {
                    per6 = Float.parseFloat(percentText6.getText().toString());
                    wei6 = Float.parseFloat(weightText6.getText().toString());
                }

                if ((wei1 + wei2 + wei3 + wei4 + wei5 + wei6) != 0) {
                    float average = ((per1 * wei1) + (per2 * wei2) + (per3 * wei3)
                            + (per4 * wei4) + (per5 * wei5) + (per6 * wei6)) /
                            (wei1 + wei2 + wei3 + wei4 + wei5 + wei6);
                    errorText.setText("");
                    overallPer.setText(Float.toString(average));

                    if ((int) average >= 90) {
                        gpaText.setText("4.00");
                    } else if ((int) average >= 85) {
                        gpaText.setText("3.90");
                    } else if ((int) average >= 80) {
                        gpaText.setText("3.70");
                    } else if ((int) average >= 77) {
                        gpaText.setText("3.30");
                    } else if ((int) average >= 73) {
                        gpaText.setText("3.00");
                    } else if ((int) average >= 70) {
                        gpaText.setText("2.70");
                    } else if ((int) average >= 67) {
                        gpaText.setText("2.30");
                    } else if ((int) average >= 63) {
                        gpaText.setText("2.00");
                    } else if ((int) average >= 60) {
                        gpaText.setText("1.70");
                    } else if ((int) average >= 57) {
                        gpaText.setText("1.30");
                    } else if ((int) average >= 53) {
                        gpaText.setText("1.00");
                    } else if ((int) average >= 50) {
                        gpaText.setText("0.70");
                    } else {
                        gpaText.setText("0.00");
                    }

                } else {
                    errorText.setText("ERROR");
                }

            }
        });
    }

    public boolean stringCompare(String testString) {
        if (testString.compareTo("") == 0) {
            return true;
        } else {
            return false;
        }
    }
}
