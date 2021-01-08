package com.example.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

    private CheckBox checkVerde, checkBranco, checkVermelho;

    private RadioButton sexoMasculino , sexoFeminino;
    private RadioGroup opcaoSexo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome       = findViewById(R.id.editNome);  //Campo nome, do tipo EditText
        textoResultado  = findViewById(R.id.textResultado); //Campo resultado, do tipo Textview
        campoEmail      = findViewById(R.id.editEmail);

        //Checkbox
        checkVerde      = findViewById(R.id.checkVerde);
        checkBranco     = findViewById(R.id.checkBranco);
        checkVermelho   = findViewById(R.id.checkVermelho);

        //Radiobutton
        sexoFeminino    = findViewById(R.id.radioButtonFeminino);
        sexoMasculino   = findViewById(R.id.radioButtonMasculino);
        opcaoSexo       = findViewById(R.id.radioGroupSexo);

        radioButton();
    }

    public void radioButton(){

        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.radioButtonMasculino){
                    textoResultado.setText("Masculino");
                }else if(checkedId == R.id.radioButtonFeminino){
                    textoResultado.setText("Feminino");
                }
            }
        });
        /*
       if( sexoMasculino.isChecked() ){
           textoResultado.setText("Masculino");
        }else if( sexoFeminino.isChecked() ){
           textoResultado.setText("Feminino");
       }

         */



    }

    public void enviar(View view){

        //radioButton();
        //checkBox();
        /*
        String email = campoEmail.getText().toString();
        String nome = campoNome.getText().toString();
        textoResultado.setText( "nome: " + nome + " email: " + email); // Pega o nome retirado do campo nome e escreve no textView resultado

         */
    }
    public void checkBox(){

        String texto = "";
        if(checkVerde.isChecked()){
            //String corSelecionada = checkVerde.getText().toString();
            //texto = corSelecionada;
            texto = "Verde selecionado";
        }

        if(checkBranco.isChecked()){
            texto = texto + "Branco selecionado";
        }

        if(checkVermelho.isChecked()){
            texto =  texto + "Vermelho selecionado";
        }



        textoResultado.setText( texto);
    }
    public void limpar(View view){

        campoNome.setText("");
        campoEmail.setText("");

    }
}