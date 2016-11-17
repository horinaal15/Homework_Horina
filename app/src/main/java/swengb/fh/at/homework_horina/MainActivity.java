package swengb.fh.at.homework_horina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultView;
    private EditText editText1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultView = (TextView) findViewById(R.id.textViewResult);
        editText1 = (EditText) findViewById(R.id.editTextNumber1);
    }

    public void calcYen(View view) {

        String num1String = editText1.getText().toString();

        double num1 = 0;
        double result = 0;

        try {
            num1 = Double.parseDouble(num1String);
            result = num1*116.7475;
            resultView.setText(num1String+ " * " + "116.7475" + " = " + result);
        } catch (NumberFormatException e) {
            resultView.setText("Wrong Input!!!!");

            e.printStackTrace();
        }
    }


    public void showAbout(View view) {
        Intent intent = new Intent(this,DisplayAboutActivity.class);
        String message = resultView.getText().toString();
        intent.putExtra("resultofCalc", message); // dont use Strings there
        startActivity(intent);
    }

}
