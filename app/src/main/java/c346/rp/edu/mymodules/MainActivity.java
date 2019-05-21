package c346.rp.edu.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvModule1;
    TextView tvModule2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvModule1 = findViewById(R.id.module1);
        tvModule2 = findViewById(R.id.module2);

        tvModule1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), SecondActivity.class);
                intent.putExtra("code", "C346");
                intent.putExtra("name", "Android Programming");
                intent.putExtra("year", 2018);
                intent.putExtra("sem", 1);
                intent.putExtra("cred", 4);
                intent.putExtra("location", "W66M");
                startActivity(intent);
            }
        });

        tvModule2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), ThirdActivity.class);
                intent.putExtra("code", "C349");
                intent.putExtra("name", "iPad Programming");
                intent.putExtra("year", 2018);
                intent.putExtra("sem", 1);
                intent.putExtra("cred", 4);
                intent.putExtra("location", "W66M");
                startActivity(intent);
            }
        });
    }
}
