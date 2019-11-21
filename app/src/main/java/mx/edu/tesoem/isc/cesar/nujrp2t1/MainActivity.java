package mx.edu.tesoem.isc.cesar.nujrp2t1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    RadioButton BSuma, Bresta, Bmultiplicacion, Bdivison;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BSuma = (RadioButton) findViewById(R.id.BSuma);
        Bresta = (RadioButton) findViewById(R.id.Bresta);
        Bmultiplicacion = (RadioButton) findViewById(R.id.Bmultiplicacion);
        Bdivison = (RadioButton) findViewById(R.id.Bdivision);
        result = (TextView) findViewById(R.id.Resultado);
    }

    public void operacion(View view) {
        if (BSuma.isChecked()) {
            EditText n1 = (EditText) findViewById(R.id.val1);
            EditText n2 = (EditText) findViewById(R.id.val2);
            double valor1 = Double.parseDouble(n1.getText().toString());
            double valor2 = Double.parseDouble(n2.getText().toString());

            double res = valor1 + valor2;
            result.setText("" + res);
        }
        if (Bresta.isChecked()) {
            EditText n1 = (EditText) findViewById(R.id.val1);
            EditText n2 = (EditText) findViewById(R.id.val2);
            double valor1 = Double.parseDouble(n1.getText().toString());
            double valor2 = Double.parseDouble(n2.getText().toString());

            double res = valor1 - valor2;
            result.setText("" + res);

        }
        if (Bmultiplicacion.isChecked()) {
            EditText n1 = (EditText) findViewById(R.id.val1);
            EditText n2 = (EditText) findViewById(R.id.val2);
            double valor1 = Double.parseDouble(n1.getText().toString());
            double valor2 = Double.parseDouble(n2.getText().toString());

            double res = valor1 * valor2;
            result.setText("" + res);

        }
        if (Bdivison.isChecked()) {
            EditText n1 = (EditText) findViewById(R.id.val1);
            EditText n2 = (EditText) findViewById(R.id.val2);
            double valor1 = Double.parseDouble(n1.getText().toString());
            double valor2 = Double.parseDouble(n2.getText().toString());

            double res = valor1 / valor2;
            result.setText("" + res);

        }
    }
}