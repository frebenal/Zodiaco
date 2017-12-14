package com.example.frederickgarcia.zodiaco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main_4 extends AppCompatActivity {
    String signo;
    String fecha;
    TextView nombre ;
    ImageView foto;
    TextView descr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_4);

        Bundle bundle=getIntent().getExtras();
        signo=bundle.getString("signo");
        fecha=bundle.getString("fecha");
        if(fecha==null){
            Toast.makeText(getApplicationContext(), " El signo seleccionado es " + signo, Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(getApplicationContext(), "Para el  " + fecha, Toast.LENGTH_SHORT).show();
            Toast.makeText(getApplicationContext(), " Signo es " + signo, Toast.LENGTH_SHORT).show();
        }

        nombre = (TextView)findViewById(R.id.nombresigno);
        descr = (TextView)findViewById(R.id.descripcion);
        foto = (ImageView)findViewById(R.id.logo);

        switch (signo){
            case "Capricornio":
                nombre.setText("Capricornio");
                descr.setText("CAPRICORNIO\n" +
                        "\n" +
                        "Noviembre del 2017\n" +
                        "\n" +
                        "Tendrás que trabajar duro para que tus jefes te valoren, pero pronto recibirás una recompensa que hará que todo el esfuerzo haya merecido la pena. No te sientas mal, todos tus compañeros no tienen la misma suerte que tú. Ellos están haciendo su camino, y tú el tuyo. \n" +
                        "\n" +
                        "");
                foto.setImageResource(R.drawable.capricornio);
                break;

            case "Acuario":
                nombre.setText("Acuario");
                descr.setText("ACUARIO\n" +
                        "\n" +
                        "Noviembre del 2017\n" +
                        "\n" +
                        "Un proyecto al que le has dedicado mucho tiempo en últimos meses está a punto de terminar, pero aún así tendrás que seguir trabajando con empeño para que nada ni nadie pueda arrebatarte lo que es tuyo. Aprovecha toda la buena energía que desprendes para algo positivo.\n" +
                        "\n" +
                        "");
                foto.setImageResource(R.drawable.acuario);
                break;

            case "Piscis":
                nombre.setText("Piscis");
                descr.setText("PISCIS\n" +
                        "\n" +
                        "Noviembre del 2017\n" +
                        "\n" +
                        "Últimamente vas derrochando gastos y es hora de que seas más precavido con tus finanzas. Tus ingresos siguen siendo buenos, pero puede venir una racha de incertidumbre para la que te vendría muy bien estar preparado. Simplemente evita lo innecesario.\n" +
                        "\n" +
                        "");
                foto.setImageResource(R.drawable.piscis);
                break;

            case "Aries":
                nombre.setText("Aries");
                descr.setText("ARIES\n" +
                        "\n" +
                        "Noviembre del 2017\n" +
                        "\n" +
                        "Hoy atraerás con tu poderosa energía a todas las personas con las que te cruces, pero tú solo te fijarás en una de ellas. Aprovecha ese flujo poderoso para dar nuevos pasos que te lleven a una nueva realidad. No frenes la corriente de la vida: úsala para impulsarte aún más.\n" +
                        "\n" +
                        "");
                foto.setImageResource(R.drawable.aries);
                break;

            case "Tauro":
                nombre.setText("Tauro");
                descr.setText("TAURO\n" +
                        "\n" +
                        "Noviembre del 2017\n" +
                        "\n" +
                        "Un problema familiar que viene de lejos se agravará y no tienes mucha capacidad de maniobra para solucionarlo. Confía en las personas que están involucradas y déjalas actuar. Tú tendrás que ocuparte de algo que realmente solo te incumbe a ti.\n" +
                        "\n" +
                        "");
                foto.setImageResource(R.drawable.tauro);
                break;

            case "Geminis":
                nombre.setText("Geminis");
                descr.setText("GEMINIS\n" +
                        "\n" +
                        "Noviembre del 2017\n" +
                        "\n" +
                        "En los próximos días tendrás que darlo todo para sacar adelante un proyecto nuevo que está resultando enriquecedor para ti, pero también un verdadero reto. Aprovecha hoy para tomarte las cosas con calma y así irás reuniendo fuerzas para lo que viene: las vas a necesitar.\n" +
                        "\n" +
                        "");
                foto.setImageResource(R.drawable.geminis);
                break;

            case "Cancer":
                nombre.setText("Cancer");
                descr.setText("CANCER\n" +
                        "\n" +
                        "Noviembre del 2017\n" +
                        "\n" +
                        "El hecho de que estés en una etapa muy positiva en lo laboral no quiere decir que puedas relajarte precisamente ahora. Conviene que mantengas el nivel de exigencia que estás teniendo para que así alcances las nuevas metas que te has fijado. Todo va a ir bien si te sigues esforzando.\n" +
                        "\n" +
                        "");
                foto.setImageResource(R.drawable.cancer);
                break;

            case "Leo":
                nombre.setText("Leo");
                descr.setText("LEO\n" +
                        "\n" +
                        "Noviembre del 2017\n" +
                        "\n" +
                        "En un viaje muy cercano en el tiempo que paradójicamente no te apetece mucho descubrirás nuevas formas de gozar de la vida. Además harás nuevos amigos que tendrán ideas muy diferentes a las que tenías hasta ahora. Será toda una aventura: no te vayas a echar atrás.\n" +
                        "\n" +
                        "");
                foto.setImageResource(R.drawable.leo);
                break;

            case "Virgo":
                nombre.setText("Virgo");
                descr.setText("VIRGO\n" +
                        "\n" +
                        "Noviembre del 2017\n" +
                        "\n" +
                        "Escucharás ciertos rumores que afectan a varias personas de tu entorno y en un principio te afectarán. No hagas caso: se tratará de simples falacias que no debes creerte. Lo mejor es que no prestes atención nada más que a los comentarios constructivos. Sé fiel a quienes quieres.\n" +
                        "\n" +
                        "");
                foto.setImageResource(R.drawable.virgo);
                break;

            case "Libra":
                nombre.setText("Libra");
                descr.setText("LIBRA\n" +
                        "\n" +
                        "Noviembre del 2017\n" +
                        "\n" +
                        "En el aspecto económico las cosas marchan mejor que nunca, pero aún así no te permites realizar ciertos gastos o comprar algo por miedo a que te falte en el futuro. Se trata de un miedo muy arraigado que viene de lejos, tal vez de la familia. Libérate de esos temores que ya no te sirven.\n" +
                        "\n" +
                        "");
                foto.setImageResource(R.drawable.libra);
                break;

            case "Escorpio":
                nombre.setText("Escorpio");
                descr.setText("ESCORPIO\n" +
                        "\n" +
                        "Noviembre del 2017\n" +
                        "\n" +
                        "Tu actitud ante la vida a veces, sobre todo últimamente, es demasiado infantil. Colócate en el estado adulto y no hagas caso a caprichos de tu ego que te quitan felicidad y plenitud y arruinan algunas de tus relaciones personales. Céntrate en el presente y disfruta.\n" +
                        "\n" +
                        "");
                foto.setImageResource(R.drawable.escorpio);
                break;

            case "Sagitario":
                nombre.setText("Sagitario");
                descr.setText("SAGITARIO\n" +
                        "\n" +
                        "Noviembre del 2017\n" +
                        "\n" +
                        "Ten en cuenta, a la hora de hablar y de actuar, que tu pareja estará hoy más sensible de lo normal. Podrían saltar chispas, pero todo irá bien si no tocas temas delicados que sabes que le afectan especialmente. Sé especialmente cuidadoso con todo lo que digas.\n" +
                        "\n" +
                        "");
                foto.setImageResource(R.drawable.sagitario);
                break;
        }


    }
}
