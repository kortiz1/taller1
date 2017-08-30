package com.example.root.taller1;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    private TextView v_x_und;
    private TextView result;
    private EditText cant;
    private Spinner materiales;
    private Spinner dijes;
    private Spinner tipos;
    private Spinner monedas;
    private String op[];
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        v_x_und = (TextView)findViewById(R.id.lblResultado1);
        result = (TextView)findViewById(R.id.lblResultado);
        cant = (EditText)findViewById(R.id.TxtCant);


        materiales = (Spinner) findViewById(R.id.cmbMaterial);
        resources = this.getResources();
        op = resources.getStringArray(R.array.materiales);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, op);
        materiales.setAdapter(adapter);
        
        dijes = (Spinner) findViewById(R.id.cmbDije);
        op = resources.getStringArray(R.array.dijes);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, op);
        dijes.setAdapter(adapter1);

        tipos = (Spinner) findViewById(R.id.cmbTipo);
        op = resources.getStringArray(R.array.tipos);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, op);
        tipos.setAdapter(adapter2);

        monedas = (Spinner) findViewById(R.id.cmbMoneda);
        op = resources.getStringArray(R.array.monedas);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, op);
        monedas.setAdapter(adapter3);

    }

// LA SECUENCIA DE CASOS SEGUN LA TABLA DE REFERENCIA VA EN EL SIGUIENTE ORDEN: CASO #: (8,4,1,2,3,5,6,7,9,10,11 Y 12) //
    // LOS CONDICIONALES PRIMERAMENTE ESTAN CONFIGURADO CON LA MONEDA DE PESOS COLOMBIANOS Y DESPUES CON DOLARES (USD) //

    public void Calcular(View v) {
        int p = 0, opcion1, opcion2, opcion3, opcion4;
        double resultado = 0;
        result.setText("");
        if (Validar()) {

            opcion1 = materiales.getSelectedItemPosition();
            opcion2 = dijes.getSelectedItemPosition();
            opcion3 = tipos.getSelectedItemPosition();
            opcion4 = monedas.getSelectedItemPosition();

            if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 0) && (opcion4 == 0)) {

                p = 0;

            } else if((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 1 || opcion3 == 2) && (opcion4 == 0)){

                p = 1;

            } else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 1 || opcion3 == 2) && (opcion4 == 0)) {

                p = 2;

            }
              else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 0) && (opcion4 == 0)) {

                p = 3;

            }
             else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 3) && (opcion4 == 0)) {

                p = 4;

            } else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 0) && (opcion4 == 0)) {

                p = 5;

            }
              else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 3) && (opcion4 == 0)) {

                p = 6;

            }
              else if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 1 || opcion3 == 2) && (opcion4 == 0)) {

                p = 7;

            }
              else if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 3) && (opcion4 == 0)) {

                p = 8;

            }
              else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 1 || opcion3 == 2) && (opcion4 == 0)) {

                p = 9;

            }
              else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 0) && (opcion4 == 0)) {

                p = 10;

            }
              else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 3) && (opcion4 == 0)) {

                p = 11;

            } else if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 0) && (opcion4 == 1)) {

                p = 12;

            } else if((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 1 || opcion3 == 2) && (opcion4 == 1)){

                p = 13;

            } else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 1 || opcion3 == 2) && (opcion4 == 1)) {

                p = 14;

            }
            else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 0) && (opcion4 == 1)) {

                p = 15;

            }
            else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 3) && (opcion4 == 1)) {

                p = 16;

            } else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 0) && (opcion4 == 1)) {

                p = 17;

            }
            else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 3) && (opcion4 == 1)) {

                p = 18;

            }
            else if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 1 || opcion3 == 2) && (opcion4 == 1)) {

                p = 19;

            }
            else if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 3) && (opcion4 == 1)) {

                p = 20;

            }
            else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 1 || opcion3 == 2) && (opcion4 == 1)) {

                p = 21;

            }
            else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 0) && (opcion4 == 1)) {

                p = 22;

            }
            else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 3) && (opcion4 == 1)) {

                p = 23;

            }
                switch (p) {

                    case 0:
                        resultado = ((3200 * 70) * Integer.parseInt(cant.getText().toString()));
                        v_x_und.setText("224 MIL PESOS");
                        break;

                    case 1:
                        resultado = ((3200 * 120) * Integer.parseInt(cant.getText().toString()));
                        v_x_und.setText("384 MIL PESOS");
                        break;

                    case 2:
                        resultado = ((3200 * 100) * Integer.parseInt(cant.getText().toString()));
                        v_x_und.setText("320 MIL PESOS");
                        break;

                    case 3:
                        resultado = ((3200 * 80) * Integer.parseInt(cant.getText().toString()));
                        v_x_und.setText("256 MIL PESOS");
                        break;

                    case 4:
                        resultado = ((3200 * 70) * Integer.parseInt(cant.getText().toString()));
                        v_x_und.setText("224 MIL PESOS");
                        break;

                    case 5:
                        resultado = ((3200 * 100) * Integer.parseInt(cant.getText().toString()));
                        v_x_und.setText("320 MIL PESOS");
                        break;

                    case 6:
                        resultado = ((3200 * 90) * Integer.parseInt(cant.getText().toString()));
                        v_x_und.setText("288 MIL PESOS");
                        break;

                    case 7:
                        resultado = ((3200 * 90) * Integer.parseInt(cant.getText().toString()));
                        v_x_und.setText("288 MIL PESOS");
                        break;

                    case 8:
                        resultado = ((3200 * 50) * Integer.parseInt(cant.getText().toString()));
                        v_x_und.setText("160 MIL PESOS");
                        break;

                    case 9:
                        resultado = ((3200 * 110) * Integer.parseInt(cant.getText().toString()));
                        v_x_und.setText("352 MIL PESOS");
                        break;

                    case 10:
                        resultado = ((3200 * 90) * Integer.parseInt(cant.getText().toString()));
                        v_x_und.setText("288 MIL PESOS");
                        break;

                    case 11:
                        resultado = ((3200 * 80) * Integer.parseInt(cant.getText().toString()));
                        v_x_und.setText("256 MIL PESOS");
                        break;

                    case 12:
                        resultado = ((70) * Integer.parseInt(cant.getText().toString()));
                        v_x_und.setText("70 USD");
                        break;

                    case 13:
                        resultado = ((120) * Integer.parseInt(cant.getText().toString()));
                        v_x_und.setText("120 USD");
                        break;

                    case 14:
                        resultado = ((100) * Integer.parseInt(cant.getText().toString()));
                        v_x_und.setText("100 USD");
                        break;

                    case 15:
                        resultado = ((80) * Integer.parseInt(cant.getText().toString()));
                        v_x_und.setText("80 USD");
                        break;

                    case 16:
                        resultado = ((70) * Integer.parseInt(cant.getText().toString()));
                        v_x_und.setText("70 USD");
                        break;

                    case 17:
                        resultado = ((100) * Integer.parseInt(cant.getText().toString()));
                        v_x_und.setText("100 USD");
                        break;

                    case 18:
                        resultado = ((90) * Integer.parseInt(cant.getText().toString()));
                        v_x_und.setText("90 USD");
                        break;

                    case 19:
                        resultado = ((90) * Integer.parseInt(cant.getText().toString()));
                        v_x_und.setText("90 USD");
                        break;

                    case 20:
                        resultado = ((50) * Integer.parseInt(cant.getText().toString()));
                        v_x_und.setText("50 USD");
                        break;

                    case 21:
                        resultado = ((110) * Integer.parseInt(cant.getText().toString()));
                        v_x_und.setText("110 USD");
                        break;

                    case 22:
                        resultado = ((90) * Integer.parseInt(cant.getText().toString()));
                        v_x_und.setText("90 USD");
                        break;

                    case 23:
                        resultado = ((80) * Integer.parseInt(cant.getText().toString()));
                        v_x_und.setText("80 USD");
                        break;

                }


                result.setText("" + String.format("%.2f", resultado));

        }
    }



    public void Borrar (View v) {

        v_x_und.setText("");
        result.setText("");
        cant.setText("");
        materiales.setSelection(0);
        dijes.setSelection(0);
        tipos.setSelection(0);
        monedas.setSelection(0);
        cant.requestFocus();

    }


    public boolean Validar(){

        int opcion4;
        opcion4 = monedas.getSelectedItemPosition();

        if(cant.getText().toString().isEmpty() && (opcion4 == 0)){
            cant.setError("DIGITE UN VALOR");
            return false;
        }

        else if(cant.getText().toString().isEmpty() && (opcion4 == 1)){

            Toast.makeText(this,resources.getString(R.string.error_eng),Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }

}
