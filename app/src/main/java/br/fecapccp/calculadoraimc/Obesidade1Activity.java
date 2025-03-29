package br.fecapccp.calculadoraimc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Obesidade1Activity extends AppCompatActivity {

    private TextView txtDados, txtMensagem;
    private ImageView imagem;
    private Button btnFechar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obesidade1);

        txtDados = findViewById(R.id.txtDados);
        txtMensagem = findViewById(R.id.txtMensagem);
        imagem = findViewById(R.id.imgResultado);
        btnFechar = findViewById(R.id.btnFechar);

        Intent intent = getIntent();
        double peso = intent.getDoubleExtra("peso", 0);
        double altura = intent.getDoubleExtra("altura", 0);
        double imc = intent.getDoubleExtra("imc", 0);

        String resultado = "Peso: " + peso + " kg\n" +
                "Altura: " + altura + " m\n" +
                "IMC: " + String.format("%.2f", imc) +
                "\nClassificação: Abaixo do Peso";

        txtDados.setText(resultado);
        txtMensagem.setText("Cada escolha saudável é um presente para você. Comece com calma!");
        imagem.setImageResource(R.drawable.obesidade_1);

        btnFechar.setOnClickListener(v -> finish());
    }
}
