package br.com.sinodalprado.calcularnotas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    private EditText nomeEditText;
    private EditText nota1EditText;
    private EditText nota2EditText;
    private EditText nota3EditText;
    private TextView resultadoTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.nomeEditText = (EditText) findViewById(R.id.nomeEditText);
        this.nota1EditText = (EditText) findViewById(R.id.nota1EditText);
        this.nota2EditText = (EditText) findViewById(R.id.nota2EditText);
        this.nota3EditText = (EditText) findViewById(R.id.nota3EditText);
        this.resultadoTextView = (TextView) findViewById(R.id.resultadoTextView);
    }

    public void calcularMedia(View v) {
        String nome = this.nomeEditText.getText().toString();
        double nota1 = Double.parseDouble(this.nota1EditText.getText().toString());
        double nota2 = Double.parseDouble(this.nota2EditText.getText().toString());
        double nota3 = Double.parseDouble(this.nota3EditText.getText().toString());

        double media = (nota1 + nota2 + nota3) / 3;

        String resultado = "Nome: " + nome + "\n" +
                "Nota 1: " + nota1 + "\n" +
                "Nota 2: " + nota2 + "\n" +
                "Nota 3: " + nota3 + "\n" +
                "Média: " + String.format("%.2f", media);

        this.resultadoTextView.setText(resultado);
    }
}