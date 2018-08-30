package e.valka.calculadora_trigonometrica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Calculadora extends AppCompatActivity {
    @BindView(R.id.sin) RadioButton sin;
    @BindView(R.id.cos) RadioButton cos;
    @BindView(R.id.tan) RadioButton tan;
    @BindView(R.id.cuarentacinco) RadioButton cuarentacinco;
    @BindView(R.id.noventa) RadioButton noventa;
    @BindView(R.id.cientochenta) RadioButton cientocho;
    @BindView(R.id.imagen) ImageView imagen;
    @BindView(R.id.resultado) TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        ButterKnife.bind(this);
        resultado.setText("Resultado: "+ 0.7071);
        imagen.setImageResource(R.drawable.cuarentacinco);

        cuarentacinco.setOnClickListener((view)->{
            imagen.setImageResource(R.drawable.cuarentacinco);
            if(sin.isChecked()){
                resultado.setText("Resultado: "+ 0.7071);
            }else if(cos.isChecked()){
                resultado.setText("Resultado: "+ 0.7071);
            }else{
                resultado.setText("Resultado: "+ 1.0);
            }
        });
        noventa.setOnClickListener((view)->{
            imagen.setImageResource(R.drawable.noventa);
            if(sin.isChecked()){
                resultado.setText("Resultado: "+ 1.0);
            }else if(cos.isChecked()){
                resultado.setText("Resultado: "+ 0);
            }else{
                resultado.setText("No existe");
            }
        });
        cientocho.setOnClickListener((view)->{
            imagen.setImageResource(R.drawable.cientochenta);
            if(sin.isChecked()){
                resultado.setText("Resultado: "+ 0.0);
            }else if(cos.isChecked()){
                resultado.setText("Resultado: "+ 1.0);
            }else{
                resultado.setText("Resultado: "+ 0.0);
            }
        });

        sin.setOnClickListener((view)->{
            if(cuarentacinco.isChecked()){
                resultado.setText("Resultado: "+ 0.7071);
            }else if(noventa.isChecked()){
                resultado.setText("Resultado: "+1.0);
            }else{
                resultado.setText("Resultado: "+0.0);
            }
        });
        cos.setOnClickListener((view)->{
            if(cuarentacinco.isChecked()){
                resultado.setText("Resultado: "+ 0.7071);
            }else if(noventa.isChecked()){
                resultado.setText("Resultado: "+0.0);
            }else{
                resultado.setText("Resultado: "+1.0);
            }
        });
        tan.setOnClickListener((view)->{
            if(cuarentacinco.isChecked()){
                resultado.setText("Resultado: "+ 1.0);
            }else if(noventa.isChecked()){
                resultado.setText("No existe.");
            }else{
                resultado.setText("Resultado: "+0.0);
            }
        });
    }
}
