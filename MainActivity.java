package com.uca.examen_ericknava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton Respuesta1, Respuesta2, Respuesta3;
    Button Siguiente, Salir;
    TextView Pregunta, Numpregunta;
    int nota = 0; int Npregunta = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pregunta = findViewById(R.id.Pregunta);
        Numpregunta = findViewById(R.id.Numpregunta);

        Siguiente = findViewById(R.id.Siguiente);
        Salir = findViewById(R.id.Salir);

        Respuesta1 = findViewById(R.id.Respuesta1);
        Respuesta2 = findViewById(R.id.Respuesta2);
        Respuesta3 = findViewById(R.id.Respuesta3);

    }

    public void Siguiente(View vista) {
        if (Respuesta1.isChecked() == false && Respuesta2.isChecked() == false && Respuesta3.isChecked() == false) {
            Toast.makeText(this, "Elija una opción", Toast.LENGTH_SHORT).show();
        } else if (Npregunta == 1) {
            if (Respuesta1.isChecked()) {
                nota = nota + 1;
            }
            Npregunta = Npregunta + 1;
            Numpregunta.setText("Pregunta 2");
            Pregunta.setText("2- ¿Cuáles son las diferencias de atributos y métodos?");
            Respuesta1.setText("Los atributos son las características del objeto y los métodos son las acciones que realizara el objeto");
            Respuesta2.setText("Los métodos son las acciones que realizara el objeto y los atributos son las caracteristicas del objeto");
            Respuesta3.setText("Las acciones son métodos y las caracteristicas son atributos del objeto");

            Respuesta1.setChecked(false);
            Respuesta2.setChecked(false);
            Respuesta3.setChecked(false);
        }else if (Npregunta == 2){
            if (Respuesta2.isChecked()) {
                nota = nota + 1;
            }
            Npregunta = Npregunta + 1;
            Numpregunta.setText("Pregunta 3");
            Pregunta.setText("3-¿Qué es una clase?");
            Respuesta1.setText("Un salon");
            Respuesta2.setText("Un número ");
            Respuesta3.setText("Es la que define las características y funciones de objeto");

            Respuesta1.setChecked(false);
            Respuesta2.setChecked(false);
            Respuesta3.setChecked(false);
        }else if (Npregunta == 3){
            if (Respuesta3.isChecked()){
                nota = nota + 1;
            }
            Npregunta = Npregunta + 1;
            Numpregunta.setText("Pregunta 4");
            Pregunta.setText("4-Es el proceso de definir los atributos y los métodos de una clase");
            Respuesta1.setText("Polimorfismo");
            Respuesta2.setText("Abstracción");
            Respuesta3.setText("Herencia");

            Respuesta1.setChecked(false);
            Respuesta2.setChecked(false);
            Respuesta3.setChecked(false);
        }else if (Npregunta == 4){
            if (Respuesta2.isChecked()){
                nota = nota + 1;
            }
            Npregunta = Npregunta + 1;
            Numpregunta.setText("Pregunta 5");
            Pregunta.setText("5- Las clases hijo mantienen caracteristicas tales como atributos y métodos, otorgándole a las clases el derecgo del padre");
            Respuesta1.setText("Polimorfismo");
            Respuesta2.setText("Abstracción");
            Respuesta3.setText("Herencia");

            Respuesta1.setChecked(false);
            Respuesta2.setChecked(false);
            Respuesta3.setChecked(false);
        }else if (Npregunta == 5){
            if (Respuesta3.isChecked()){
                nota = nota + 1;
            }
            Npregunta = Npregunta + 1;
            Numpregunta.setText("Pregunta 6");
            Pregunta.setText("6-Protege la información de manipulaciones no autorizadas");
            Respuesta1.setText("Encapsulamiento");
            Respuesta2.setText("Herencia");
            Respuesta3.setText("Abstracción");

            Respuesta1.setChecked(false);
            Respuesta2.setChecked(false);
            Respuesta3.setChecked(false);
        }else if (Npregunta == 6){
            if (Respuesta1.isChecked()){
                nota = nota + 1;
            }
            Numpregunta.setText("Tu text: "+ nota);
            if (nota >= 6){
                Pregunta.setText("Exento");
            }else{
                Pregunta.setText("Reprobado");
            }
            Respuesta1.setVisibility(View.GONE);
            Respuesta2.setVisibility(View.GONE);
            Respuesta3.setVisibility(View.GONE);
            Siguiente.setVisibility(View.GONE);
        }
    }
    public void Salir (View vista){
        finish();
    }

        }

