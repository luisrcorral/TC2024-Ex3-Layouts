package mx.tec.tc2024_ex3_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox myCheckbox = findViewById(R.id.checkBox);

        myCheckbox.isSelected();
    }
}