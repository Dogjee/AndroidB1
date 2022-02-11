package com.example.b1_1_huynhdaithang_b1908416;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button btn_test, btn_exit;
    ImageButton imageButton;
    CheckBox checkBox_autoSave, checkBox_star;
    ImageView imageView1, imageView2;
    ToggleButton toggleButton;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_test = findViewById(R.id.btn_test);
        btn_exit = findViewById(R.id.btn_exit);
        imageButton = findViewById(R.id.ib);
        checkBox_autoSave = findViewById(R.id.cb_autosave);
        checkBox_star = findViewById(R.id.cb_star);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        imageView1 = findViewById(R.id.iv_1);
        imageView2 = findViewById(R.id.iv_2);
        toggleButton = findViewById(R.id.toggle);
        editText = findViewById(R.id.edt_1);
        textView = findViewById(R.id.tv_hienthi);


        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You have clicked the TEST button", Toast.LENGTH_SHORT).show();
            }
        });
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You have clicked the IMAGEBUTTON button", Toast.LENGTH_SHORT).show();
            }
        });
        checkBox_autoSave.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(MainActivity.this, "ChechBox is checked", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "ChechBox is unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox_star.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(MainActivity.this, "Star style ChechBox is checked", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Star style ChechBox is unchecked", Toast.LENGTH_SHORT).show();

                }
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.radio_1){
                    imageView1.setVisibility(View.VISIBLE);
                    imageView2.setVisibility(View.GONE);
                }
                if (i == R.id.radio_2){
                    imageView1.setVisibility(View.GONE);
                    imageView2.setVisibility(View.VISIBLE);
                }
            }
        });
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    textView.setText(editText.getText().toString());
                }
            }
        });
        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                finish();
                System.exit(0);
            }
        });
    }
    private  void commit(){

    }
}