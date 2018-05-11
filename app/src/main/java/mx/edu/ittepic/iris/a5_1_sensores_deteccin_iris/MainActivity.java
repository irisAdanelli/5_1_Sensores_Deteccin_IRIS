package mx.edu.ittepic.iris.a5_1_sensores_deteccin_iris;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SensorManager sensorManager;
    TextView textView = null;
    Float max, min, power;
    RecyclerView recycler;
    AdapterDato adapter;
    List<DataProvider> listDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listDatos = new ArrayList<>();

        recycler=findViewById(R.id.recyclerview);

        //recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));


        //textView = (TextView)findViewById(R.id.idDato);

        sensorManager = (SensorManager)this.getSystemService(SENSOR_SERVICE);
        //listDatos=new ArrayList<String>();
        List<Sensor> lista = sensorManager.getSensorList(Sensor.TYPE_ALL);
        StringBuilder data = new StringBuilder();

        recycler.setHasFixedSize(true);

        recycler.setLayoutManager(new LinearLayoutManager(this));


        for(int i=1; i<lista.size(); i++){

            listDatos.add(new DataProvider(
                    "Nombre    :"+ lista.get(i).getName(),
                    "Fabricante:"+lista.get(i).getVendor(),
                    "Version:"+lista.get(i).getVersion(),
                    "Rango maximo:"+lista.get(i).getMaximumRange(),
                    "Retraso minimo:"+lista.get(i).getMinDelay(),
                    "Potencia:"+lista.get(i).getPower()+ "\n\n\n"));



            /*data.append("Nombre :"+lista.get(i).getName() + "\n");
            data.append("Fabricante:"+lista.get(i).getVendor() + "\n");
            data.append("Maximo Rango: "+lista.get(i).getMaximumRange()+"\n");
            data.append("Minimo Delay: "+lista.get(i).getMinDelay()+"\n");
            data.append("Poder: "+lista.get(i).getPower()+"\n");
            data.append("Version :"+lista.get(i).getVersion() + "\n\n");*/
        }
        //textView.setText(data);

        adapter = new AdapterDato(this,listDatos);
        recycler.setAdapter(adapter);

    }
}