package fizhu.boiler.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button a,b,c;

//    Data yang akan dikirim
    String data1 = "BACOD ";
    String data2 = "LO ";
    String data3 = "UBAN !";
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Cast view tiap item ke layout
        a = findViewById(R.id.alpha);
        b = findViewById(R.id.beta);
        c = findViewById(R.id.charlie);
        textView = findViewById(R.id.data);

//        Men set textview dengan variable yang berisi data
        textView.setText(data1 + data2 + data3);

//        Menambahkan fungsi onClick pada tombol
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == a) {

//            Pemanggilan fungsi Intent dengan fungsi kirimData() dengan parameter tujuan
            kirimData(AlphaActivity.class);
        }
        if (v == b) {
            kirimData(BetaActivity.class);
        }
        if (v == c) {
            kirimData(CharlieActivity.class);
        }
    }

//    Fungsi untuk pengiriman data melalui Intent dengan parameter class tujuan
    private void kirimData(Class tujuan) {


//        Proses Intent
        Intent i = new Intent(MainActivity.this,tujuan);
//        Meletakkan data yang akan dikirim dalam name DATA dengan putExtra
        i.putExtra("DATA", data1 + data2 + data3);
        startActivity(i);
    }
}
