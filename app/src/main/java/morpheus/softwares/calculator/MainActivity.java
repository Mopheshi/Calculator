package morpheus.softwares.calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView output;
    EditText input;
    Button one, two, three, four, five, six, seven, eight, nine, zero, plus, minus, times, divide, point, delete, clear, equals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.output);
        input = findViewById(R.id.input);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        times = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        point = findViewById(R.id.point);
        delete = findViewById(R.id.delete);
        clear = findViewById(R.id.clear);
        equals = findViewById(R.id.equals);

        one.setOnClickListener(view -> input.append(String.valueOf(one.getText()).trim()));
        two.setOnClickListener(view -> input.append(String.valueOf(two.getText()).trim()));
        three.setOnClickListener(view -> input.append(String.valueOf(three.getText()).trim()));
        four.setOnClickListener(view -> input.append(String.valueOf(four.getText()).trim()));
        five.setOnClickListener(view -> input.append(String.valueOf(five.getText()).trim()));
        six.setOnClickListener(view -> input.append(String.valueOf(six.getText()).trim()));
        seven.setOnClickListener(view -> input.append(String.valueOf(seven.getText()).trim()));
        eight.setOnClickListener(view -> input.append(String.valueOf(eight.getText()).trim()));
        nine.setOnClickListener(view -> input.append(String.valueOf(nine.getText()).trim()));
        zero.setOnClickListener(view -> input.append(String.valueOf(zero.getText()).trim()));
        plus.setOnClickListener(view -> input.append(String.valueOf(plus.getText()).trim()));
        minus.setOnClickListener(view -> input.append(String.valueOf(minus.getText()).trim()));
        times.setOnClickListener(view -> input.append(String.valueOf(times.getText()).trim()));
        divide.setOnClickListener(view -> input.append(String.valueOf(divide.getText()).trim()));
        point.setOnClickListener(view -> input.append(String.valueOf(point.getText()).trim()));
        delete.setOnClickListener(view -> {
            String operation = String.valueOf(input.getText()).trim();
            int i = operation.length();
            if (i > 0) input.setText(operation.substring(0, i - 1));
        });
        clear.setOnClickListener(view -> {
            output.setText(null);
            input.setText(null);
        });
        equals.setOnClickListener(view -> {

        });
    }
}