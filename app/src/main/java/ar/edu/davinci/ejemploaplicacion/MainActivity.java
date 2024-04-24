package ar.edu.davinci.ejemploaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tirarDato(View view) {
        double aleatorio = Math.random() * 6 + 1;
        int numeroDato = (int) aleatorio;
        Log.i("tirar-datos", "Ganaste" + numeroDato);
        LinearLayout resultados = findViewById(R.id.resultados);
        TextView resultado = new TextView(this);
        resultado.setText(R.string.text_win);
        resultados.addView(resultado);
    }
}