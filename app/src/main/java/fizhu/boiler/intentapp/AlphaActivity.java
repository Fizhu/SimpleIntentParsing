package fizhu.boiler.intentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

public class AlphaActivity extends AppCompatActivity {
    Toolbar tb;
    TextView textView;
    MainActivity mainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha);

//        Memasukkan data dari MainActivity ke variable String data melalui getIntent
        String data = getIntent().getStringExtra("DATA");

//        Men set text pada textView dengan data dari MainActivity
        textView = findViewById(R.id.tv);
        textView.setText(data);

//        Mengatur Toolbar
        tb = findViewById(R.id.tb);
        tb.setTitle("Alpha");
        setSupportActionBar(tb);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

//    Fungsi untuk tombol back pada toolbar
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
