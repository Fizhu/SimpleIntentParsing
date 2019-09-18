package fizhu.boiler.intentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

public class BetaActivity extends AppCompatActivity {
    Toolbar tb;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beta);

        tb = findViewById(R.id.tb);
        tb.setTitle("Beta");
        setSupportActionBar(tb);

        String data = getIntent().getStringExtra("DATA");

        textView = findViewById(R.id.tv);
        textView.setText(data);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
