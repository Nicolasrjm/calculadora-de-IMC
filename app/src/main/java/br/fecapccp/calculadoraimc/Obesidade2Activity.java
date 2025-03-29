package br.fecapccp.calculadoraimc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Obesidade2Activity extends AppCompatActivity {

    private TextView txtDados, txtMensagem;
    private ImageView imagem;
    private Button btnFechar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obesidade2);

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
                "\nClassificação: Obesidade2";

        txtDados.setText(resultado);
        txtMensagem.setText("orça e amor por você mesma(o). Seu corpo merece saúde e respeito ");
        imagem.setImageResource(R.drawable.obesidade_2);

        btnFechar.setOnClickListener(v -> finish());
    }
}
