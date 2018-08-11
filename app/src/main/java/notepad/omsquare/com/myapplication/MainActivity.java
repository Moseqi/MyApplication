package notepad.omsquare.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvHelloWorld;
    Button btClickMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvHelloWorld = findViewById(R.id.tvHelloWorld);
        btClickMe = findViewById(R.id.btClickMe);
        btClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeTestValue();
            }
        });
    }

    private void changeTestValue() {
        tvHelloWorld.setText("Hello Android");
    }

}
