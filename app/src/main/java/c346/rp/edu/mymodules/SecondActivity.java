package c346.rp.edu.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvModule;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvModule = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("code");
        String name = intentReceived.getStringExtra("name");
        int year = intentReceived.getIntExtra("year", 0);
        int sem = intentReceived.getIntExtra("sem", 0);
        int cred = intentReceived.getIntExtra("cred", 0);
        String location = intentReceived.getStringExtra("location");

        tvModule.setText("Module Code: " + code + "\nModule Name: " + name + "\nAcademic Year: " + year + "\nSemester: " + sem + "\nModule Credit: " + cred + "\nVenue: " + location);
    }
}
