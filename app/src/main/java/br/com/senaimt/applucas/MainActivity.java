package br.com.senaimt.applucas;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView lbl_Nome;
    TextView lbl_Email;
    TextView lbl_Numero;
    Button getBtn_Cadastrar;

    EditText txt_Nome;
    EditText txt_Telefone;
    EditText txt_Email;
    Button btn_Cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_Nome = findViewById(R.id.txt_Nome);
        txt_Telefone = findViewById(R.id.txt_Telefone);
        txt_Email = findViewById(R.id.txt_Email);
        btn_Cadastrar = findViewById(R.id.btn_Cadastrar);
        txt_Nome.setText("Digite seu nome: ");

        btn_Cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Funcionou", "Deu certo");
                Toast msg = Toast.makeText( MainActivity.this, "Sucesso", Toast.LENGTH_LONG);
                msg.show();

                AlertDialog.Builder builder = new AlertDialog.Builder( MainActivity.this);
                AlertDialog dialog = builder.setTitle("Operação")
                                                    .setMessage("Sucesso")
                                                    .setNeutralButton("Ok", null)
                                                    .create();
                dialog.show();
            }
        });
        
    }
}